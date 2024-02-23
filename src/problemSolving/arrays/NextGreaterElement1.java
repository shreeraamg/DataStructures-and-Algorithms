// https://leetcode.com/problems/next-greater-element-i/description
package problemSolving.arrays;
import java.util.Arrays;

public class NextGreaterElement1 {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 2, 3, 4};

        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for(int i=0; i<nums1.length; i++) {
            int index = search(nums2, nums1[i]);
            int greaterElement = -1;

            for(int j=index+1; j<nums2.length; j++) {
                if(nums2[j] > nums1[i]) {
                    greaterElement = nums2[j];
                    break;
                }
            }
            ans[i] = greaterElement;
        }

        return ans;
    }

    static int search(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
}
