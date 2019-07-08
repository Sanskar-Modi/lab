package lab1.classes;

import java.util.Scanner;

public class IncreasingOrder {

	boolean checkNumber(int n) {
		
		boolean res = false;
		
		int num =n%10;
		
		n/=10;
		if(n==0)
		{
			return false;
		}
		  while(n>0)
		  {
			  
			  if(num<=n%10)
			  {
				  res = true;
				  break;
			  }
			
			  num = num%10;
			  n/=10;
		  }
		    return res;
	}

	public static void main(String[] args) {

		IncreasingOrder inc = new IncreasingOrder();
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check if it is in increasing order or not");
		num = sc.nextInt();
		boolean result = inc.checkNumber(num);
		if (result == true) {
			System.out.println("It is not in increasing order");
		} else
			System.out.println("It is in increasing order");
		sc.close();
	}
}
