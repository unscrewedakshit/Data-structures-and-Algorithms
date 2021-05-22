package arrays;
//Given an unsorted array of non-negative integers. Find if there is a subArray with given sum.
public class SlidingWindowSumArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,7,5};
        int sum = 15;
        System.out.println(findSum(array,sum));
    }

    private static boolean findSum(int[] arr, int sum) { //Time Complexity: O(N)
        int currentSum = arr[0], start = 0, i=0;
        for(i=1; i<=arr.length; i++) {
            while(currentSum > sum && start < i - 1) {
                currentSum = currentSum - arr[start];
                start++;
            }
            if(currentSum == sum) {
                System.out.println(start + " " + i);
                return true;
            }
            if(i < arr.length) {
                currentSum = currentSum + arr[i];
            }
        }
        System.out.println("No subarray found");
        return false;
    }

    int subArraySum(int arr[], int n, int sum)
    {
        int curr_sum = arr[0], start = 0, i;

        // Pick a starting point
        for (i = 1; i <= n; i++)
        {
            // If curr_sum exceeds the sum, then remove the starting elements
            while (curr_sum > sum && start < i-1)
            {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            // If curr_sum becomes equal to sum, then return true
            if (curr_sum == sum)
            {
                int p = i-1;
                System.out.println("Sum found between indexes " + start
                        + " and " + p);
                return 1;
            }

            // Add this element to curr_sum
            if (i < n)
                curr_sum = curr_sum + arr[i];
        }
        System.out.println("No subarray found");
        return 0;
    }
}
