package arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {30};
        reverseArray(array);
        for (int j : array) System.out.print(j + " ");
    }

    private static void reverseArray(int[] array) { //Time Complexity: O(N) , Auxiliary space: O(1)
        int size = array.length;
        for(int i=0; i < size/2; i++) {
            int temp = array[i];
            array[i] = array[size-1-i];
            array[size-1-i] = temp;
        }
    }
}
