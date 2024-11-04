package oops;

public class MethodOverloadingEx {
	
	public void add(int a,int b) {
		System.out.println("6.The sum of two integers is:- "+(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("9.The sum of three integers is:- "+(a+b+c));
	}
	public void add(float a,int b) {
		System.out.println("12.The sum of a float,int is:- "+(a+b));
	}
	public void add(int a,float b) {
		System.out.println("15.The sum of an int,float is:- "+(a+b));
	}
	public void add(float a,float b) {
		System.out.println("18.The sum of two floats is:- "+(a+b));
	}

	public static void main(String[] args) {
		MethodOverloadingEx obj = new MethodOverloadingEx();
		
		obj.add(34f, 34f);
		
	
	}
}
