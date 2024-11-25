// different sorting techniques are used to sort an array into descending order
class SortTec {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void descBubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // selection sort

    public static void descSelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int small = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[small] < arr[j]) {
                    small = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }
    }

    // insertion sort

    public static void descInsertionSort(int [] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;       
         }
    }

    //counting sort
    public static void descCountingSort(int [] arr){
        int n= arr.length;
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        int m = count.length;
        for(int i = 0;i<n;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=m-1;i>=0;i--){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 1 };
        descCountingSort(arr);
        print(arr);
    }
}