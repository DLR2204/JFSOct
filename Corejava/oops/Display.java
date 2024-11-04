package oops;

public interface Display {
	
	public void display();

}
































class DisplayMsg implements Display{

	@Override
	public void display() {
		System.out.println("Hello Everyone ...Im from Display Interface");
		
	}
	
	
	
}