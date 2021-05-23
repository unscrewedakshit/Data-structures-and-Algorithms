package matrix;

// 1 2 3
// 4 5 6
// 7 8 9
public class RotateMatrixBy90 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,},
                {4,5,6,},
                {7,8,9}
        };

        rotate(matrix);

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void rotate(int[][] matrix) {
        transpose(matrix);
        int size = matrix.length;
        for(int i=0; i<size/2; i++) {
            for(int j=0; j<size; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[size-i-1][j];
                matrix[size-i-1][j] = temp;
            }
        }
    }

    private static void transpose(int[][] matrix) {
        int size = matrix.length;
        for(int i=0; i<size; i++) {
            for(int j=i+1; j<size; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private static void rotateNaive(int[][] matrix) { //Time Complexity: O(N^2), Auxiliary Space: O(N^2)
        int size = matrix.length;
        int[][] temp = new int[size][size];

        int p=0,q=0;
        for(int j=size-1; j>=0; j--) {
            for(int i=0; i<size; i++) {
                temp[p][q] = matrix[i][j];
                q++;
            }
            q=0; p++;
        }

        for(int i=0; i<size; i++)
            for(int j=0; j<size; j++)
                matrix[i][j] = temp[i][j];
    }
}
