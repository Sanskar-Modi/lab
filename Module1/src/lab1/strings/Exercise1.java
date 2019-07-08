
package lab1.strings;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s,",");
		int n =0,sum =0;
		while(st.hasMoreTokens())
		{
			
			n = Integer.parseInt(st.nextToken());
			sum+=n;
		
		}
		System.out.println(sum);
		sc.close();
		
		
	}

}
