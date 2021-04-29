package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingCollections {

    public static void main(String[] args) {
        //Queue<Integer> queue = new LinkedList<Integer>(); 
        // or
        Queue<Integer> queue = new ArrayDeque<Integer>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println("Size of queue : " + queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek()); //Show first item
        System.out.println(queue.poll()); //Removes the first item and returns it

    }
}
