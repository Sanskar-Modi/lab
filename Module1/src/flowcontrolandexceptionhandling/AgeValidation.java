package flowcontrolandexceptionhandling;

import java.util.Scanner;

public class AgeValidation {

	// main method
	public static void main(String[] args) throws Test2 {
		System.out.println("Enter age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		validateAge(age);

	}

	// validation method to check and throw Exception
	static void validateAge(int age) throws Test2 {
		if (age >= 15) {
			System.out.println("Hello");
		} else {
			throw new Test2();
		}
	}
}

// class to test user defined exception

class Test2 extends Exception {
	Test2() {

	}

	public String toString() {
		return "You are Under age";
	}
}
