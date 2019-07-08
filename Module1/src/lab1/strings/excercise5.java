package lab1.strings;
import java.util.*;

public class excercise5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String s = sc.nextLine();
		char prev = s.charAt(0);
		boolean res = false;
		
		for(int i = 0; i<s.length();i++)
		{
			if(s.charAt(i)>=prev)
			{
				res = true;
				prev = s.charAt(i);
			
			
			}
			else
			{
				res = false;
						
			}
		}
		
		if(res == false)
		{
			System.out.println("It is not a positive string");
		}
		else if(res == true)
		{
			System.out.println("Positive String ");
		}
		
		sc.close();
	}
}
