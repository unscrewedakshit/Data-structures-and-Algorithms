package linkedList;
//Given a sorted linked-list we need to insert the given element such that after insertion the linked-list remains sorted
//eg: 10->20->30->40, element =25, then Output should be 10->20->25->30->40
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertIntoSortedLinkedList {
    public static void main(String[] args) { //example driver code
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = sortedInsert(head, 100);
        head = sortedInsert(head, 90);
        head = sortedInsert(head, 5);
        printLinkedList(head);

    }

    private static Node sortedInsert(Node head, int element) {
        Node temp = new Node(element);
        if(head == null) {
           return temp;
        }
        if(element < head.data) {
            temp.next = head;
            head = temp;
            return head;
        }
        Node current = head;
        while(current.next != null) {
            if(current.next.data >= element) {
                temp.next = current.next;
                current.next = temp;
                return head;
            }
            current = current.next;
        }
        current.next = temp;
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
