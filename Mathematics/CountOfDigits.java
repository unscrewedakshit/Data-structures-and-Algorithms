package mathematics;

public class CountOfDigits {
    public static void main(String[] args) {
        System.out.println(countOfDigitsByNaive(12345));
        System.out.println(countOfDigitsByRecursion(123456));
        System.out.println(countOfDigitsEfficient(123456789));
    }

    private static  int countOfDigitsEfficient(int number) { //Time Complexity : O(1)
        return (int)(Math.log10(number) + 1);
    }

    private static int countOfDigitsByNaive(int number) { //Time Complexity : O(Digits)
        int count = 0;
        while(number != 0) {
            count++;
            number = number / 10;
        }
        return  count;
    }

    private static int countOfDigitsByRecursion(int number) {  //Time Complexity : O(Digits), Space Complexity : O(N)
        if(number == 0)  return  0;
        else return  1 + countOfDigitsByRecursion(number/10);
    }
}
