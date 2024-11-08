package filehandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterEx {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\Hello.txt");
		
		pw.println(1234);
		
		pw.println(true);
		
		pw.println("Good Morning");
		
		char ch[] = {'a','b','c','d','e','f'};
		
		pw.println(ch);
		
		pw.flush();
		
		pw.close();
		
		System.out.println("The data is written into the successfully");
	}

}
