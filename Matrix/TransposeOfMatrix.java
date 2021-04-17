package Matrix;

//Give a matrix find the transpose of the matrix
import java.util.Arrays;

public class TransposeOfMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        findTranspose(matrix);

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void findTranspose(int[][] matrix) { //Efficient method with O(1) auxiliary space and one traversal
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i=0; i<rows; i++) {
            for(int j=i+1; j<rows; j++) {
               int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
            }
        }
    }

    private static void findTransposeNaive(int[][] matrix) {
        int size = matrix.length;

        int[][] temp = new int[size][size];

        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                temp[i][j] = matrix[j][i];
            }
        }

        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                matrix[i][j] = temp[i][j];
            }
        }
    }
}
