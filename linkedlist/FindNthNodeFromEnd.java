package linkedlist;
//Given an linked list , we need to find the nth node from the end of linked list
//eg: 10->5->20->15->25->35, n=5 then Output is 5
public class FindNthNodeFromEnd {
    public static void main(String[] args) { //Example driver code
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next = new Node(15);
        head.next.next.next.next = new Node(25);
        head.next.next.next.next.next = new Node(35);

        findNthNode(head,5);
    }

    private static void findNthNode(Node head, int n) { //Time Complexity: O(N) and single traversal
        if(head == null) return;
        Node fast = head;
        for(int i=0; i<n; i++) {
            if(fast == null) return;
            fast = fast.next;
        }

        Node slow = head;
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println(slow.data);
    }

    private static void findNthNodeNaive(Node head, int n) { //Time Complexity: O(N) but require two traversals
        int count = 0;
        Node current = head;
        while(current != null) {
            count++;
            current = current.next;
        }

        if(count < n) return;
        current = head;
        for(int i=1; i< count - n + 1; i++) {
            current = current.next;
        }
        System.out.println(current.data);
    }
}
