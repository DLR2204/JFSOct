package intro;

public class VariableEx3 {
	
	static String nationality = "Indian";
	
	int aadhar ;
	
	public String display() {
		
		return  ("		Nationality:-"+nationality+"		Aadhar Number:-"+aadhar);
		
	}
	
	public static void main(String[] args) {
		
		VariableEx3 ramesh = new VariableEx3();
		
		VariableEx3 suresh = new VariableEx3();
		
		VariableEx3 naresh = new VariableEx3();
		
		ramesh.aadhar=100;
		
		suresh.aadhar=200;
		
		naresh.aadhar=300;
		
		
		System.out.println("Ramesh :-"+ramesh.display());
		
		System.out.println("Suresh :-"+suresh.display());
		
		System.out.println("Naresh :-"+naresh.display());
		
		
	}

}
