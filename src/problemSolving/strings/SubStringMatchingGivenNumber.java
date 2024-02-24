/*
 Given a string consisting of lowercase English letters,
 each mapped to a specific numeric value (a=1, b=2, c=3, ..., z=26),
 your task is to extract substrings from the given string.
 The sum of the numeric values of the characters in each substring
 should be calculated based on the mapping,
 and your goal is to find a substring whose numeric sum matches a given integer n.
 For example, considering the string "abcdef", if n is 7,
 one valid substring is "cd" since the sum of the numeric values of 'c' and 'd' is 3 + 4 = 7.
 Implement a program or algorithm to identify and output such substrings.
*/
package problemSolving.strings;

public class SubStringMatchingGivenNumber {
    public static void main(String[] args) {
        String inputString = "zohocorp";
        int n = 41;

        for (int i = 0; i < inputString.length(); i++) {
            String subStr = "";
            int sum = 0;
            for (int j = i; j < inputString.length(); j++) {
                char ch = inputString.charAt(j);
                subStr = subStr + ch;
                sum = sum + ((int) ch - 96);
                if (sum == n) {
                    System.out.println(subStr);
                    subStr = "";
                    break;
                }
                if (sum > n) {
                    subStr = "";
                    break;
                }
            }
        }
    }
}
