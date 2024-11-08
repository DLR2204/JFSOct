package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\Hello.txt");
		
		fw.write(1234);
		
		fw.write("good morning");
		
		char ch[] = {'a','b','c','d','e','f'};
		
		fw.write(ch);
		
		fw.flush();
		
		fw.close();
		
		System.out.println("The data is written into file successfully");
		
		//it can't accepts boolean values
		
		//it can't read int values
		
		//no new line option
	}

}
