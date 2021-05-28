package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {10,20,10,30,20};
        int[] arr2 = {20,10,10,40};

        System.out.println(getCount(arr1,arr2));
    }

    private static int getCount(int[] arr1, int[] arr2) { //Time Complexity: O(N), Auxiliary Space: O(N)
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        for(int i=0; i<arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++) {
            if(hs.contains(arr2[i])) {
                count++;
                hs.remove(arr2[i]);
            }
        }

        return count;
    }

}
