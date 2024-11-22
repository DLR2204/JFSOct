package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

@ComponentScan("com")
public class Test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(Test.class);
	
		Address add = (Address) factory.getBean("address");
		add.setCity("Hyderabad");
		add.setHno(100);
		add.setPincode(312402);
		add.setStreetName("RockTown Colony");
		
		Employee emp = (Employee) factory.getBean("emp");
		
		emp.setEmpSal(2342344);
		emp.setEmpId(100);
		emp.setEmpName("Divyam");
		emp.setEmpAdd(add);
		
		System.out.println(emp);
		
		
	}

}
