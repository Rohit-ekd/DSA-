

// public class SumOfDiagonal {
//     public static void main(String [] args){
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(0);
//         list.add(0);
//         list.add(0);
//         list.add(0);
//         list.add(0);
//         list.add(0);
//         System.out.println(list.size());
        
//     }
// }

import java.util.ArrayList;
import java.util.Collections;

public class SumOfDiagonal {

    public static ArrayList<Integer> countingSort(ArrayList<Integer> arr) {
        // Find the maximum value in the array to determine the range of the counting array
        int max = Collections.max(arr);
        
        // Create a counting array with size equal to the maximum value + 1
        int[] count = new int[max + 1];

        // Initialize the counting array
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }

        // Count each element in the original array
        for (int i = 0; i < arr.size(); i++) {
            count[arr.get(i)]++;
        }

        // Modify the counting array by adding the previous counts (cumulative count)
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Create the output array of the same size as the original array
        ArrayList<Integer> output = new ArrayList<>(Collections.nCopies(arr.size(), 0));

        // Build the output array
        // for (int i = arr.size() - 1; i >= 0; i--) {
        //     int element = arr.get(i);
        //     output.set(count[element] - 1, element);
        //     count[element]--;
        // }

        for(int i=0 ; i<arr.size();i++){
            output.add(count[i]);
        }

        return output;
    }

    public static void main(String[] args) {
        // Example usage of the countingSort method
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(2);
        arr.add(2);
        arr.add(8);
        arr.add(3);
        arr.add(3);
        arr.add(1);

        System.out.println("Original ArrayList: " + arr);
        
        ArrayList<Integer> sortedArr = countingSort(arr);
        
        System.out.println("Sorted ArrayList: " + sortedArr);
    }
}

