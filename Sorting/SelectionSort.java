package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) { //Sample Driver Code
        int[] arr = {4,1,3,9,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

  //The basic idea of selection sort to put min element in 1st position, 2nd min element in 2nd position and so on.....
  //This is not a stable sorting as order of occurence in case of duplicates is not preserved after sorting
    private static void sort(int[] arr) { //Time Complexity: Theta(N^2), Auxiliary Space: Theta(1)
        for(int i=0; i<arr.length - 1; i++) {
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++) { //Find the minimum index from right of i
                if (arr[minIndex] > arr[j])
                    minIndex = j;
            }
                int temp = arr[minIndex]; //Swap min element and ith element
                arr[minIndex] = arr[i];
                arr[i] = temp;
        }
    }
}
