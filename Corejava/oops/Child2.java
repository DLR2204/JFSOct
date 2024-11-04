package oops;

class Parent1{
	
	public void display() {
		System.out.println("Im from parent class");
	}
	
	public int add(int a,int b) {
		return (a*b);
	}
}

public class Child2 extends Parent1{
	
	@Override
	public int add(int a,int b) {
		return (a+b);
	}
	

	public static void main(String[] args) {
		Child2 obj = new Child2();
		
		System.out.println(obj.add(23, 45));
		
		obj.display();
	}
	
	
	
}
