// https://leetcode.com/problems/removing-stars-from-a-string/description/
package problemSolving.stacksAndQueues;
import java.util.Stack;

public class RemoveStars {
    public static void main(String[] args) {
        System.out.println(removeStarsUsingLinkedList("leet**cod*e"));
    }

    static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        // Given: The input will be generated such that the operation is always possible.
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '*')
                stack.pop();
            else
                stack.push(ch);
        }

        int size = stack.size();
        for(int i=0; i<size; i++) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }

    static String removeStarsUsingLinkedList(String s) {
        StringBuilder result = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '*')
                result.deleteCharAt(result.length() - 1);
            else
                result.append(s.charAt(i));
        }

        return result.toString();
    }
}
