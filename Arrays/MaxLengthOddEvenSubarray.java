package arrays;

public class MaxLengthOddEvenSubarray {
    public static void main(String[] args) {
        int[] array = {5,10,20,6,3,8};
        System.out.println(maxLengthEfficient(array));
    }

    private static int maxLengthEfficient(int[] arr) { //Time Complexity: O(N)
        int result = 1;
        int current = 1;
        for(int i=1; i<arr.length; i++) {
            if( (arr[i] % 2 == 0 && arr[i-1] % 2 !=0) || (arr[i] % 2 != 0 && arr[i-1] % 2 == 0) ){
                current++;
            }
            else {
                current = 1;
            }
            result = Math.max(current,result);
        }
        return result;
    }

    private static int maxLengthNaive(int[] arr) { //Time Complexity: O(N^2)
        int result = 1;
        for(int i=0; i<arr.length; i++) {
            int current = 1;
            for(int j=i+1; j<arr.length; j++) {
                if( (arr[j-1] % 2 == 0 && arr[j] % 2 != 0) || (arr[j-1] % 2 != 0 && arr[j] % 2 == 0 ) ) {
                    current++;
                }
                else break;
            }
            result = Math.max(result,current);
        }
        return result;
    }
}
