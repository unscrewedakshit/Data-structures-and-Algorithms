package linkedlist;
//Given an Linked-List we need to find/print the middle element of the linkedlist. If there are two middle then print the right middle element.

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next = new Node(15);
        head.next.next.next.next = new Node(25);
        head.next.next.next.next.next = new Node(35);
        middleElement(head);
    }

    private static void middleElement(Node head) { //Time Complexity: O(N) and single traversal
        if(head == null) return;
        if(head.next == null) {
            System.out.println(head.data);
            return;
        }
        if(head.next.next == null) {
            System.out.println(head.next.data);
            return;
        }
        Node slow = head, fast = head;
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
            if(fast.next !=null) {
                fast = fast.next;
            } else {
                break;
            }
        }
        System.out.println(slow.data);
    }

    private static void middleElementNaive(Node head) {   //Time Complexity: O(N) but two traversals required
        if(head == null) return;
        if(head.next == null) {
            System.out.println(head.data);
            return;
        }
        int count = 0;
        Node current = head;
        while(current != null) {
            count++;
            current = current.next;
        }
        current = head;
        int position = count / 2 + 1;
        for(int i=1; i<=position - 1; i++) {
            current = current.next;
        }
        System.out.println(current.data);
    }
}
