package flowcontrolandexceptionhandling;
import java.util.Scanner;

public class UserName {
	public static void main(String[] args) throws TestClass {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String fname = sc.nextLine();
		System.out.println("Enter last name");
		String lname =sc.nextLine();
		validate(fname,lname);
		sc.close();
	}

	static void validate(String fname, String lname) throws TestClass {
		if(fname.isEmpty())
		{
			throw new TestClass();
		}
		if(lname.isEmpty())
		{
			throw new TestClass();
		}
		else
			System.out.println("WELCOME");
	}

}
class TestClass extends Exception
{
	TestClass()
	{
		
	}

	public String toString(String msg) {
		return msg+"Blank";
	}
}
