package Arrays;

public class MaximumDifference {
    public static void main(String[] args) {
        int[] arr = {2,3,10,6,4,8,1};
        System.out.println(maximumDifferenceEfficient(arr));
    }

    private static int maximumDifferenceEfficient(int[] arr) { //Time Complexity: Theta(N)
        int maxDifference = Integer.MIN_VALUE;
        int minElement = arr[0];
        for(int i=1; i<arr.length; i++) {
            int difference = arr[i] - minElement;
            if(difference > maxDifference) maxDifference = difference;
            if(minElement > arr[i]) minElement = arr[i];
        }
        return maxDifference;
    }

    private static int maximumDifferenceNaive(int[] arr) { //Time Complexity: Theta(N^2)
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                int difference = arr[j] - arr[i];
                if(difference > max) max = difference;
            }
        }
        return max;
    }
}
