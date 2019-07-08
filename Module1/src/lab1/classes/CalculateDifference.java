package lab1.classes;

import java.util.Scanner;
import java.math.*;

public class CalculateDifference {
	// variable declaration and initialization
	int diff = 0, i = 0, sum = 0;
	double sumSquare = 0, squareSum = 0;

	// method to calculate difference
	int calculateDifference(int n) {
		for (i = 0; i <= n; i++) {
			sum += i;
			sumSquare += Math.pow(i, 2);
		}
		squareSum = Math.pow(sum, 2);
		diff = (int) (sumSquare - squareSum);
		return diff;
	}

	public static void main(String[] args) {
		// Object creation
		CalculateDifference cal = new CalculateDifference();
		// taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find difference");
		int num = sc.nextInt();
		int res = cal.calculateDifference(num);
		System.out.println("Result " + res);
	}

}
