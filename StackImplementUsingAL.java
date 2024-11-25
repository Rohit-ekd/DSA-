import java.util.*;
public class StackImplementUsingAL {
    public static class stack{
        ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty(){
            return list.size()==0;
        }

        public void push(int data){
            list.add(data);
        }
        
        public int pop(){
            if(isEmpty())
                return -1;
            int top = list.remove(list.size()-1);
            return top;
        }

        public int peek(){
            if(isEmpty())
                return -1;
            int top = list.get(list.size()-1);
            return top;
        }
    }
    public static void main(String [] args){
        stack obj = new stack();
        obj.push(1);
        obj.push(2);
        obj.push(9);
        obj.push(4);

        while(!obj.isEmpty()){
            System.out.println(obj.peek());
            obj.pop();
        }
    }
}
