package flowcontrolandexceptionhandling;
import java.util.Scanner;

//user defined test class
class Test1 extends Exception {
	int sal;

	Test1(int sal) {
		this.sal = sal;
	}

	public String toString() {
		return "Salary less than 3000";
	}
}

// main class
public class EmployeeException {
	public static void main(String[] args) throws Test1 {
		
		EmployeeException e = new EmployeeException();
		System.out.println("Enter Salary");
		Scanner sc = new Scanner(System.in);
		int sal = sc.nextInt();
		e.validate(sal);

	}
	// method which throws exception

	static void validate(int sal) throws Test1 {

		if (sal < 3000) {
			
			throw new Test1(sal);
		}
		else
		{
		
			System.out.println("WELCOME");
		}
	}
}
