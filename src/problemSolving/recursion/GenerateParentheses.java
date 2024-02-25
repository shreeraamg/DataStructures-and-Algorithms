// https://leetcode.com/problems/generate-parentheses/description/
package problemSolving.recursion;
import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.println(generate("", 2, 2, 4));
    }

    static List<String> generate(String s, int openCount, int closeCount, int length) {
        if(openCount > closeCount) {
            return new ArrayList<>();
        }
        if(openCount == -1 || closeCount == -1) {
            return new ArrayList<>();
        }
        if(s.length() == length) {
            List<String> res = new ArrayList<>();
            res.add(s);
            return res;
        }

        List<String> open =  generate(s.concat("("), openCount-1, closeCount, length);
        List<String> close = generate(s.concat(")"), openCount, closeCount-1, length);

        List<String> res = new ArrayList<>();
        res.addAll(open);
        res.addAll(close);
        return res;
    }
}
