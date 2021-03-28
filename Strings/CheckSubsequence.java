package String;
//Check if string s1 is subsequence of s2 or not.
// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the 
//characters without disturbing the relative positions of the remaining characters. 

public class CheckSubsequence {
    public static void main(String[] args) { //
        String s1 = "abcd";
        String s2 = "ade";
        System.out.println(checkSubsequence(s2,s1));
      //Expected output: false
      //if s2 = "ad" then output: true
    }

    public boolean isSubsequence(String s2, String s1) {
        int n= s1.length(), m= s2.length();
        if(m > n) return false;
        int i=0, j=0;
        while(i<n && j<m) {
            if(s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            }
            else i++;
        }
        return j == m;
    }
}
