package lab1.strings;

import java.util.*;

public class excercise7 {

	public static void main(String[] args) {

		boolean valid = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		name += "_job";

		// logic to check the value of name after_job

		int i = name.indexOf("_");
		String s = name.substring(0, i);
		System.out.println(s);
		valid = validate(s);

		// printing the result
		if (valid == true) {

			System.out.println("Valid name " + name);
			sc.close();
		} else {
			System.out.println("Invalid name");
			sc.close();
			return;
		}

	}

	// method to validate

	static boolean validate(String name) {
		boolean res = false;

		// logic to check the length

		if (name.length() < 8) {
			res = false;
		} else
			res = true;

		return res;
	}
}
