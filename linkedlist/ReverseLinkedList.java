package linkedlist;

import java.util.ArrayList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = reverseRecursive(head, null);

        printLinkedList(head);

    }

    private  static Node reverse(Node head) { //Time Complexity: O(N), Auxiliary Space: O(1)
        if(head == null || head.next == null) return head;

        Node current = head;
        Node previous = null;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    private static Node reverseRecursive(Node head) {
        if(head == null || head.next == null) return head;

        Node restHead = reverseRecursive(head.next);
        Node restTail = head.next;
        restTail.next = head;
        head.next = null;
        return restHead;
    }

    private static Node reverseRecursive(Node current, Node previous) {
        if(current == null) return previous;
        Node next = current.next;
        current.next = previous;
        return reverseRecursive(next, current);
    }


    private static Node reverseNaive(Node head) { //Time Complexity: O(N), Auxiliary Space: O(N)
        if(head == null || head.next == null) return head;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(Node current=head; current != null; current = current.next) {
            list.add(current.data);
        }

        for(Node current=head; current != null; current = current.next) {
            current.data = list.remove(list.size() - 1);
        }

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
