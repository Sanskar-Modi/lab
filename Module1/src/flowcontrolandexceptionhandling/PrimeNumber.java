package flowcontrolandexceptionhandling;
import java.util.Scanner;

//main class
public class PrimeNumber {
	
	//main method
	public static void main(String[] args) {
		
		//variable initialization and declaration
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range to Print Prime Number between the range ");
		int range = sc.nextInt();
		int i,j;
		 
		//logic to find prime number between the range
		
		for(i=1;i<=range;i++)
		{ 
			int count =0;
			for(j=2;j<=i-1;j++)
			{
				if(i==1)
					continue;
				if(i%j==0)
				{
					count+=1;
				}
			}
			if(count==0)
			{
				System.out.print(" "+i);
			}
		}
		sc.close();
	}

}
