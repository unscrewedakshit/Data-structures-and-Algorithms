package sorting;

public class CountOfInversions {
    public static void main(String[] args) {
        int[] arr = {40,30,20,10};
        System.out.println(count(arr,0,arr.length-1));
    }

    private static int count(int[] arr, int l, int r) { //Time Complexity: O(nlogn) , Auxiliary Space: O(1)
        int res = 0;
        if(r > l) {
            int mid = (l + r) / 2;
            res = res + count(arr,l,mid);
            res = res + count(arr,mid+1,r);
            res = res + mergeAndCount(arr,l,mid,r);
        }
        return res;
    }

    private static int mergeAndCount(int[] arr, int low, int mid, int high) {
        int l1 = mid - low + 1, l2 = high - mid;
        int[] left = new int[l1]; int[] right = new int[l2];
        for(int i=0; i<l1; i++) left[i] = arr[low+i];
        for(int i=0; i<l2; i++) right[i] = arr[mid+i+1];

        int i=0, j=0, k=low, res=0;
        while(i<l1 && j<l2) {
            if(left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
                res = res + (l1 - i);
            }
            k++;
        }
        while(i<l1) {
            arr[k] = left[i];
            i++; k++;
        }
        while(j<l2) {
            arr[k] = right[j];
            j++; k++;
        }
        return res;
    }

    private static int countNaive(int[] arr) { //Time Complexity: O(N^2), Auxiliary Space: O(1)
        int res = 0;
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) res++;
            }
        }
        return res;
    }
}
