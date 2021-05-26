package matrix;

public class SearchInSortedMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        search(matrix, 14);
    }

    private static void search(int[][] matrix, int element) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int i=0, j=cols-1;

        while(i<rows && j>=0) {
            if(element > matrix[i][j]) {
                i++;
            }
            else if(element < matrix[i][j]) {
                j--;
            }
            else {
                System.out.println("Element found at index : (" + i + "," + j + ")" );
                return;
            }
        }
        System.out.println("Element not found");
    }

    private static void searchNaive(int[][] matrix, int element) { //Time Complexity: O(R*C), Auxiliary Space: O(1)
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(matrix[i][j] == element) {
                    System.out.println("Element found at index : (" + i + "," + j + ")" );
                    return;
                }
            }
        }

        System.out.println("Element not found");
    }
}
