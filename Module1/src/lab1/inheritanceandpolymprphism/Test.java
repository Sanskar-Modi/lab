package lab1.inheritanceandpolymprphism;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
  //for book details
  Book b = new Book();
  b.setAuthor("Sanskar Modi");
  b.setIdNum(123);
  b.setNoOfCopies(1254);
  b.setTitle("Java");
  System.out.println("Author "+b.getAuthor());
	}
	
}
