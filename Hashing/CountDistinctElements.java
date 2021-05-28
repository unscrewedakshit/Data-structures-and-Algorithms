package hashing;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        Integer[] arr = {15,12,13,12,13,13,18};

        System.out.println(count(arr));
    }

    private static int count(Integer[] arr) { //Time Complexity: O(N), Auxiliary Space: O(N)
        HashSet<Integer> hs = new HashSet<>(Arrays.asList(arr));
        return hs.size();
    }

    private static int countNaive(int[] arr) { //Time Complexity: O(N^2), Auxiliary Space: O(1)
        int result = 0;
        for(int i=0; i<arr.length; i++) {
            boolean flag = false;
            for(int j=0; j<i; j++) {
                if(arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if(flag == false) result++;
        }
        return result;
    }
}
