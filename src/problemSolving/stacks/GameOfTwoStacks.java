// https://www.hackerrank.com/challenges/game-of-two-stacks/problem
package problemSolving.stacks;
import java.util.Stack;

public class GameOfTwoStacks {
    public static void main(String[] args) {
        Stack<Integer> stackOne = new Stack<>();
        Stack<Integer> stackTwo = new Stack<>();

        // Inserting elements to the stack
        stackOne.push(1);
        stackOne.push(6);
        stackOne.push(4);
        stackOne.push(2);
        stackOne.push(4);

        stackTwo.push(5);
        stackTwo.push(8);
        stackTwo.push(1);
        stackTwo.push(2);

        int maxValue = 10;
        int sum = 0;
        int moves = 0;

        while(true) {
            if(stackOne.peek() <= stackTwo.peek())
                sum += stackOne.pop();
            else
                sum += stackTwo.pop();

            if(sum < maxValue) {
                moves++;
            } else {
                System.out.println(moves);
                break;
            }
        }
    }
}
