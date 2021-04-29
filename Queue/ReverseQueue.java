package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {


    private static void reverseQueue(Queue<Integer> queue) {
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        while(!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
    }

    private static void reverseRecursive(Queue<Integer> queue) {
        if(queue.isEmpty()) return;
        int element = queue.peek();
        queue.poll();
        reverseRecursive(queue);
        queue.offer(element);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("-------------------Before Reversing-----------------");
        for(Integer q: queue) {
            System.out.print(q + " ");
        }
        System.out.println();

        //reverseQueue(queue);
        reverseRecursive(queue);

        System.out.println("------------------After Reversing--------------------");
        for(Integer q: queue) {
            System.out.print(q + " ");
        }

    }

}
