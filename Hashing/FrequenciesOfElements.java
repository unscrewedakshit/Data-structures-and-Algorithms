package hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequenciesOfElements {

    public static void main(String[] args) {
        int[] arr = {10,12,10,15,10,20,12,12};

        printFrequencies(arr);

    }

    private static void printFrequencies(int[] arr) { //Time Complexity: O(N), Auxiliary Space: O(N)
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            if(hm.containsKey(arr[i])) { //if element is already present in HashMap
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }

            //hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        for(Map.Entry<Integer,Integer> e: hm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
    
}
