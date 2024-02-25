// https://leetcode.com/problems/partition-array-according-to-given-pivot/description/
package problemSolving.arrays;
import java.util.Arrays;

public class ArrayPartitionPivot {
    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        System.out.println(Arrays.toString(pivotArray(nums, 10)));
    }

    static int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int position = 0;

        for (int num : nums) {
            if (num < pivot) {
                result[position] = num;
                position++;
            }
        }

        for (int num : nums) {
            if (num == pivot) {
                result[position] = num;
                position++;
            }
        }

        for (int num : nums) {
            if (num > pivot) {
                result[position] = num;
                position++;
            }
        }

        return result;
    }
}
