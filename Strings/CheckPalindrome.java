package string;

public class CheckPalindrome {
    public static void main(String[] args) { //test driver code
        String str = "akshit";
        System.out.println(checkPalindrome(str));
        System.out.println(checkPalindromeNaive(str));
    }

    private static boolean checkPalindrome(String str) { //Time Complexity: O(N), Auxiliary Space: O(1)
        int begin = 0, end = str.length() - 1;
        while(begin < end) {
            if(str.charAt(begin) != str.charAt(end)) return false;
            begin++;
            end--;
        }
        return true;
    }

    private static boolean checkPalindromeNaive(String str) { //Time Complexity: Theta(N), Auxiliary Space: Theta(N)
        StringBuilder s1 = new StringBuilder(str);
        s1.reverse();
        return str.equals(s1.toString());
    }
}
