package linkedList;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListImplementation {
    public static void main(String[] args) { //Driver function 
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

//        head = insertAtBeginning(head, 0);
//        head = insertAtBeginning(head, 5);
//
//        head = insertAtEnd(head, 50);
//        head = insertAtEnd(head, 60);

//        head = deleteLastNode(head);
//        head = deleteLastNode(head);
//        head = deleteLastNode(head);
//        head = deleteLastNode(head);

        head = insertAtPosition(head,65,3);
        System.out.println(search(head, 65));
        printLinkedList(head);
        //printLinkedListRecursive(head);
    }

    private static Node insertAtBeginning(Node head, int element) {
        Node temp = new Node(element);
        temp.next = head;
        head = temp;
        return head;
    }

    private static Node insertAtPosition(Node head, int element, int position) {
        Node temp = new Node(element);
        Node current = head;
        if(position == 1) {
            temp.next = head;
            head = temp;
            return head;
        }
        for(int i=1; i<position-1 && current != null; i++) {
            current = current.next;
        }
        if(current == null) return head; //if the specified position is out of bounds of linked list length
        temp.next = current.next;
        current.next = temp;
        return head;
    }

    private static Node insertAtEnd(Node head, int element) {
        Node temp = new Node(element);
        if(head == null) return temp;
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = temp;
        return head;
    }

    private static int search(Node head, int element) { //Time Complexity: O(N), Auxiliary Space: O(1)
        Node current = head;
        int count = 1;
        while(current != null) {
            if(current.data == element) return count;
            current = current.next;
            count++;
        }
        return -1;
    }

    private static int searchRecursive(Node head, int element) { //Time Complexity: O(N), Auxiliary Space: O(N)
        if(head == null) return -1;
        if(head.data == element) return 1;
        else {
            int res = searchRecursive(head.next, element);
            if(res == -1) return -1;
            else return res+1;
        }
    }

    private static Node deleteFirstNode(Node head) {
        if(head == null) return null;
        head = head.next;
        return head;
    }

    private static Node deleteLastNode(Node head) {
        if(head == null) return null;
        if(head.next == null) return null;
        Node current = head;
        while(current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return head;
    }

    private static void printLinkedList(Node head) { //Time Complexity: O(N), Auxiliary Space: O(1)
        Node current = head;
        System.out.println("--------------Linked List------------");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    private static void printLinkedListRecursive(Node head) { //Time Complexity: O(N), Auxiliary space: O(N)
        if(head == null) return;
        System.out.print(head.data + " ");
        printLinkedListRecursive(head.next);
    }
}
