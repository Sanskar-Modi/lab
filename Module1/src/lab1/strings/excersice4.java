package lab1.strings;

import java.util.Scanner;
import java.io.*;

public class excersice4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Name ");
		String filename = sc.nextLine();
		filename+=".txt";
		
		File f = new File(filename);

		
		if (f.exists()) {
			System.out.println("File Exists!!");
		
		
		if (f.canRead()) {
			System.out.println("File is readable");
		}
		
		if(f.canWrite())
		{
			System.out.println("File is writable");
		}
		
		System.out.println("Length of file "+f.length());
		System.out.println("Type = "+filename.substring(filename.lastIndexOf(".")));
		
		}
		else
		{
			System.out.println("File doesn't exists");
		}

		sc.close();
	}
}
