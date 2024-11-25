public class LinkedListss {
    // Find the size of Linked List
    private int size;

    LinkedListss() {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    // create a Node
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert a linked list node at First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Insert Linked list node at the Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Insert element at mid
    public void addMid(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        int i = 0;
        while (i < (size / 2) - 1) {
            currNode = currNode.next;
            i++;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    // Delete node at the first
    public void deleteFirst() {
        size--;
        if (head == null) {
            System.out.println("Sorry! Node is not be delete due to List is Empty!");
            return;
        }
        head = head.next;
    }

    // delete node at the end
    public void deleteLast() {
        size--;
        if (head == null) {
            System.out.println("Sorry! Node is not be delete due to List is Empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // Reverse Linked list using Iterative approach
    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // Reverse a linked list using Recursive approach
    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next);

        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // Print the List
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

    public static void main(String[] args) {
        LinkedListss list = new LinkedListss();
        list.addFirst(5);
        list.addLast(7);
        list.addFirst(3);
        list.addFirst(2);
        list.addLast(9);
        list.addFirst(1);
        // list.printList();
        // list.addMid(0);
        // list.printList();

        // list.deleteFirst();
        // list.deleteLast();

        list.printList();
        // System.out.println("\n"+list.getSize());

        list.head =  list.reverseRecursive(list.head);
        list.printList();
    }
}