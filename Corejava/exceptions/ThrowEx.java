package exceptions;

public class ThrowEx {

	public static void valid(int age) {
		
		if(age>18) {
			System.out.println("you are allowed to vote");
		}
		else {
			throw new ArrayIndexOutOfBoundsException();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		valid(12);
		
		
		
	}
}
