package Queue;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyQueue {
    private Node front;
    private Node rear;

    public void enqueue(int element) {
        Node temp = new Node(element);
        if(isEmpty()) {
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
    }

    public int dequeue() {
        if(isEmpty()) return Integer.MIN_VALUE;
        int element = front.data;
        front = front.next;
        return element;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public int getFront() {
        if(isEmpty()) return Integer.MIN_VALUE;
        return front.data;
    }

    public int getRear() {
        if(isEmpty()) return Integer.MIN_VALUE;
        return rear.data;
    }
}

public class LinkedListImplementationOfQueue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        while(!queue.isEmpty()) {
            System.out.println(queue.dequeue() + " ");
        }
    }
}
