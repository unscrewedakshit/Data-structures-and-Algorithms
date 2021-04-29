package queue;

import java.util.LinkedList;
import java.util.Queue;

class Stack {
    private Queue<Integer> queue1 = new LinkedList<Integer>();
    private Queue<Integer> queue2 = new LinkedList<Integer>();

    public void push(int element) {
        while (!queue1.isEmpty()) {
            queue2.add(queue1.peek());
            queue1.poll();
        }

        queue1.offer(element);

        while(!queue2.isEmpty()) {
            queue1.offer(queue2.peek());
            queue2.poll();
        }
    }

    public int pop() {
        if(queue1.isEmpty()) return Integer.MIN_VALUE;
        return queue1.poll();
    }

    public int size() {
        return queue1.size();
    }

    public int top() {
        if(queue1.isEmpty()) return Integer.MIN_VALUE;
        return queue1.peek();
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}

public class ImplementStackUsingQueue {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
