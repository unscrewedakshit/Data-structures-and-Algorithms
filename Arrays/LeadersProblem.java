package arrays;

public class LeadersProblem {
    public static void main(String[] args) {
        int[] array = {7,10,4,3,6,5,2};
        leadersEfficient(array);
    }

    private static void leadersEfficient(int[] arr) { //Time Complexity: O(N)
        int currentLeader = arr[arr.length - 1];
        System.out.print(currentLeader + " ");
        for(int i=arr.length-2; i>=0; i--) {
            if(arr[i] > currentLeader) {
                currentLeader = arr[i];
                System.out.print(arr[i] + " ");
            }
        }
    }

    private static void leadersInArrayNaive(int[] arr) { // Time Complexity: O(N^2)
        for(int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] <= arr[j]) {
                    flag = true;
                    break;
                }
            }
            if(!flag)
                System.out.print(arr[i]+" ");
        }
    }
}
