// https://leetcode.com/problems/maximum-subarray/description/
package problemSolving.arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;

        for(int i : nums) {
            if(currentSum < 0)
                currentSum = 0;
            currentSum += i;
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
