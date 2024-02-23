package dataStructures;

public class Main {
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println(queue.pop());
    }
}
