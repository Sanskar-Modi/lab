package lab1.assignments;

import java.util.Scanner;

public class Conversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("Enter length of an String array");
		int n = sc.nextInt();
		String arr[] = new String[n];
		for (i = 0; i < n; i++) {
			System.out.println("Enter String");
			String s = sc.next();
			s += sc.nextLine();
			arr[i] = s;
		}
		Conversion conv = new Conversion();
		conv.convert(arr);
	}

	private void convert(String[] arr) {

		int length = arr.length;
		int mid = length / 2;
		int i = 0;
		// logic to convert when length is even
		if (length % 2 == 0) {
			for (i = 0; i < mid; i++) {
				arr[i] = arr[i].toUpperCase();
			}
			for (i = mid; i < length; i++) {
				arr[i] = arr[i].toLowerCase();
			}
		}
		// logic to convert when length is odd
		else {
			mid += 1;
			for (i = 0; i < mid; i++) {
				arr[i] = arr[i].toUpperCase();
			}
			for (i = mid; i < length; i++) {
				arr[i] = arr[i].toLowerCase();
			}
		}

		// to print
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
