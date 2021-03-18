package Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int maxCapacity = 10;
        int[] arr = new int[maxCapacity];
        int size = 6;
        size = insert(arr,size,69,4, maxCapacity);
        printArray(arr,size);

    }

    private static int insert(int[] arr, int size, int element, int position, int maxCapacity) { //Time Complexity: O(N)
        if(position >= maxCapacity) {
            System.out.println("Out of array bounds");
            return size;
        }
        int index = position - 1;
        for(int i=size+1; i>=position; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = element;
        System.out.println("Inserting " + element + " at " + position + " position");
        return  size+1;
    }

    private static int delete(int[] arr, int size, int element) { //Time Complexity: O(N)
        for(int i=0; i<size; i++) {
            if(arr[i] == element) {
                for(int j=i; j<size-1; j++) {
                    arr[j] = arr[j+1];
                }
                System.out.println("Deleting " + element);
                return  size - 1;
            }
        }
        System.out.println("Element to be deleted not found");
        return size;
    }

    private static int linearSearch(int[] arr,int size, int element) { //Time Complexity: O(N)
        for(int i=0; i<size; i++) {
            if(arr[i] == element) return i;
        }
        return -1;
    }

    private static void printArray(int[] arr, int size) { //Time Complexity: O(N)
        System.out.println("------------Array Elements--------------");
        for(int i=0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
