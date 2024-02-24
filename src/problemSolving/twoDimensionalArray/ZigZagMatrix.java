package problemSolving.twoDimensionalArray;
import java.util.ArrayList;

public class ZigZagMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        ArrayList<Integer> result = new ArrayList<>();

        int row = 0, col = 0;
        boolean isGoingUp = true;

        while(result.size() != matrix.length * matrix[0].length) {
            if (isGoingUp) {
                while(row >= 0 && col < matrix[0].length) {
                    result.add(matrix[row][col]);
                    row--;
                    col++;
                }

                if(col == matrix[0].length) {
                    row += 2;
                    col -= 1;
                } else {
                    row += 1;
                }

                isGoingUp = false;
            }
            else {
                while(row < matrix.length && col >= 0) {
                    result.add(matrix[row][col]);
                    row++;
                    col--;
                }

                if(row == matrix.length) {
                    col += 2;
                    row -= 1;
                } else {
                    col += 1;
                }

                isGoingUp = true;
            }
        }


        System.out.println(result);
    }
}
