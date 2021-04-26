package Stack;

import java.util.*;

public class StackUsingCollections {

    public static void main(String[] args) {
        //all operations are O(1)
        //Stack<Integer> stack = new Stack<Integer>();
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.peek());
        System.out.println(stack.poll());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
    }
}
