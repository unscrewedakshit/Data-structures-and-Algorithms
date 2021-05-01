package recursion;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        int N = 5;
        System.out.println(sum(1));
        System.out.println(sumTailRecursion(5, 0));
    }

    private static int sum(int N) {
        if(N == 0) return 0;
        return N + sum(N-1);
    }

    private static int sumTailRecursion(int N, int K) {
        if(N == 0) return K;
        return sumTailRecursion(N-1, K+N);
    }
}
