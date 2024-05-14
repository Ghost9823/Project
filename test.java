public class test {
    public static void main(String[] args) {
        // Write code for Fibonacci sequence
        int n = 10; // number of terms
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.print("Fibonacci Sequence: " + firstTerm + ", " + secondTerm);
        for (int i = 3; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
    }
}