package string;

public class NaivePatternSearching {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String pattern = "eks";
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

    /*private static void patternSearch(String str, String pattern) {
        int l = pattern.length();
        for(int i=0; i<=str.length() - l; i++) {
            if(str.substring(i, i+ l).equals(pattern)) {
                System.out.print(i + " ");
            }
        }
    }*/
}
