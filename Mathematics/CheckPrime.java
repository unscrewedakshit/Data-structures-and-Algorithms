package mathematics;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(isPrimeByNaive(75));
        System.out.println(isPrimeOptimized(110));
    }

    private static boolean isPrimeByNaive(int number) { //Time Complexity : O(N)
        if(number == 1) return false;
        for(int i=2; i<number; i++) {
            if(number % i == 0)
                return false;
        }
        return true;
    }

    private static boolean isPrimeOptimized(int number) { //Time Complexity : O(sqrt(N))
        if(number == 1) return false;
        if(number % 2 == 0) return true;
        if(number % 3 == 0) return true;
        for(int i=5; i*i<number; i=i+6) {
            if(number % i == 0  || number % (i+2) == 0) {
                return  false;
            }
        }
        return true;
    }
}
