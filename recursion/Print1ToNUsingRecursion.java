package recursion;

public class Print1ToNUsingRecursion {
    public static void main(String[] args) {
        int n=10;

        print(n);
    }

    private static void print(int n) {
        if(n == 0) return;
        print(n-1);
        System.out.print(n + " ");
    }
}
