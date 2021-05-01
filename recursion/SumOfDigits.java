package recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;

        System.out.println(sum(number));
    }

    private static int sum(int number) {
        if(number == 0) return 0;
        return (number % 10 + sum(number/10));
    }
}
