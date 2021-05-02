package dp;

import java.util.Arrays;

public class FibonacciMemoization {
    private static int[] memo;

    private static int fib(int n) { //Time Complexity: O(N)
        if(memo[n] == -1) {   //sub problem solution is not already computed
            int result;

            if(n == 0 || n == 1) return n;
            else result = fib(n-1) + fib(n-2);

            memo[n] = result; //store the calculated result of sub-problem in memo array
        }
        return memo[n];  //return the solution as it is already calculated and stored in the memo array
    }

    public static void main(String[] args) {
        int n = 5;
        memo = new int[n+1];

        Arrays.fill(memo,-1);

        System.out.println(fib(n));
    }
}
