package intro;

public class VariableEx1 {
	
	static int staticCounter;  //static global var
	
	int instanceCounter;		//instance global var
	
	public void counter() {
		
		staticCounter++;  //staticCounter = staticCounter+1
		
		instanceCounter++;
		
	}
	
	public void display() {
		System.out.println("StaticCounter:-"+staticCounter);
		System.out.println("InstanceCounter:-"+instanceCounter);
	}
	
	public static void main(String[] args) {
		
		VariableEx1 obj1 = new VariableEx1();
		
		VariableEx1 obj2 = new VariableEx1();
		
		VariableEx1 obj3 = new VariableEx1();
		
		obj1.counter();
		
		obj2.counter();
		
		obj3.counter();
		
		obj3.counter();
		
		obj3.display();
		
		
	}
	

}
