/*
 * You are starting at position (0, 0) and you are supposed to move till the bottom right cell of the given matrix.
 * The task is to write two function
 * - find the no of possible ways you can travel to the destination. (There isn't any blockers).
 * - return all the paths in which you can travel (say RDDR, RDRD) where R means Right & D means Down
 */
package problemSolving.twoDimensionalArray;

import java.util.ArrayList;

public class MazeCountPaths {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        System.out.println(paths(matrix, 0, 0));
    }

    public static int paths(int[][] matrix, int row, int col) {
        if(row == matrix.length - 1 || col == matrix[0].length - 1) {
            return 1;
        }

        int right = paths(matrix, row, col+1);
        int down = paths(matrix, row+1, col);

        return right + down;
    }
}
