package Arrays;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        leftRotateBest(array,2);
        System.out.println(Arrays.toString(array));
    }

    private static void leftRotateBest(int[] arr,int D) { //Time Complexity: Theta(N) & Auxiliary Space: Theta(1)
        reverse(arr, 0, D-1);
        reverse(arr,D,arr.length-1);
        reverse(arr,0,arr.length-1);
    }

    private static void leftRotateEfficient(int[] arr,int D) {//Time Complexity: Theta(N) & Auxiliary Space: Theta(D)
        int[] temp = new int[D];
        for(int i=0; i<D; i++) temp[i] = arr[i];
        for(int i=D; i<arr.length; i++) arr[i-D] = arr[i];
        for (int i=D+1; i<arr.length; i++) arr[i] = temp[i-D-1];
    }

    private static void leftRotateNaive(int[] arr, int D) { //Time Complexity: Theta(N*D) & Auxiliary Space: Theta(1)
        for(int i=0; i<D; i++) leftRotateByOne(arr);
    }

    private static void leftRotateByOne(int[] arr) { //Time Complexity: Theta(N)
        int temp = arr[0];
        for(int i=1; i<arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }

    private static void reverse(int[] arr,int start, int end) {
        while(start<end) {
            int temp = arr[start];
            arr[start] =arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
