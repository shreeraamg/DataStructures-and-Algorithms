// https://leetcode.com/problems/implement-queue-using-stacks/description
package dataStructures;

class QueueUsingStacks {
    private Stack main;
    private Stack helper;

    public QueueUsingStacks() {
        this.main = new Stack();
        this.helper = new Stack();
    }

    public void push(int item) {
        main.push(item);
    }

    public int pop() {
        while(!main.empty()) {
            helper.push(main.pop());
        }

        int removed = helper.pop();

        while(!helper.empty()) {
            main.push(helper.pop());
        }

        return removed;
    }

    public int peek() {
        while(!main.empty()) {
            helper.push(main.pop());
        }

        int top = helper.peek();

        while(!helper.empty()) {
            main.push(helper.pop());
        }

        return top;
    }

    public boolean empty() {
        return main.empty();
    }

    private static class Stack {
        private int[] dataArr;
        private int pointer = 0;

        public Stack() {
            this.dataArr = new int[100]; // Since it's mentioned as 100 in the question.
        }

        public void push(int item) {
            dataArr[pointer++] = item;
        }

        public int pop() {
            return dataArr[--pointer];
        }

        public int peek() {
            return dataArr[pointer - 1];
        }

        public boolean empty() {
            return pointer == 0;
        }
    }
}