// https://www.geeksforgeeks.org/count-maximum-points-on-same-line/
// https://leetcode.com/problems/max-points-on-a-line/description/
package problemSolving.twoDimensionalArray;
import java.util.HashMap;

public class MaxPointsInLine {
    public static void main(String[] args) {
        int[][] coordinates = {{1,1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}};

        System.out.println(maxPoints(coordinates));
    }

    static int maxPoints(int[][] points) {
        if(points.length <=2)
            return points.length;

        HashMap<String, Integer> slopes = new HashMap<>();
        int maximum = 0;

        for(int i=0; i<points.length; i++) {
            int currentMax = 0;
            int overlayingPoints = 0;
            int verticalPoints = 0;

            for(int j=i+1; j<points.length; j++) {
                // Check Overlay
                if(points[i][0] == points[j][0] && points[i][1] == points[j][1])
                    overlayingPoints++;
                else if (points[i][0] == points[j][0])
                    verticalPoints++;
                else {
                    int yDifference = points[j][1] - points[i][1];
                    int xDifference = points[j][0] - points[i][0];
                    int gcd = gcdOf(xDifference, yDifference);
                    yDifference /= gcd;
                    xDifference /= gcd;

                    String pair = xDifference + " " + yDifference;

                    if(slopes.containsKey(pair)) {
                        slopes.put(pair, slopes.get(pair) + 1);
                    } else {
                        slopes.put(pair, 1);
                    }

                    currentMax = Math.max(currentMax, slopes.get(pair));
                }
                currentMax = Math.max(verticalPoints, currentMax);
            }
            maximum = Math.max(maximum, currentMax + overlayingPoints + 1);
            slopes.clear();
        }
        return maximum;
    }

    private static int gcdOf(int left, int right) {
        if(right == 0)
            return left;

        int remainder = left % right;
        return gcdOf(right, remainder);
    }
}
