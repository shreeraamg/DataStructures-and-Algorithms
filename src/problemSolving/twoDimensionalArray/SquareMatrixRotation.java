/*
 * You are given a square matrix of n rows and cols.
 * Check whether each row in the matrix is rotated clockwise manner
 * Return true if it is a valid circular square matrix or else return false.
 */
package problemSolving.twoDimensionalArray;

public class SquareMatrixRotation {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {4, 1, 2, 3},
                {3, 4, 1, 2},
                {2, 3, 4, 1}
        };

        System.out.println(checkValidSquareMatrix(matrix));
    }

    public static boolean checkValidSquareMatrix(int[][] matrix) {
        for(int i=1; i<matrix.length; i++) {
            int[] rotatedRow = rotate(matrix[i-1]);
            for(int j=0; j<matrix[i].length; j++) {
                if(matrix[i][j] != rotatedRow[j])
                    return false;
            }
        }
        return true;
    }

    public static int[] rotate(int[] arr) {
        int temp = arr[arr.length - 1];
        for(int i=arr.length-1; i>0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr;
    }
}
