package matrix;

public class SnakePattern {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        printInSnakePattern(matrix);
    }

    private static void printInSnakePattern(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i=0; i<rows; i++) {
            if(i % 2 == 0) {
                for(int j=0; j<cols; j++) System.out.print(matrix[i][j] + " ");
            } else {
                for(int j=cols-1; j>=0; j--) System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
