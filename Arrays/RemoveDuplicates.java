package arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10,10,10,20,20,30,40,40,40,50,60,60};
        int size = removeDuplicates(arr);
        for(int i=0; i<size; i++) System.out.print(arr[i] + " ");
    }

    private static int removeDuplicates(int[] arr) {
        int result = 1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] != arr[result-1]) {
                arr[result] = arr[i];
                result++;
            }
        }
        return result;
    }

    private static int removeDuplicatesNaive(int[] arr) { //Time Complexity: O(N) & Auxiliary space: O(N)
        int[] tempArray = new int[arr.length];
        int result = 1;
        tempArray[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] != tempArray[result - 1]){
                tempArray[result] = arr[i];
                result++;
            }
        }
        for(int i=0; i<tempArray.length; i++){
            arr[i] = tempArray[i];
        }
        return result; //size of the new array
    }
}
