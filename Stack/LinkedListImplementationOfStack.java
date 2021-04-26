package stack;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

class Stack {
    Node head;
    int size;
    Stack() {
        head = null;
        size = 0;
    }

    public void push(int element) {
        Node temp = new Node(element);
        size++;
        temp.next = head;
        head = temp;
    }

    public int pop() {
        if(head == null) return Integer.MIN_VALUE;
        int element = head.data;
        head = head.next;
        size--;
        return element;
    }

    public int peek() {
        if(head == null) return Integer.MIN_VALUE;
        int element = head.data;
        return element;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }


}

public class LinkedListImplementationOfStack {
    public static void main(String[] args) { //Sample Driver Code
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());


    }
}
