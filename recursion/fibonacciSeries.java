package recursion;

public class fibonacciSeries {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibo(n));
    }

    private static int fibo(int number) {
        if(number <= 1) return number;
        return fibo(number - 1) + fibo(number - 2);
    }
}
