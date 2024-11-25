public class DeleteNodeFromEnd{
    private int size;
    DeleteNodeFromEnd(){
        size = 0;
    }
    public int getSize(){
        return size;
    }
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void insertNode(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next = newNode;
    }


    //delete at end position

    public void deleteNode(int position){
        int p = size-position;
        if(head == null){
            System.out.println("List is already empty");
            return;
        }
        --size;
        if(position ==1){
            Node secondLast = head;
            Node lastNode = head.next;
            while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
            }
            secondLast.next = null;
            return;
        }  
        if(size>position){
            Node prevNode = head;
            for(int i=1;i<p;i++){
                prevNode=prevNode.next;
            }
            prevNode.next = prevNode.next.next;
            prevNode.next.next = null;
        }
        
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String [] args){
        DeleteNodeFromEnd list = new DeleteNodeFromEnd();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.printList();


        System.out.println(list.getSize());

        list.deleteNode(3);
        list.printList();
        System.out.println(list.getSize());

    }
}