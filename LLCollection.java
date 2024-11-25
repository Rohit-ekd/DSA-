import java.util.*;
public class LLCollection {
    public static void main(String [] args){
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Rohit");
        list.addFirst("you");
        list.addFirst("Are");
        list.addLast("Varshney?");
        System.out.println(list);
        for(String var : list){
            System.out.print(var + " ");
        }
    }
}
