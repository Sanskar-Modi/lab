package lab1.classes;

import java.util.Scanner;

public class CalculateSum {

	// sum method to calculate divisibility and sum
	int calculateSum(int n) {
		// variables declaration and initialization

		int sum = 0, i = 0;
		// loop to check divisibility and calculate sum

		for (i = 0; i <= n; i++) {
			// check divisibility
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	// main method
	public static void main(String[] args) {
		// object creation
		CalculateSum cal = new CalculateSum();
		// taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check the sum of numbers divisible by 3 or 5");
		int num = sc.nextInt();
		// storing the result return by the function
		int res = cal.calculateSum(num);
		// printing the result
		System.out.println("Sum is " + res);
	}
}
