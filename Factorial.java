import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Use try-with-resources to automatically close the scanner
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            int factorial = 1;
            for(int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("The factorial of " + number + " is " + factorial);
        }
    }
}