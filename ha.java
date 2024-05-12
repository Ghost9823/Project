import java.util.Scanner;

public class ha {
    static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            int n = scn.nextInt();
            System.out.println("Fibonacci(" + n + ") = " + fib(n));
        }
    }
}
