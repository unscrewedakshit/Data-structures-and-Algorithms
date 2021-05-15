package arrays;

import java.util.Arrays;

public class MaximumCircularSubarraySum {
    public static void main(String[] args) {
        int[] array = {5,-2,3,4};
        System.out.println(maxSumEfficient(array));
    }

    private static int maxSumEfficient(int[] arr) { //Time Complexity: O(N)
        int maxSubArraySum = normalMaxSubArraySum(arr);
        if(maxSubArraySum < 0) return maxSubArraySum;
        int minSubArraySum = normalMinSubArraySum(arr);
        int arraySum = 0;
        for(int i=0; i<arr.length; i++) arraySum = arraySum + arr[i];
        int maxCircularSum = arraySum - minSubArraySum;

        return Math.max(maxSubArraySum,maxCircularSum);
    }

    private static int normalMaxSubArraySum(int[] arr) {
        int result = arr[0]; int maxSum = arr[0];
        for(int i=1; i<arr.length; i++) {
            maxSum = Math.max(arr[i],arr[i] + maxSum);
            result = Math.max(result,maxSum);
        }
        return result;
    }

    private static int normalMinSubArraySum(int[] arr) {
        int result = arr[0]; int minSum = arr[0];
        for(int i=1; i<arr.length; i++) {
            minSum = Math.min(arr[i], arr[i] + minSum);
            result = Math.min(result,minSum);
        }
        return result;
    }

    private static int maxSumNaive(int[] arr) { //Time Complexity: O(N^2)
        int result = arr[0];
        for(int i=0; i<arr.length; i++) {
            int currentMax = arr[i];
            int currentSum = arr[i];
            for(int j=1; j<arr.length; j++) {
                int index = (i+j) % arr.length;
                currentSum = currentSum + arr[index];
                currentMax = Math.max(currentMax,currentSum);
            }
            result = Math.max(result,currentMax);
        }
        return result;
    }
}
