/*
 * You are given a matrix of n*m. Print the matrix in a snake pattern
 * Example
 *  ----->
 *  <-----
 *  ----->
 *  <-----
 */
package problemSolving.twoDimensionalArray;
import java.util.ArrayList;

public class SnakeMatrix {
    public static void main(String[] args) {
        int[][] matrix= {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int row = 0, col = 0;
        boolean goingRight = true;
        ArrayList<Integer> result = new ArrayList<>();

        while(row < matrix.length) {
            if(goingRight) {
                result.add(matrix[row][col]);
                col++;

                if(col == matrix[0].length) {
                    col--;
                    row++;
                    goingRight = false;
                }
            } else {
                result.add(matrix[row][col]);
                col--;
                if(col == -1) {
                    col++;
                    row++;
                    goingRight = true;
                }
            }
        }

        System.out.println(result);
    }
}
