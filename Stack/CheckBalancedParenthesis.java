package stack;

import java.util.ArrayDeque;

//Given an pattern of parenthesis we need to check if the pattern in balanced or not ie parenthesis open last should close first and so on. 

public class CheckBalancedParenthesis {

    public static void main(String[] args) { //Sample driver code
        String str = "{([])})";

        System.out.println(checkBalanced(str));
    }

    private static boolean checkBalanced(String str) {    //Time Complexity: O(N), Auxiliary Space: O(N)
        ArrayDeque<Character> stack = new ArrayDeque<Character>();

        for(int i=0; i<str.length(); i++) {
            char x = str.charAt(i);
            if(x =='(' || x =='{' || x =='[') {
                stack.push(x);
            }
            else {
                if (stack.isEmpty()) return false;
                else if (!matching(stack.peek(), x)) {
                    System.out.println(stack.peek() + " " + x);
                    return false;
                }
                else stack.pop();
            }
        }
        return (stack.isEmpty());
    }

    private static boolean matching(char a, char b) {
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }
}
