// https://leetcode.com/problems/set-matrix-zeroes/description/
package problemSolving.twoDimensionalArray;
import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 1, 1}
        };

        int[] rows = new int[matrix.length];
        int[] cols = new int[matrix[0].length];

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }

        for(int i=0; i<rows.length; i++) {
            if(rows[i] == 1) {
                matrix[i] = new int[matrix[0].length];
            }
        }

        for(int i=0; i<cols.length; i++) {
            if(cols[i] == 1) {
                for(int j=0; j<matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        for(int i=0; i<matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
