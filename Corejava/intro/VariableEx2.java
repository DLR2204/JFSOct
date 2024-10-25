package intro;

public class VariableEx2 {
	
	static String name1 = "jack";  //static global var
	
	String name2 = "rose";   //instance global var
	
	public static void main(String[] args) {
		
		VariableEx2 obj = new VariableEx2();
		
		System.out.println(obj.name2);
		
		System.out.println(obj.name1);
		
	}

}
