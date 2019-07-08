package lab1.operators;

import java.util.Scanner;

public class SumOfCube {
	public static void main(String[] args) {
		// variables
		Scanner sc = new Scanner(System.in);
		int n = 0, sum = 0, num = 0;
		// input from user
		System.out.println("Enter number to find the cubes of the digit");
		n = sc.nextInt();
		// logic to find the sum
		while (n > 0) {
			num = n % 10;
			sum += (num * num * num);
			n /= 10;
		}
		System.out.println("Sum of Cube of all the digit of the number is \n" + sum);
	}

}
