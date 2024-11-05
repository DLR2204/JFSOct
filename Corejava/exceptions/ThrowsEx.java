package exceptions;

public class ThrowsEx {

	public static int div(int a, int b) throws ArithmeticException {
		return (a / b);
	}

	public static void main(String[] args) {
		
		System.out.println(div(20 , 0));
		
	}
}
