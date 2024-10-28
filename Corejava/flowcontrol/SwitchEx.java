package flowcontrol;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your obtianed marks:-");
		
		float om = scan.nextFloat();
		
		System.out.print("Enter your max marks:-");
		
		float mm = scan.nextFloat();
		
		float percentage = (om/mm)*100;
		
		System.out.println("Your percentage is:-"+percentage);
		
		int gpa = (int) (percentage/10);
		
		System.out.print("Your grade is:-");
				
		switch(gpa) {
		case 10:{
			System.out.println("Ex");
			System.out.println("Remarks :-                     Distinction");
			break;
		}
		
		case 9:{
			System.out.println("Ex");
			System.out.println("Remarks :-                     Distinction");
			break;
		}
		case 8:{
			System.out.println("A");
			System.out.println("Remarks :-                     Distinction");
			break;
		}
		case 7:{
			System.out.println("B");
			System.out.println("Remarks :-                     Outstanding");
			break;
		}
		case 6:{
			System.out.println("C");
			System.out.println("Remarks :-                     very good");
			break;
		}
		case 5:{
			System.out.println("D");
			System.out.println("Remarks :-                     good");
			break;
		}
		case 4:{
			System.out.println("E");
			System.out.println("Remarks :-                     poor");
			break;
		}
		default:{
			System.out.println("Fail");
			System.out.println("Remarks :-                     Fail");
			break;
		}
		
		}
		
		
	}
}
