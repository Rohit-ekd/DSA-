public class StackImplementUsingLinkedList{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

   public static class Stack{
    public static Node head;
    public static boolean isEmpty(){
        return head==null;
    }
    // insert element in the stack on top
    public static void stackPush(int data){
        
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    // Delete element on the top of stack
    public static int stackPop(){
        if(isEmpty()){
            return -1;
        }
        Node top = head;
        head = head.next;
       return top.data;
    }

    //get element at the top of the stack
    public static int stackPeek(){
        if(isEmpty()){
            return -1;
        }
        Node top = head;
        return top.data;
    }
   }

    public static void main(String[] args) {
        Stack list = new Stack();
        list.stackPush(1);
        list.stackPush(2);
        list.stackPush(3);
        list.stackPush(4);

        while(!list.isEmpty()){
            System.out.println(list.stackPeek());
            list.stackPop();
        }
    }
}