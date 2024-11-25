public class LinkedListPalindrome {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }



    //find middle or first half end using hare and turle approach where turtle take one step and hare take two step
    public Node findMiddle(Node head){
        Node hare = head;
        Node turtle = head;
        while(hare.next!=null && hare.next.next!=null){
            hare= hare.next.next; // jump two forward
            turtle = turtle.next; //jump one step forward
        }
        return turtle;  // middle Node of a list
    }

    // reverse second half
    public Node reverseSecondHalf(Node newHead){
        Node prev = null;
        Node curr = newHead;
        while(curr!=null){
            Node nextNode = curr.next;
            curr.next=prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    //check it is palindrome or not

    public boolean isPalindrome(){
        if(head == null || head.next==null){
            return true;
        }

        Node firstHalfEnd = findMiddle(head); //middle
        Node secondHalfStart = reverseSecondHalf(firstHalfEnd.next);

        Node firstHalfStart = head;
        while(secondHalfStart!=null){
            if(firstHalfStart.data!=secondHalfStart.data){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedListPalindrome list = new LinkedListPalindrome();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.printList();

        System.out.println(list.isPalindrome());
    }
}
