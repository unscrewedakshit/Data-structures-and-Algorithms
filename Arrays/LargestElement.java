package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] array = {10,20,30,128,50,60,70,80,90,100};
        System.out.println(largestElement(array));
    }

    private static int largestElement(int[] arr) { //Time Complexity: O(N)
        int largestElement = Integer.MIN_VALUE;
        int largestElementIndex=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largestElement){
                largestElement = arr[i];
                largestElementIndex = i;
            }
        }
        return largestElementIndex;
    }
}
