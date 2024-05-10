import java.util.Scanner;

class algebra {
    int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

public class Bon {
    public static void main(String[] args) {
        algebra obj = new algebra();
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter two numbers:");
            int a = scn.nextInt();
            int b = scn.nextInt();
            int result = obj.add(a, b);
            System.out.println("Sum of a and b is: " + result);
        } //catch (Exception e) {
           // e.printStackTrace();
        }
    }
//}