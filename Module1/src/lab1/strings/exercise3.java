package lab1.strings;

import java.util.Scanner;

public class exercise3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s;
		s = sc.next();
		s+=sc.nextLine();
		
		
		int i=0,wc=1,cc=0,lc=1;
		
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ') {
				wc+=1;
			}
			if(s.charAt(i)=='\n') {
				lc+=1;
			}
			else
			{
				cc++;
			}
		}
		
		System.out.println("No of characters "+cc);
		System.out.println("No of words "+wc);
		System.out.println("No of lines "+lc);
		
		sc.close();
	}

}
