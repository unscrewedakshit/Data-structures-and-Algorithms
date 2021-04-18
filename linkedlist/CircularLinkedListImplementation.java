package circularLinkedList;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedListImplementation {
    public static void main(String[] args) { 
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;


        //head = insertAtBeginning(head, 5);
        //head = insertAtBeginning(head, 0);

        head = insertAtEnd(head, 60);
        head = insertAtEnd(head, 70);
        head = insertAtEnd(head, 80);

        //head = deleteHead(head);
        //head = deleteHead(head);

        head = deleteKthNode(head, 4);

        print(head);

    }

    private static Node insertAtBeginning(Node head, int element) {
        Node temp = new Node(element);
        if(head == null) {
            temp.next = temp;
            return temp;
        }
        Node current = head;
        while(current.next != head) current = current.next;
        current.next = temp;
        temp.next = head;
        head = temp;
        return head;
    }

    private static  Node insertAtEnd(Node head, int element) { //Time Complexity: O(1), Auxiliary Space: O(1)
        Node temp = new Node(element);
        if(head == null) {
            temp.next = temp;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;
        int t = head.data;
        head.data = temp.data;
        temp.data = t;
        head = head.next;
        return head;
    }

    private static Node insertAtEndNaive(Node head, int element) { //Time Complexity: O(N), Auxiliary Space: O(1)
        Node temp = new Node(element);
        if(head == null) {
            temp.next = temp;
            return temp;
        }
        Node current = head;
        while(current.next != head) {
            current = current.next;
        }
        current.next = temp;
        temp.next = head;
        return head;
    }

    private static Node deleteHead(Node head) { //Time Complexity: O(1), Auxiliary Space: O(1)
        if(head == null || head.next == head) return null;
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    private static Node deleteKthNode(Node head, int position) {
        if(position == 1) {
            head = deleteHead(head);
            return head;
        }
        Node current = head;
        for(int i=1; i<=position-2; i++ ) {
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }

    private static Node deleteHeadNaive(Node head) { //Time Complexity: O(N), Auxiliary Space: O(1)
        if(head == null || head.next == head) return null;
        Node current = head;
        head = head.next;
        while(current.next != head) current = current.next;
        current.next = head;
        return  head;
    }

    private static void print(Node head) {
        if(head == null) return;
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while(current != head);
    }
  
}
