package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = {10,10,10,10,10,10};
        System.out.println(secondLargestNaive(array));
    }

    private static int secondLargest(int[] arr) { //efficient solution
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            if(arr[i] == largest) continue;;
            if(arr[i] < largest) {
                if(arr[i] > secondLargest) secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    private  static int secondLargestNaive(int[] arr) {
        int largest = arr[largestElement(arr)];
        int secondLargest = Integer.MIN_VALUE;
        int secondLargestIndex = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != largest) {
                if(arr[i] > secondLargest) {
                    secondLargest = arr[i];
                    secondLargestIndex = i;
                }
            }
        }
        return secondLargestIndex;
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
