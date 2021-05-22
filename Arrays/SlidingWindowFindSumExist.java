package arrays;

public class SlidingWindowFindSumExist {
    public static void main(String[] args) {
        int[] arr = {1,8,30,-5,20,7};
        int sum=46; int k=3;
        System.out.println(checkSum(arr,k,sum));
    }

    private static boolean checkSum(int[] arr, int k, int sum) { //Time Complexity: O(N)
        int nextSum = 0;
        for(int i=0; i<k; i++) nextSum = nextSum + arr[i];
        if(nextSum == sum) return true;
        for(int i=k; i<arr.length; i++) {
            nextSum = nextSum + arr[i] - arr[i - k];
            if(nextSum == sum) return true;
        }
        return false;
    }
}
