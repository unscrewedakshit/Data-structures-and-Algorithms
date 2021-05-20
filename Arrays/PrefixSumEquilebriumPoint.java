package Arrays;

public class PrefixSumEquilebriumPoint {
    public static void main(String[] args) {
        int[] array = {3,4,8,-9,20,6,1};
        System.out.println(equilibriumPoint(array));
    }

    private static boolean equilibriumPoint(int[] arr) { //Time Complexity: O(N) & Auxiliary Space: O(1)
        int rightSum = 0; int leftSum=0;
        for(int i=0; i<arr.length; i++) rightSum += arr[i];

        for(int i=0; i<arr.length; i++) {
            rightSum = rightSum - arr[i];
            if(leftSum == rightSum) return true;
            leftSum = leftSum + arr[i];
        }
        return false;
    }

    private static boolean equilibriumPointEfficient(int[] arr) { //Time Complexity: O(N) & Auxiliary Space: O(N)
        int[] prefixArray = new int[arr.length];
        prefixArray[0] = arr[0];
        for(int i=1; i<arr.length; i++) prefixArray[i] = prefixArray[i-1] + arr[i];

        for(int i=0; i<arr.length; i++) {
            int leftSum = 0; int rightSum = 0;
            if(i == 0) {
                leftSum = 0; rightSum = prefixArray[prefixArray.length - 1] - prefixArray[0];
                if(leftSum == rightSum) return true;
            }
            else {
                leftSum = prefixArray[i-1]; rightSum = prefixArray[prefixArray.length - 1] - prefixArray[i];
                if(leftSum == rightSum) return true;
            }
        }
        return false;
    }

    private static boolean equilibriumPointNaive(int[] arr) { //Time Complexity: O(N^2)
        for(int i=0; i<arr.length; i++) {
            int leftSum=0, rightSum=0;
            for(int j=0; j<i; j++) leftSum = leftSum + arr[j];
            for(int j=i+1; j<arr.length; j++) rightSum = rightSum + arr[j];
            if(leftSum == rightSum) return true;
        }
        return false;
    }
}
