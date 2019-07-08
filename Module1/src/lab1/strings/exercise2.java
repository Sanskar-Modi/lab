package lab1.strings;

import java.io.*;
import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Name ");
		String fileName = sc.nextLine();
		fileName +=".txt";

		// file creation and input

		File f = new File(fileName);
		FileWriter writer = new FileWriter(f);
		writer.write("a");
		writer.write('b');
		writer.write('c');
		writer.write('d');
		writer.flush();
		writer.close();
		sc.close();

		// file reading and printing
		FileReader reader = new FileReader(f);
		int i = reader.read();
		int line = 1;

		if (f.exists()) {
			while (i != -1) {
				System.out.println("Line Number : " + line);
				System.out.println((char) i);
				i = reader.read();
				line++;
			}
			reader.close();
		} else {
			System.out.println("File Not Found");
		}

	}

}
