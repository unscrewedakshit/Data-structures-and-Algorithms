package Sorting;

import java.util.Arrays;

//Given two sorted array we need to print merged array/ return merged array 
public class MergeTwoSortedArrays {
    
    public static void main(String[] args) { //Sample Driver Code
        int[] a = {10,20,35,35,35,35};
        int[] b = {5,50,50};
        merge(a,b);
        //Expected output: 5 10 20 35 35 35 35 50 50
    }

    private static void merge(int[] a, int[] b) { //Time Complexity: Theta(n+m), Auxiliary space: Theta(1)
        int i = 0, j= 0;
        int limit = Math.max(a.length, b.length);
        while(i < a.length && j<b.length) {
            if(a[i] <= b[j]) {
                System.out.print(a[i] + " ");
                i++;
            }
            else {
                System.out.print(b[j] + " ");
                j++;
            }
        }
        while(i < a.length) {
            System.out.print(a[i] + " ");
            i++;
        }
        while(j < b.length) {
            System.out.print(b[j] + " ");
            j++;
        }
//        if(i == a.length) for(int k=j; k<b.length; k++) System.out.print(b[k] + " ");
//        if(j == b.length) for(int k=i; k<a.length; k++) System.out.print(a[k] + " ");

    }

    private static int[] mergeNaive(int[] a, int[] b) { //Time Complexity: O((n+m)log(n+m)) , Auxiliary Space: Theta(m+n)
        int[] temp = new int[a.length + b.length];
        int index = 0;
        for(int i=0; i<a.length; i++) {
            temp[index] = a[i];
            index++;
        }
        for(int i=0; i<b.length; i++) {
            temp[index] = b[i];
            index++;
        }
        Arrays.sort(temp);
        return temp; //return or print her to get desired output
    }
}
