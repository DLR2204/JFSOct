package intro;

public class ConstructorEx {
	
	public ConstructorEx() {   //default constructor
		System.out.println("6.Iam from the default constructor......");
	}
	
	
	public ConstructorEx(String name) {		//parametrized constructor
		System.out.println("11.Iam from the parametrized constructor");
		
		System.out.println("13.My name is :-"+name);
	}

	public static void main(String[] args) {
		
		ConstructorEx obj = new ConstructorEx("Likitha");   //object
		
	}
	
}
