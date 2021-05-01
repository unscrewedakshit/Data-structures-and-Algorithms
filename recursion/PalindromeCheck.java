package recursion;

public class PalindromeCheck {
    public static void main(String[] args) {

        String str = "abbab";

        System.out.println(check(str,0, str.length() - 1));
    }

    private static boolean check(String str, int start, int end) { //Time Complexity: O(N), Auxiliary Space: O(N)
        if(start >= end) return true;
        return ( (str.charAt(start) == str.charAt(end)) && (check(str,start+1,end-1)) );
    }
}
