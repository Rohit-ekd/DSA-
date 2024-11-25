public class QueueImplementUsingArray{
    public static class Queues{
        static int [] arr;
        static int rear;
        static int size;
        Queues(int n){
            this.size = n;
            rear =-1;
            arr = new int[size];
        }
        public static boolean isEmpty(){
            return rear ==-1;
        }
        public static boolean isFull(){
            return rear == size-1;
        }
        //Enqueue
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue Overflow!");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        //Dequeue

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }
        public static void traverse(){
            for(int i=0;i<=rear ;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queues a = new Queues(5);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.traverse();
        System.out.println(a.remove());
        a.traverse();
        System.out.println(a.peek());
    }
}