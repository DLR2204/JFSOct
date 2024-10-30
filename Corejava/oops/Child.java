package oops;

class GrandParent{
	public void displayMsg() {
		System.out.println("Iam from the grandParent class");
	}
}

class Parent extends GrandParent{
	
	public void display() {  //dynamic -void
		System.out.println("Iam from the parent class");
	}
	
	public void add(int a,int b) { //dynamic-void
		System.out.println("The sum of a and b is:-"+(a+b));
		
	}
}



public class Child extends Parent{
	
	public static void main(String[] args) {
		
		Child obj = new Child();
		
		obj.add(12,34);
		
		obj.display();
		
		obj.displayMsg();
		
	}

}
