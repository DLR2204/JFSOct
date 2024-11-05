package exceptions;

class AgeNotValidException extends Exception{
	
	private int age;
	
	public AgeNotValidException(int age) {
		this.age = age;
	}
}

public class ExceptionEx1 {
	
	public static void validation(int age) throws AgeNotValidException {
		if(age>18) {
			System.out.println("You r eligible to vote.");
		}
		
		else {
			throw new AgeNotValidException(age);
		}
		
	}
	
	public static void main(String[] args) throws AgeNotValidException {
		
		validation(4);
	}
	

}
