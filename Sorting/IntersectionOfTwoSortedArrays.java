package sorting;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) { //Sample Driver code
        int[] a = {1,20,20,40,60};
        int[] b = {2,20,20,20,40};
        intersection(a,b);
      //expected output: {20,40}
    }

    private static void intersection(int[] a, int[] b) { //Time Complexity: O(n+m) , Auxiliary Space: O(1)
        int i=0, j=0;
        while(i<a.length && j<b.length) {
            if(i>0 && a[i] == a[i-1]) { i++;  continue; }
            if(a[i] < b[j]) i++;
            else if(a[i] > b[j]) j++;
            else {
                System.out.print(a[i] + " ");
                i++; j++;
            }
        }
    }

    private static void intersectionNaive(int[] a, int[] b) { //Time Complexity O(n*m), Auxiliary Space: O(1)
        for(int i=0; i<a.length; i++) {
            if(i>0 && a[i] == a[i-1] ) continue;

            for(int j=0; j<b.length; j++) {
                if(a[i] == b[j]){
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }
}
