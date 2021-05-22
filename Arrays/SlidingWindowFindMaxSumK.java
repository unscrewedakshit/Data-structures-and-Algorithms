package arrays;

public class SlidingWindowFindMaxSumK {
    public static void main(String[] args) {
        int[] arr = {1,8,30,-5,20,7};
        int[] arr2 = {5,-10,6,90,30};
        int k = 3;
        System.out.println(getMaxSumEfficient(arr,k));
    }

    private static int getMaxSumEfficient(int[] arr, int k) { //Time Complexity: O(N)
        int maxSum = 0;
        for(int i=0; i<k; i++) {
            maxSum = maxSum + arr[i];
        }
        int nextSum = maxSum;
        for(int i=k; i< arr.length; i++) {
             nextSum = nextSum + arr[i] - arr[i-k];
             maxSum = Math.max(nextSum,maxSum);
        }
        return maxSum;
    }
    private static int getMaxSumNaive(int[] arr, int k) { //Time Complexity: O((N-K)*K)
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<=arr.length-k; i++) {
            int sum = 0;
            for(int j=i; j<i+k; j++) {
                sum = sum + arr[j];
            }
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
