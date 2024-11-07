package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {

		TreeMap tm = new TreeMap();

		tm.put(100, "Divyam");

		tm.put(104, "Naresh");

		tm.put(102, "Ramesh");
		
		tm.put(101, "Sankeerth");

		tm.put(103, "Suresh");

		tm.put(106, "Rajesh");

		tm.put(105, "Mahesh");

		
		
		
		Set set = tm.keySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			
			int keys = (int) itr.next();
			
			System.out.println(keys + " = " + tm.get(keys));
		}
		

	}

}
