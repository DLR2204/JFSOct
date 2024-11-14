package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
//		(1)Loading the drivers
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
//		(2)Create the connection
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sandi","sandi");
	
//		(3)Create the statement
		
		Statement stmt = conn.createStatement();
		
//		(4)Exceute the statement
		
		stmt.execute("create table Student(stuid number,stuname varchar2(10),stuadd varchar2(10))");
		
//		(5)Close the connections
		
		conn.close();
		
		System.out.println("Table is created successfully");
	}

}
