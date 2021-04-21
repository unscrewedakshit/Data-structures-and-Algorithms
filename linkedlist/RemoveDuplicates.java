package linkedlist;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {
        Node head = new Node(20);
        head.next = new Node(20);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(30);
        head.next.next.next.next.next = new Node(30);
        head.next.next.next.next.next.next = new Node(40);

        head = removeDuplicates(head);
        printLinkedList(head);
    }

    private static Node removeDuplicates(Node head) { //Time Complexity: O(N), Auxiliary Space: O(1)
        if(head == null || head.next == null) return head;
        Node current = head.next;
        Node previous = head;

        while (current != null) {
            if(current.data != previous.data) {
                previous.next = current;
                previous = current;

            }
            current = current.next;
        }
        previous.next = null;
        return head;
    }

    private static void printLinkedList(Node head) {
        Node current = head;
        System.out.println("--------------Linked List------------");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
