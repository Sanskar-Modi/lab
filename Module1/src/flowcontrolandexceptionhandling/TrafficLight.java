package flowcontrolandexceptionhandling;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		// variable
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for red");
		System.out.println("Enter 2 for yellow");
		System.out.println("Enter 3 for green");
		// input
		System.out.println("Enter Choice");
		choice = sc.nextInt();
		// logic
		switch (choice) {
		case 1:
			System.out.println("Red");
			break;
		case 2:
			System.out.println("Yellow");
			break;
		case 3:
			System.out.println("Green");
			break;
		default:
			System.out.println("Choose correct Option");
		}

	}

}
