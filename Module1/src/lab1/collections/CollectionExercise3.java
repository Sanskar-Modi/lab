package lab1.collections;
import java.util.*;

public class CollectionExercise3 {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,8};
		HashMap<Integer,Integer> h1 = new HashMap<Integer,Integer>();
		h1 =getSquares(arr);
		System.out.println(h1);

	}
	static  HashMap getSquares(int arr[])
	{

		HashMap<Integer,Integer> h2 = new HashMap<Integer,Integer>();

		for(int value:arr)
		{
			if(!h2.containsKey(value))
			{
				h2.put(value,value*value);
			}
		}
		return h2;
	}
}
