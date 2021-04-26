package Stack;

import java.util.ArrayList;

class MyStack {
    private ArrayList<Integer> list = new ArrayList<Integer>();

    public void push(int element) {
        list.add(element);
    }

    public int pop() {
        if(list.isEmpty()) return -1;
        int element = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return element;
    }

    public int peek() {
        if(list.isEmpty()) return -1;
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}


public class ArrayListImplementationOfStack {

    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

}
