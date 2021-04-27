package Queue;

class Queue {
    private int size;
    private int capacity;
    private int[] arr;

    Queue(int cap) {
        capacity = cap;
        size = 0;
        arr = new int[capacity];
    }

    public void enqueue(int element) { //Time Complexity: O(1)
        if(isFull()) return;
        arr[size] = element;
        size++;
    }

    public void dequeue() { //Time Complexity: O(N)
        if(isEmpty()) return;
        for(int i=0; i<size-1; i++) {
            arr[i] = arr[i+1];
        }
        size--;
    }

    public int getFront() { //Time Complexity: O(1)
        if(isEmpty()) return Integer.MIN_VALUE;
        return arr[0];
    }

    public int getRear() { //Time Complexity: O(1)
        if(isEmpty()) return Integer.MIN_VALUE;
        return arr[size-1];
    }

    public boolean isFull() { //Time Complexity: O(1)
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}


public class ArrayImplementationOfQueue {

    public static void main(String[] args) { //Sample driver code
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.dequeue();

        System.out.println(queue.getFront());
    }
}
