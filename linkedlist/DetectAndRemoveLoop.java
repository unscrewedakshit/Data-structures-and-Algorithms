package linkedlist;

public class DetectAndRemoveLoop {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next = new Node(15);
        head.next.next.next.next = new Node(25);
        head.next.next.next.next.next = head.next.next;

        head = detectAndRemoveLoop(head);

        printLinkedList(head);

    }

    private static Node detectAndRemoveLoop(Node head) {
        Node slow=head, fast=head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        if(slow != fast) return head; // No loop found

        slow = head;
        while(slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
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
