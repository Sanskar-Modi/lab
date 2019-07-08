package lab1.assignments;

import java.util.Scanner;

public class GetsecondSmallest {
	int getSecondSmallest(int a[]) {
		// variables
		int i, j, temp;
		// sorting
		for (i = 0; i < a.length; i++) {

			for (j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		// returning the second largest element after sorting
		return a[1];
	}

	public static void main(String[] args) {
		// variables
		int i = 0, element, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		n = sc.nextInt();
		int arr[] = new int[n];

		// input from user
		for (i = 0; i < n; i++) {
			System.out.println("Enter elements");
			element = sc.nextInt();
			arr[i] = element;
		}
		// object creation
		GetsecondSmallest small = new GetsecondSmallest();
		// getting and printing the second largest element
		int res = small.getSecondSmallest(arr);
		System.out.println("Second Smallest Element of an array " + res);
	}

}
