package collection;

import java.util.ArrayList;
//(1)It can  allows homogeneous elements.
//
//(2)it is not fixed in size.
//
//(3)lots of utility methods.
public class ForEachEx {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("orange");

		al.add("apple");

		al.add("grapes");

		al.add("kiwi");

		al.add("banana");

		al.add("carrot");
		
		for(String fruit :al) {					//Enhanced for loop
			System.out.println(fruit);
		}
	}

}
