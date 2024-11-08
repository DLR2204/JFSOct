package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\Hello.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(1234);
		
		bw.newLine();

		bw.write("good morning");
		
		bw.newLine();

		char ch[] = { 'a', 'b', 'c', 'd', 'e', 'f' };

		bw.write(ch);

		bw.flush();

		bw.close();

		System.out.println("The data is written into file successfully");

		// it can't accepts boolean values

		// it can't read int values


	}

}
