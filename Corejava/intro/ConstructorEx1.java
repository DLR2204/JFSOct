package intro;

public class ConstructorEx1 {

	public ConstructorEx1() {
		this("apple");      //constructor callin
	}

	public ConstructorEx1(String name) {
		this("boll","cat");   //constuctor calling
		System.out.println(name );
	}

	public ConstructorEx1(String name, String name1) {
		this("den","egg","fish");
		System.out.println(name + "  " + name1 );
	}

	public ConstructorEx1(String name, String name1, String name2) {
		this("girl","hen","ink","jam");
		System.out.println(name + "  " + name1 + "  " + name2 );
	}

	public ConstructorEx1(String name, String name1, String name2, String name3) {

		System.out.println(name + "  " + name1 + "  " + name2 + "  " + name3);
	}

	public static void main(String[] args) {
		
		ConstructorEx1 obj = new ConstructorEx1();  //default constr
	}
}
