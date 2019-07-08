package lab1.collections;

import java.util.*;
import java.util.Map.Entry;

public class CollectionExercise1 {

	public static void main(String[] args) {

		HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>();
		h1.put(8, 108);
		h1.put(1, 111);
		h1.put(2, 102);
		h1.put(5, 105);
		ArrayList al1 = new ArrayList();
		al1 = (ArrayList) getValues(h1);

		System.out.println(al1);
	}

	static List getValues(HashMap h1)

	{
		ArrayList l = new ArrayList();

		Set s = h1.entrySet();
		Iterator i = s.iterator();

		while (i.hasNext()) {
			Entry e = (Entry) i.next();
			l.add(e.getValue());
		}

		Collections.sort(l);

		return l;

	}
}
