package lab1.classes;

import java.util.Scanner;

public class CheckNumber {
	// method to check whether the number is a power of 2 or not
	boolean checkNumber(int n) {
		if (n == 0)
			return false;

		while (n != 1) {
			if (n % 2 == 0) {
				n /= 2;
			}

			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		// variable declaration and initialization
		int num = 0;
		// input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check if it is in power of 2 or not");
		num = sc.nextInt();
		// object creation
		CheckNumber check = new CheckNumber();
		// method calling
		boolean res = check.checkNumber(num);
		// printing the result
		if (res == true) {
			System.out.println("Yes it is in the power of 2");
		} else
			System.out.println("No it is not in the power of 2");
	}
}
