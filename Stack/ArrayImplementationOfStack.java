package Stack;


class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    Stack(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    public void push(int element) {
        if(top == capacity-1) return;
        top++;
        arr[top] = element;
    }

    public int pop() {
        if(top == -1) return -1;
        int element = arr[top];
        top--;
        return element;
    }

    public int peek() {
        if(top == -1) return -1;
        else return arr[top];
    }

    public int size() {
        return top+1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

}


public class ArrayImplementationOfStack {

    public static void main(String[] args) { //Sample Driver code
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);


        System.out.println(stack.peek());
        System.out.println(stack.size());

        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
  
}
