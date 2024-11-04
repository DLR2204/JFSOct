package oops;

class GrandParent{
	public void hi() {
		System.out.println("Iam from grand parent");
	}
}

class Parent extends GrandParent{
	public void display() {
		System.out.println("Im from the parent class");
	}
	
	public int add(int a,int b) {
		return (a+b);
	}
}

public class Child extends Parent{
	
	public static void main(String[] args) {
		
		Child obj = new Child();
		
		obj.display();
		
		System.out.println(obj.add(34, 46));
		
		obj.hi();
		
	}

}
