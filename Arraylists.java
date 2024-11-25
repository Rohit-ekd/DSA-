import java.util.ArrayList;
import java.util.Collections;
public class Arraylists{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
        //add element into an arraylist
        list.add(2);
        list.add(3);
        list.add(9);
        System.out.println(list);

        list.add(1,5);
        System.out.println(list);

        // find size of an Array List
        System.out.println(list.size());

        // get an arraylist element at any index
        int n =list.get(2);
        System.out.println(n);

        // Remove or delete element 
        list.remove(3);
        System.out.println(list);


        //sort an arraylist using collection class framework
        Collections.sort(list);
        System.out.println(list);

        //traverse
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}