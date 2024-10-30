package oops;

public class MethodOverloading {
	
	public void add(int a,int b) {
		System.out.println("6.The sum of two integers is:-"+(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("9.The sum of three integers is:-"+(a+b+c));
	}
	public void add(int a,float b) {
		System.out.println("12.The sum of one int,float is:-"+(a+b));
	}
	public void add(float a,int b) {
		System.out.println("15.The sum of one float,int is:-"+(a+b));
	}
	public void add(float a,float b) {
		System.out.println("18.The sum of two floats is:-"+(a+b));
	}

	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.add(1,2);
		
		
	}
}
