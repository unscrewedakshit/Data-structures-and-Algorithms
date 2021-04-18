package doubltLinkedList;

class Node {
    int data;
    Node next;
    Node prev;
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedListImplementation {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;

        head = insertAtBeginning(head,5);
        head = insertAtEnd(head,60);

        //head = reverseDLL(head);
        head = deleteLastNode(head);
        head = deleteLastNode(head);

        print(head);

    }

    private static Node insertAtBeginning(Node head, int element) {
        Node temp = new Node(element);
        if(head == null) return temp;
        temp.next = head;
        head.prev = temp;
        head = temp;
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
        temp.prev = current;
        return head;
    }

    private static Node reverseDLL(Node head) {
        if(head == null || head.next == null) return head; //to handle empty or one node DLL
        Node current = head;
        Node prev = null;
        while(current != null) {
            prev = current.prev;
            current.prev = current.next;
            current.next = prev;
            current = current.prev;
        }
        return prev.prev;
    }

    private static Node deleteHead(Node head) {
        if(head == null || head.next == null) return null;
        head = head.next;
        head.prev = null;
        return head;
    }

    private static Node deleteLastNode(Node head) {
        if(head == null || head.next == null) return null;
        Node current = head;
        while(current.next.next != null) {
            current = current.next;
        }
        current.next.prev = null;
        current.next = null;
        return head;
    }

    private static void print(Node head) {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
