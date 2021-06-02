package mathematics;

public class DivisorsOfNumber {
    public static void main(String[] args) {
        printDivisorsOptimized(30);
    }

    private static void printDivisorsOptimized(int number) { //Time Complexity : Theta(sqrt(N)) , sorted order
        int i;
        for(i=1; i*i<number; i++) {
            if(number % i == 0)
                System.out.print(i + " ");
        }
        for( i=(int)Math.sqrt(number); i>=1; i--) {
            if(number % i == 0)
                System.out.print(number/i + " ");
        }
    }

    private static void printDivisorsEfficient(int number) {//Time Complexity : Theta(sqrt(N))
        for(int i=1; i*i<=number; i++) {
            if(number % i == 0) {
                System.out.print(i + " ");
                if(i != number/i) {
                    System.out.print(number/i + " ");
                }
            }
        }
    }

    private static void printDivisorsNaive(int number) { //Time Complexity : Theta(N) , Space Complexity : Theta(1)
        for(int i=1; i<=number; i++) {
            if(number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
