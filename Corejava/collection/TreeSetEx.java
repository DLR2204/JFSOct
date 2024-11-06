package collection;

import java.util.Comparator;
import java.util.TreeSet;
//(1)It can  allows both heterogeneous/homogeneous elements.
//
//(2)it is not fixed in size.
//
//(3)lots of utility methods.

//Set:-
//
//(4)Duplicates are not allowed 
//
//(5)Insertion order is not preserved -alphabetical/ascending order
public class TreeSetEx {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet(new MyOrder());

		ts.add("orange");

		ts.add("apple");

		ts.add("grapes");

		ts.add("kiwi");

		ts.add("banana");

		ts.add("carrot");

		ts.add("orange");

		ts.add("apple");

		ts.add("grapes");

		ts.add("kiwi");

		ts.add("banana");

		ts.add("carrot");

		System.out.println(ts);

	}

}

class MyOrder implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		return -((String) o1).compareTo((String) o2);
	}
	
	
	
}
