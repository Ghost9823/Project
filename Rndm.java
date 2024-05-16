import java.util.Random;
import java.util.ArrayList;

public class Rndm {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100)); // Generate random numbers between 0 and 99
        }

        System.out.println("Generated numbers: " + numbers);
    }
}