// https://leetcode.com/problems/min-stack/description/
package problemSolving.stacksAndQueues;

public class MinStack {
    private Node[] data;
    private int pointer = -1;

    public MinStack() {
        this.data = new Node[100];
    }

    public void push(int val) {
        if(isEmpty()) {
            Node node = new Node(val);
            data[++pointer] = node;
            return;
        }

        if(isFull()) {
            Node[] doubleTheSize = new Node[data.length * 2];
            System.arraycopy(data, 0, doubleTheSize, 0, data.length);
            data = doubleTheSize;
        }

        int min = Math.min(getTopMin(), val);
        Node node = new Node(val, min);
        data[++pointer] = node;
    }

    public int pop() {
        return data[pointer--].val;
    }

    public int top() {
        return data[pointer].val;
    }

    public int getMin() {
        return data[pointer].min;
    }

    private int getTopMin() {
        return data[pointer].min;
    }

    private boolean isFull() {
        return pointer == data.length - 1;
    }

    private boolean isEmpty() {
        return pointer == -1;
    }

    private static class Node {
        int val;
        int min;

        public Node(int val, int min) {
            this.val = val;
            this.min = min;
        }

        public Node(int val) {
            this(val, val);
        }
    }
}