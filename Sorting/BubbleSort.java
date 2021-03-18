package Sorting;
import java.util.*;

public class BubbleSort {

    public static void main(String[] args) { //Example drive code
        int[] arr = {1,2,3,4,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) { //Time Complexity: Theta(N^2), Auxilliary Space
        for(int i=0; i< arr.length; i++) {
            boolean swapped = false; //Optimized Time Complexity: O(N^2)
            for(int j=0; j<arr.length - i- 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}
