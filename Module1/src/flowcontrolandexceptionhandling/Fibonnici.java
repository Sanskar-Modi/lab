package flowcontrolandexceptionhandling;

import java.util.Scanner;

//main class
public class Fibonnici {
	// main method
	public static void main(String[] args) {

		// variable declaration and initialization
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int n = sc.nextInt();
		int i = 0, a = 0, b = 1, c;

		System.out.println("Fibonnici series using loop"+0);
		System.out.println("Fibonnici series using loop"+1);

		// logic to calculate fibonnici series using non-recursive method
		for (i = 2; i <= n; i++) {
			c = a + b;
			System.out.println("Fibonnici series using loop" + c);
			a = b;
			b = c;
		}

		// printing fibonicci using recursion

		for (i = 0; i <=n; i++) {
			
			System.out.println("Fibonnici series using recursion" + calcFib(i));
		}

	}
 
	//logic for calc fibonnici using recursion
	static int calcFib(int n) {
		
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return calcFib(n - 1) + calcFib(n - 2);
	}

}
