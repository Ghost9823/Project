// Fibonacci Series using Recursion

import java.util.Scanner;

class Fibonacci {
	static int fib(int n)
	{
		if (n==0)
			return 0;
	else if(n==1 || n==2)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String args[])
	{
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            //int n = 9;
            System.out.println(fib(n));
        }
	}
}
public class Fibonaci {
    public static void main(String[] args) {

    }
/* This code is contributed by Musharraf Hassan */

}
