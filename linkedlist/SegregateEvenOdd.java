package linkedlist;

public class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SegregateEvenOdd {
    public static void main(String[] args) {
        Node head = new Node(17);
        head.next = new Node(15);
        head.next.next = new Node(8);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(4);

        head = segregateEvenOdd(head);

        printLinkedList(head);
    }

    private static Node segregateEvenOdd(Node head) {
        Node evenStart=null, evenEnd=null, oddStart=null, oddEnd=null;

        for(Node current=head; current!=null; current=current.next) {
            int data = current.data;

            if(data % 2 == 0) {
                if(evenStart == null) {
                    evenStart=current;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = current;
                    evenEnd = evenEnd.next;
                }
            } else {
                if(oddStart == null) {
                    oddStart = current;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = current;
                    oddEnd = oddEnd.next;
                }
            }

        }
        if(oddStart == null || evenStart == null) return head; //if list contains only all odd or even elements
        evenEnd.next = oddStart;
        oddEnd.next = null;
        return evenStart;
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
