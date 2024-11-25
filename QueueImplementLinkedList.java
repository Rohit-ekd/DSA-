class QueueImplementLinkedList{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class Queues{
        static Node head = null;
        static Node tail = null;
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        public static void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;

        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty!!");
                return -1;
            }

            int front = head.data;

            if(head == tail){
                tail = null;
            }
            head = head.next;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty!!");
                return -1;
            }

            return head.data;
        }
        public static void display(){
            if(isEmpty()){
                System.err.println("is Empty");
            }
            Node curr = head;
            while(curr!=null){
                System.out.print(curr.data + "->");
                curr = curr.next;
            }
            System.out.println("Null");
        }
    }
    public static void main(String[] args) {
        Queues q = new Queues();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
       System.out.println( q.remove());
       System.out.println( q.remove());
       q.display();
       System.out.println( q.peek());
       q.display();
       

    }
}