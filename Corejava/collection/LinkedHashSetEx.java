package collection;

import java.util.LinkedHashSet;
//(1)It can  allows both heterogeneous/homogeneous elements.
//
//(2)it is not fixed in size.
//
//(3)lots of utility methods.

//Set:-
//
//(4)Duplicates are not allowed 
//
//(5)Insertion order is preserved -insertion order
public class LinkedHashSetEx {
	
	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		

		lhs.add(123);

		lhs.add("hello");

		lhs.add(3.14f);

		lhs.add('c');

		lhs.add(true);

		lhs.add(123);

		lhs.add("hello");

		lhs.add(3.14f);

		lhs.add('c');

		lhs.add(true);
		
		
		System.out.println(lhs);
	}

}
