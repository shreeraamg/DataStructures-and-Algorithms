/*
 * You are given an array of characters 'input' and a character 'leader' that appears in 'input'.
 * Return an array of integers, such that result[i] is the shortest distance between input[i] to 'leader' in 'input'
 */
package problemSolving.arrays;
import java.util.Arrays;

public class NearestLeadingCharacter {
    public static void main(String[] args) {
        char[] input = {'I', 'L', 'O', 'V', 'E', 'Z', 'O', 'H', 'O'};
        char leader = 'O';

        int[] output = new int[input.length];

        for(int i=0; i<input.length; i++) {
            for(int left=i, right=i; left >=0 || right <input.length; left--, right++) {
                if(left >=0 && input[left] == leader) {
                    output[i] = i - left;
                    break;
                }

                if(right < input.length && input[right] == leader) {
                    output[i] = right - i;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(output));
    }
}
