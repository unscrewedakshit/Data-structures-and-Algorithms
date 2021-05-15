package arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] array = {8,8,6,6,1,4,};
        System.out.println(getMajorityElementEfficient(array));
    }

    private static int getMajorityElementEfficient(int[] arr) { //Time Complexity: O(N)
        int index = 0; int count = 1;
        for(int i=1; i<arr.length; i++) { //find the candidate
            if(arr[index] == arr[i]) count++;
            else count--;

            if(count == 0) {
                index = i; count=1;
            }
        }
        count = 0;
        for(int i=0; i<arr.length; i++) if(arr[i] == arr[index]) count++; //Check if candidate actually has a majority

        if(count > arr.length/2) return index;
        else return -1;
    }

    private static int getMajorityElementNaive(int[] arr) { //Time Complexity: O(N^2)
        int index = -1;
        int N = arr.length;
        for(int i=0; i<arr.length; i++) {
            int count = 1;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count > N/2) {
                index = i;
                break;
            };
        }
        return index;
    }
}
