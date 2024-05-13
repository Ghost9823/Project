import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char operator;
        double number1, number2, result;

        System.out.println("Welcome to Calculator");

        System.out.println("Enter first number:");
        number1 = input.nextDouble();

        System.out.println("Enter second number:");
        number2 = input.nextDouble();

        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }

        input.close();
    }
}
