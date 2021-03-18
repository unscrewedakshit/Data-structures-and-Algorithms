package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10,15,20,11,30};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if(right > left) {
            int mid = (left + right) / 2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1, right);
            merge(arr,left,mid,right);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int l1 = mid - low + 1, l2= high - mid;
        int[] left = new int[l1]; int[] right = new int[l2];
        for(int i=0; i<l1; i++) left[i] = arr[low + i];
        for(int i=0; i<l2; i++) right[i] = arr[mid+1+i];

        int i=0, j=0, k=low;
        while(i<l1 && j<l2) {
            if(left[i] <= right[j]) {
                arr[k] = left[i];
                i++; k++;
            }
            else {
                arr[k] = right[j];
                j++; k++;
            }
        }
        while(i<l1) {
            arr[k] = left[i];
            i++; k++;
        }
        while(j<l2) {
            arr[k] = right[j];
            j++; k++;
        }
    }
}
