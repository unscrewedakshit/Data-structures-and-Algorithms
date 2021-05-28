package hashing;

public class LongestSubArrayWith01 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1,0,0};

        System.out.println(longestNaive(arr));
    }

    private  static int longest(int[] arr) {
        return 1;
    }

    private static int longestNaive(int[] arr) { //Time Complexity: Theta(N^2), Auxiliary Space: O(1)
        int res = 0;
        for(int i=0; i<arr.length; i++) {
            int countOf0 = 0 , countOf1 = 0;
            for(int j=i; j<arr.length; j++) {
                if(arr[j] == 0) countOf0++;
                else countOf1++;
                if(countOf0 == countOf1) res = Math.max(res, countOf0+countOf1);
            }
        }
        return res;
    }
}
