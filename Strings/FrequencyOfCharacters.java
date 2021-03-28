package string;
//Given a string of small-case letters find the frequency of each character in sorted order

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aakash";
        showFrequency(str);
        //expected output :: a-3 h-1 k-1 s-1
    }

    private static void showFrequency(String str) {
        int[] count = new int[26];

        for(int i=0; i<str.length(); i++) count[(int)str.charAt(i) - 97]++;

        for(int i=0; i<26; i++) {
            if(count[i] > 0) {
                System.out.println("Frequency of " + (char) (97 + i) + " = " + count[i]); //can be formatted as per question
            }
        }
    }
}
