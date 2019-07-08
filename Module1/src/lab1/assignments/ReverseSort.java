package lab1.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSort {
	int[] getSorted(int a[]) {
		int i = 0, j = 0;
		int length = a.length;//3
		
		// reversing the array
		int b[] = new int[length];//3
		for (i =length-1; i >= 0; i--)//2 
		{
			for (j = 0; j < length; j++)//3
			{
				b[j] = a[i];//2
				i--;
				//break;
			//System.out.println(b[j]);
			}
			
		}
		for (i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		Arrays.sort(b);
		return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("Enter the length of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (i = 0; i < arr.length; i++) {
			System.out.println("Enter element");
			int num = sc.nextInt();
			arr[i] = num;
		}
		ReverseSort re = new ReverseSort();
		arr = re.getSorted(arr);
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
