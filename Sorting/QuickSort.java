package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) { 
        int[] arr = {10,80,30,90,40,50,70};
        quickSort(arr,0,6);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) { //Time Complexity: O(nlogn), Auxiliarry Space: O(1) 
        if(low < high) {
            int p = partitionLomuto(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
    }


    private static int partitionLomuto(int[] arr, int low, int high) { //Time Complexity: O(N), Auxiliary Space: O(1), not stable partion technique
        int pivot = arr[high]; //pivot is consider always the last element
        int i = low - 1;
        for(int j=low; j<=high; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    private static void partitionNaive(int[] arr, int p, int low, int high) { //Time Compexity: O(N), Auxiliary Space: O(N), stable partion technique but takes extra space
        int[] temp = new int[high-low+1];
        int index = 0;
        for(int i=low; i<=high; i++) {
            if(arr[i] <= arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        }
        for(int i=low; i<=high; i++) {
            if(arr[i] > arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        }

        for(int i=low; i<=high; i++) {
            arr[i] = temp[i-low];
        }
    }
}
