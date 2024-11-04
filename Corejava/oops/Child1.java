package oops;

interface ParentA{
	
	public int add(int a,int b);
}

interface ParentB{
	
	public int add(int a,int b);
}


public class Child1 implements ParentA,ParentB{

	@Override
	public int add(int a, int b) {
		
		return (a+b);
	}
	
	public static void main(String[] args) {
		
		Child1 obj = new Child1();
		
		System.out.println(obj.add(34, 54));
	}

}
