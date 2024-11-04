package intro;

public class MethodEx {

	public void display() {     //dynamic -void
		System.out.println("Hello Everyone!!!");
	}
	
	public static String hello() {   //static-String
		return "Im from hello method";
	}
	
	public int add(int a,int b) { //dynamic -int
		return (a+b);
	}
	
	public static void main(String[] args) { //static-void
		
		MethodEx obj = new MethodEx();
		
		obj.display();
		
		System.out.println(hello());
		
		System.out.println(obj.add(3, 8));
		
		
	}
}

