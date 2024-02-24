// https://www.hackerrank.com/challenges/game-of-two-stacks/problem
package problemSolving.stacksAndQueues;
import java.util.Arrays;

public class GameOfTwoStacks {
    public static void main(String[] args) {
        int[] s1 = {4, 2, 4, 6, 1};
        int[] s2 = {2, 1, 8, 5};

        System.out.println(getMaximumMoves(10, s1, s2, 0, 0) - 1);
    }

    static int getMaximumMoves(int limit, int[] s1, int[] s2, int sumSoFar, int count) {
        if(sumSoFar > limit)
            return count;

        if(s1.length == 0 || s2.length == 0)
            return count;

        int ans1 = getMaximumMoves(limit, Arrays.copyOfRange(s1, 1, s1.length), s2, sumSoFar + s1[0], count+1);
        int ans2 = getMaximumMoves(limit, s1, Arrays.copyOfRange(s2, 1, s2.length), sumSoFar + s2[0], count+1);

        return Math.max(ans1, ans2);
    }
}
