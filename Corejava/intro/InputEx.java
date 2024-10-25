package intro;

import java.util.Scanner;

public class InputEx {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your age:-");
		
		byte age = scan.nextByte();
		
		System.out.println("Your age is:-"+age);
		
		
	}

}
