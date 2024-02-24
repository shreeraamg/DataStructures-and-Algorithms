package problemSolving.recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        // Here we are printing the Nth Fibonacci number
        // Considering the fibonacci series as
        // [ 1, 1, 2, 3, 5, 8, 13, 21,... ]
        System.out.println(fibonacciOf(8));
    }

     private static int fibonacciOf(int n) {
        if(n <= 2)
            return 1;

        return fibonacciOf(n-1) + fibonacciOf(n-2);
    }
}
