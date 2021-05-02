package dp;

public class FibonacciTabulation {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(6));
    }

    private static int fib(int n) { //Time Complexity: O(N), Auxiliary Space: O(N)
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        if(n == 0 || n == 1) return arr[n];
        for(int i=2; i<=n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}
