package arrays;

public class MinimumConsecutiveFlips {
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,0,1,0,0,1,1,1,1};
        minimumFlipsEfficient(arr);
    }

    private static void minimumFlipsEfficient(int[] arr) { //Time Complexity: O(N)
        for(int i=1; i<arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                if(arr[i] != arr[0]) System.out.print("Flip from " + i + " to ");
                else System.out.println(i-1);
            }
        }
        if(arr[arr.length-1] != arr[0]) System.out.println(arr.length-1);
    }

    private static void minimumFlipsNaive(int[] arr) { //Time Complexity: O(N)
        int groupsOf1=0; int groupsOf0=0;
        int i=0;
        while(i < arr.length) {
            if(arr[i] == 1) {
                groupsOf1++; i++;
                while(i<arr.length && arr[i] == 1) i++;
            }
            else{
                groupsOf0++; i++;
                while (i<arr.length && arr[i] == 0) i++;
            }
        }

        int min = Math.min(groupsOf0,groupsOf1);
        int start=0,end=0;
        if(groupsOf0<=groupsOf1) {
            for(i=0; i<arr.length; i++) {
                if(arr[i] == 0) {
                    start = i; i++;
                    while (i<arr.length && arr[i] == 0) i++;
                    end = i-1;
                    System.out.println("Flip from " + start + " to " + end);
                }
            }
        }
        else {
            for(i=0; i<arr.length; i++) {
                if(arr[i] == 1) {
                    start = i; i++;
                    while (i<arr.length && arr[i] == 1) i++;
                    end = i-1;
                    System.out.println(start + " " + end);
                }
            }
        }
    }
}
