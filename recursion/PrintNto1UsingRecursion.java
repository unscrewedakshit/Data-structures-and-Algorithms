package recursion;

public class PrintNto1UsingRecursion {
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }

    private static void print(int n) {
        if(n == 0) return;
        System.out.print(n + " ");
        print(n-1);
    }
}
