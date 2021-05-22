package arrays;

public class TrappingRainwaterProblem {
    public static void main(String[] args) {
        int[] array = {3,0,0,2,0,4};
        System.out.println(findUnitsOfWaterEfficient(array));
    }

    private static int findUnitsOfWaterEfficient(int[] arr) { //Time Complexity: O(N) & Auxiliary Space: O(N)
        int units = 0;
        int N = arr.length;
        int[] leftMax = new int[N];
        int[] rightMax = new int[N];
        leftMax[0] = arr[0];
        for(int i=1; i<N; i++) leftMax[i] = Math.max(leftMax[i-1],arr[i]);
        rightMax[N-1] = arr[N-1];
        for(int i=N-2; i>=0; i--) rightMax[i] = Math.max(rightMax[i+1],arr[i]);
        for(int i=1; i<N-1; i++) {
            units = units + Math.min(leftMax[i],rightMax[i]) - arr[i];
        }
        return units;
    }

    private static int findUnitsOfWaterNaive(int[] arr) {  //Time Complexity: O(N^2)
        int units = 0;
        for(int i=1; i<arr.length - 1; i++) {
            int leftMax = arr[i];
            for(int j=0; j<i; j++) {
                leftMax = Math.max(leftMax,arr[j]);
            }
            int rightMax = arr[i];
            for(int j=i+1; j<arr.length; j++) {
                rightMax = Math.max(rightMax,arr[j]);
            }
            units = units + Math.min(leftMax,rightMax) - arr[i];
        }
        return units;
    }
}
