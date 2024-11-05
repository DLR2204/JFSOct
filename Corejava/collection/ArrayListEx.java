package collection;

import java.util.ArrayList;
import java.util.Collections;

//(1)It can  allows both heterogeneous/homogeneous elements.
//
//(2)it is not fixed in size.
//
//(3)lots of utility methods.

//List:-
//
//(4)Duplicates are allowed 
//
//(5)Insertion order is preserved

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(124);

		al.add("Sankeerth");

		al.add("Divyam");

		al.add(true);

		al.add(3.1f);

		al.add('c');

		al.add(124);

		al.add("Sankeerth");

		al.add("Divyam");

		al.add(true);

		al.add(3.1f);

		al.add('c');

		System.out.println(al);

	}

}
