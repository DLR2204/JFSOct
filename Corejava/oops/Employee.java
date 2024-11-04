package oops;

public class Employee {
	
	private int empId;     //instance global var
	
	private String empName;
	
	private int empSal;
	
	private String empAdd;
	
	public void setEmpId(int empId) {   //setter :- to give i/p
		this.empId=empId;
	}
	
	public int getEmpId() {				//getter :-for the o/p
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	
	public Employee() {   //default
		
	}

	public Employee(int empId, String empName, int empSal, String empAdd) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empAdd = empAdd;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empAdd=" + empAdd + "]";
	}
	

	
	

}
