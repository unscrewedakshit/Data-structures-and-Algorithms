package arrays;

public class FrequenciesInSortedArray {
    public static void main(String[] args) {
        int[] array = {10,10,20,30,40,40,50};
        frequencyOfElements(array);
    }

    private static void frequencyOfElements(int[] arr) {  //Time Complexity: Theta(N)
        if(arr.length == 1) System.out.println("Frequency of " + arr[0] + ": " + 1);
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length) {
                int frequency = 1;
                int element = arr[i];
                while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                    frequency++;
                    i++;
                }
                System.out.println("Frequency of " + element + ": " + frequency);
            }
            else
                System.out.println("Frequency of " + arr[i] + ": " + 1);
        }
    }
}
