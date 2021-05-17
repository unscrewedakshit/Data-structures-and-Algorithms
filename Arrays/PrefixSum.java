package arrays;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] array = {1,4,20,3,10,5};
        int[] prefixSum = new int[array.length];
        prefixSum[0] = array[0];
        for(int i=1; i<prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i-1] + array[i];
        }
        System.out.println(prefixSum[4] - prefixSum[1]);
    }
}
