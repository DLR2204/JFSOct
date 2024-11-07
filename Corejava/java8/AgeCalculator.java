package java8;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class AgeCalculator {

	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();  //today's date
		
		LocalDate birthDate =LocalDate.of(2000,01,01); //birth date
		
		Period p = Period.between(birthDate, currentDate);
		
		System.out.printf("your age is:- %d Years , %d Months ,%d Days",p.getYears(),p.getMonths(),p.getDays());
		
		
		
		
	}
}
