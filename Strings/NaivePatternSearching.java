package String;
//Given a text and a pattern . We need to  find index/s(starting) in the text where the pattern exist.
//eg: text="abababcd", pattern="abab" => Output: 0 2
//eg: text="abcabcd", pattern="abcd" => Output: 3
//eg: text="aaaaa", pattern="aaa" => Output: 0 1 2

public class NaivePatternSearching {
    public static void main(String[] args) {
        String str = "abababcd";
        String pattern = "abab";
        patternSearch(str,pattern);
    }

    private static void patternSearch(String text, String pattern) { //Time Complexity: O(n*m)
        int n = text.length(), m = pattern.length();
        for(int i=0; i<= n - m; i++) {
            boolean flag = false;
            for(int j=0; j<m; j++) {
                if(text.charAt(i + j) != pattern.charAt(j)) {
                    flag = false;
                    break;
                } else flag = true;
            }
            if(flag) System.out.print(i + " ");
        }
    }

    //Alternate way
    /*private static void patternSearch(String str, String pattern) {
        int l = pattern.length();
        for(int i=0; i<=str.length() - l; i++) {
            if(str.substring(i, i+ l).equals(pattern)) {
                System.out.print(i + " ");
            }
        }
    }*/
}
