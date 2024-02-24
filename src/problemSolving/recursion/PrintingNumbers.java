package problemSolving.recursion;

public class PrintingNumbers {
    public static void main(String[] args) {
        print(1, 10);
    }

    static void print(int from, int to) {
        // If the recursive function (printAscending) is called before executing its own logic
        // it is HEAD RECURSION, or if it's called after executing its logic, it is TAIL RECURSION
        if(from == to)
            return;
        print(from+1, to); // -> Head Recursion
        System.out.println(from);
        // print(from+1, to); // -> Tail Recursion
    }
}
