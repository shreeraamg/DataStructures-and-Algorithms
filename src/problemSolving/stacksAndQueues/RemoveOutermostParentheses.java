// https://leetcode.com/problems/remove-outermost-parentheses/description/
package problemSolving.stacksAndQueues;
import java.util.LinkedList;
import java.util.Queue;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())(()(()))").equals("()()()()(())"));
    }

    static String removeOuterParentheses(String s) {
        Queue<Character> queue = new LinkedList<>();
        char[] chars = s.toCharArray();
        StringBuilder result = new StringBuilder();

        int i=0;
        int openCount = 0, closeCount = 0;
        while(i < chars.length) {
            queue.add(chars[i]);
            if(chars[i] == '(')
                openCount++;
            else
                closeCount++;

            if(openCount == closeCount && openCount != 0 && closeCount != 0) {
                queue.poll();
                int size = queue.size() - 1;
                for(int j=0; j<size; j++) {
                    result.append(queue.poll());
                }
                queue.poll();
                openCount = closeCount = 0;
            }
            i++;
        }

        return result.toString();
    }
}
