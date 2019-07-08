package lab1.collections;
import java.util.*;

public class CollectionExcercise2 {
	
	public static void main(String[] args) {
		
		String s = "Capgemini";
		char a[]= s.toCharArray();
		HashMap<Character,Integer> h1 = new HashMap<Character,Integer>();
		h1 = countChar(a);
		System.out.println(h1);
	}

	private static HashMap countChar(char[] a) {
		
		HashMap<Character,Integer> h2 = new HashMap<Character,Integer>();
		
		 for(char b:a)
		 {
			 if(h2.containsKey(b))
			 {
				 h2.put(b,h2.get(b)+1);
			 }
			 else
				 h2.put(b,1);
		 }
		return h2;
		
	}

}
