package oops;

public interface Calculator {
	
	public void add(int a,int b);
	
	public void sub(int a,int b);
	
	public void mul(int a,int b);
	
	public void div(int a,int b);

}
























class Child2 implements Calculator{

	@Override
	public void add(int a, int b) {
	System.out.println(a+b);
		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println(a-b);
		
	}

	@Override
	public void mul(int a, int b) {
		System.out.println(a*b);
		
	}

	@Override
	public void div(int a, int b) {
		System.out.println(a/b);
		
	}
	
	
	
	
}