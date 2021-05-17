package arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {15, 12, 0, 0, 0, 2, 2, 19, 6, 17, 16, 20, 0, 2, 16, 0, 10, 0, 14, 15};
        moveZerosToEndNaive(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZerosToEnd(int[] arr) { //Time Complexity: O(N)
        int countOfNonZero = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                int temp =arr[countOfNonZero];
                arr[countOfNonZero] = arr[i];
                arr[i] = temp;
                countOfNonZero++;
            }
        }
    }


    private static void moveZerosToEndNaive(int[] arr) { //Time Complexity: O(N^2)
        for(int i=0; i<arr.length - 1; i++) {
            if(arr[i] == 0) {
                for(int j=i+1; j<arr.length; j++) {
                    if(arr[j] != 0) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
    }
}
