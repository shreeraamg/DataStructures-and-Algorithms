// https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/
package problemSolving.linkedlist;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaximumTwinSum {
    public int pairSum(ListNode head) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while(fastPointer != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        while(slowPointer != null) {
            queue.add(slowPointer.val);
            stack.push(head.val);
            slowPointer = slowPointer.next;
            head = head.next;
        }

        int max = 0;

        while(!queue.isEmpty() && !stack.isEmpty()) {
            int sum = queue.poll() + stack.pop();
            max = Math.max(sum, max);
        }

        return max;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
