package lab1.assignments;

public class CountOccurence {
	void countOccur(char a[]) {
		//variable
		int i = 0, j = 0, count = 0;
		//logic to count 
		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[j] == a[i]) {
					count++;
				}
			}
		}
		//printing the count
		System.out.println(count + 1);
		
		

	}

	public static void main(String[] args) {
		//charcter array
		
		char arr[] = { 'a', 'b', 'c', 'a' };
		//object creation
		CountOccurence cout = new CountOccurence();
		//method calling through object
		cout.countOccur(arr);
	}

}
