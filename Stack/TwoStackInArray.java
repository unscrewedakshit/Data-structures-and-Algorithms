package Stack;

//Naive method is two divide array into two exact half but this may lead to space wastage.
class TwoStacks {
    private int top1, top2, capacity;
    private  int[] arr;

    TwoStacks(int cap) {
        arr = new int[cap];
        capacity = cap;
        top1 = -1;
        top2 = cap;
    }

    public void push1(int element) {
        if(top1 < top2 - 1) {
            top1++;
            arr[top1] = element;

        }
    }

    public void push2(int element) {
        if(top1 < top2 - 1) {
            top2--;
            arr[top2] = element;
        }
    }

    public int pop1() {
        if(top1 >= 0) {
            int element = arr[top1];
            top1--;
            return element;
        }
        return Integer.MIN_VALUE;
    }

    public int pop2() {
        if(top2 < capacity) {
            int element = arr[top2];
            top2++;
            return element;
        }
        return Integer.MIN_VALUE;
    }

    public int peek1() {
        if(top1 >= 0 ) return arr[top1];
        else return Integer.MIN_VALUE;
    }

    public int peek2() {
        if(top2 < capacity) return arr[top2];
        else return Integer.MIN_VALUE;
    }
}


public class TwoStackInArray {

    public static void main(String[] args) {
        TwoStacks stack = new TwoStacks(10);

        stack.push1(10);
        stack.push1(20);
        stack.push1(30);
        stack.push1(40);

        stack.push2(100);
        stack.push2(200);
        stack.push2(300);
        stack.push2(400);

        System.out.println(stack.peek1());
        System.out.println(stack.peek2());

    }
}
