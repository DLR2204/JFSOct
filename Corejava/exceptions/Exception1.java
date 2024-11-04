package exceptions;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the numerator:-");
		
		int num = scan.nextInt();
		
		System.out.print("Please enter the denominator:-");
		
		int den = scan.nextInt();
		
		try {
		
		int result = num/den;
		
		System.out.println("The division result is:-"+result);
		}
		catch(Exception e) {
		
		System.out.println("Please don't enter zero as the denominator");
		
		System.out.println(e);
		
		}
		finally { 
			System.out.println("hello everyone");	
			}
		
		System.out.println("the remaining 10,000 lines of code");
		
	}
}
