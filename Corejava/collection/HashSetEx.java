package collection;

import java.util.HashSet;
//(1)It can  allows both heterogeneous/homogeneous elements.
//
//(2)it is not fixed in size.
//
//(3)lots of utility methods.

//Set:-
//
//(4)Duplicates are not allowed 
//
//(5)Insertion order is not preserved -random order
public class HashSetEx {

	public static void main(String[] args) {

		HashSet hs = new HashSet();

		hs.add(123);

		hs.add("hello");

		hs.add(3.14f);

		hs.add('c');

		hs.add(true);

		hs.add(123);

		hs.add("hello");

		hs.add(3.14f);

		hs.add('c');

		hs.add(true);
		
		System.out.println(hs);
	}
}
