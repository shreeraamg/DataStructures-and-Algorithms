// https://leetcode.com/problems/flood-fill/description/
package problemSolving.twoDimensionalArray;
import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
        floodFill(matrix, 1, 1, matrix[1][1], 2);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    static void floodFill(int[][] matrix, int row, int col, int existingColor, int color) {
        if (row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length) {
            if (matrix[row][col] != existingColor)
                return;
            else {
                matrix[row][col] = color;
                floodFill(matrix, row - 1, col, existingColor, color);
                floodFill(matrix, row + 1, col, existingColor, color);
                floodFill(matrix, row, col - 1, existingColor, color);
                floodFill(matrix, row, col + 1, existingColor, color);
            }
        }
    }
}

