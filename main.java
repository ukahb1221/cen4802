import java.util.Scanner;
/**
 * 
 * @author ukahb
 *This method return the nth fibonacci number
 */
public class main {
	public static int fibonacci(int n) {
		if (n <= 1)
			return n;
		// Call the function fibonacci()
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
/**
 This method takes an integer from the user and recursively calls on the fibonaccit() method.
 

 * @param args An integer that is run through the fibbonacci method. 
 * @return The nth user from the user input
 */
	public static void main(String[] args) {
		//Declare one variable n
		int n;
		
		Scanner scan = new Scanner(System.in);
		//Get the nth user value
		System.out.println("Enther value of n: ");
		n = scan.nextInt();
		//Print the nth number in the sequence
		System.out.println("The " + n + "th term of the Fibonacci sequence is " + fibonacci(n));
	}

}
