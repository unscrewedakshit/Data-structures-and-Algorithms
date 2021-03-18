package Sorting;

import java.util.Arrays;

public class InsertionSort {
  
    public static void main(String[] args) { //Sample driver code
        int[] arr = {-1,30,20,-1,40,30};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

  //The basic idea of insertion sort is that we maintain a sorted subarray and place elements from unsorted party to their correct. Initially first element is considered sorted.
  //This a stable sorting alogirthm as the order of elements in case of duplicates is preserved after sorting
  private static void sort(int[] arr) { //Time Complexity: O(N^2), Auxiliary space: O(1)
        for(int i=1; i<arr.length - 1; i++) {
            int key = arr[i];
            int j = i -1;
            while(j>=0 && arr[j] > key) { //move all elemnts forward by 1 in sorted part
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key; //place the element at correct index 
        }
   }
  
}
