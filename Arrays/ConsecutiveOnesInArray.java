package arrays;

public class ConsecutiveOnesInArray {
    public static void main(String[] args) {
        int[] array = {1,1,1,1,1,0,0,0,0,1,1,1};
        System.out.println(countOnes(array));
    }

    private static int countOnes(int[] arr) { //Time Complexity: Theta(N)
        int maxCount = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 1) {
                count++;
                maxCount = Math.max(count,maxCount);
            }
            else {
                count = 0;
            }
        }
        return maxCount;
    }

    private static int countConsecutiveOnes(int[] arr) { //Time Complexity: Theta(N^2)
        int maxCount = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 1) {
                count++;
                int j=i+1;
                while (j<arr.length && arr[j] == 1 ){
                    j++;
                    i++;
                    count++;
                }
            }
            maxCount = Math.max(maxCount,count);
            count=0;
        }
        return maxCount;
    }
}
