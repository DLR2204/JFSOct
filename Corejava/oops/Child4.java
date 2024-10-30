package oops;
class Parent3{
	
	public void marriage() {
		System.out.println("Bride name is:- Kajol");
	}
	
	public void display() {
		
		System.out.println("Iam from the parent class");
	}
	
}


public class Child4 extends Parent3 {
	
	public static void main(String[] args) {
		
		
		Child4 obj = new Child4();
		
		obj.display();
		
		obj.marriage();
	}
	
	@Override
	public void marriage() {
		System.out.println("Bride name is:- deepika");
	}
	

}
