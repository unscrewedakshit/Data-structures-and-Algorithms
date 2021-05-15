package Arrays;

import java.util.Arrays;

public class MaximumSumSubarray {
    public static void main(String[] args) {
        int[] arr = {-5,1,-2,3,-1,2,-2};
        int[] arr2 = {5,8,3};
        System.out.println(maximumSumEfficient(arr));
    }

    private static int maximumSumEfficient(int[] arr) { //Time Complexity: O(N)
        int result = arr[0];
        int maxSum = arr[0];
        for(int i=1; i<arr.length; i++) {
            maxSum = Math.max(maxSum + arr[i], arr[i]);
            result = Math.max(maxSum,result);
        }
        return result;
    }

    private static int maximumSumNaive(int[] arr) { //Time Complexity: O(N^2)
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            for(int j=i; j<arr.length; j++) {
                sum =sum + arr[j];
                maxSum = Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }
}
