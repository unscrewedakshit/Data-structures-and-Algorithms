package linkedlist;

import java.util.HashSet;

class Node { 
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectLoop {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next = new Node(15);
        head.next.next.next.next = new Node(25);
        head.next.next.next.next.next = head.next.next;

        System.out.println(detectLoop(head));

    }

    //best and most efficient way to detect loop(Flyod cycle detection)
    private static boolean detectLoop(Node head) { //Time Complexity: O(N), Auxiliary: O(1)
        if(head == null || head.next == null) return false;
        if(head.next == head) return true;

        Node slow=head, fast=head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }

    private static boolean detectLoopHashing(Node head) {
        HashSet<Node> hs = new HashSet<Node>();
        for(Node current=head; current != null; current=current.next) {
            if(hs.contains(current)) return true;
            hs.add(current);
        }
        return false;
    }

    private static boolean detectLoopEfficient(Node head) { //Time Complexity: O(N), Auxiliary Space: O(1) , but modifies the linked list structure
        if(head == null) return false;
        if(head.next == head) return true;

        Node current = head;
        Node temp = new Node(-1);
        while(current != null) {
            if(current.next == null) {
                return false;
            }
            if(current.next == temp) {
                return true;
            }
            Node t = current.next;
            current.next = temp;
            current = t;
        }
        return false;
    }

    private static boolean detectLoopNaive(Node head) { //Time Complexity: O(N^2), Auxiliary Space: O(1)
        if(head == null) return false;
        if(head.next == head) return true;

        Node current = head;
        while(current.next != null) {

            for(Node temp=head; temp != current; temp= temp.next) {
                if(current.next == temp) {
                    return true;
                }
            }
            current = current.next;
        }
        return false;
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
