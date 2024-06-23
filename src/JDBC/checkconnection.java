package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class checkconnection {

	 
 		public static void main(String[] args) throws SQLException, ClassNotFoundException {
			// Load and register the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Define the URL of the database
			String url = "jdbc:mysql://localhost:3306/demo";
			// Establish the connection to the database
			// Parameters: URL, username, password
			Connection con = DriverManager.getConnection(url, "root", "Sudheer2601@");
			// Print a success message if the connection is established
			System.out.println("Database demo connection successfully established");
//	statement = connection.createStatement();
	//String s = ("insert into student values(04,'akash',BMC");
	
 
		
		//Variables
		int sid;
		String sname,degree,city;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Click 1 - Add Details");
			System.out.println("Click 2 - Displaying Of Student Details");
			System.out.println("Click 3 - Update Of Student Details");
			System.out.println("Click 4 - Delete Of Student details");
			System.out.println("Click 5 - Exit");
			System.out.println("Enter the Choice");
			int chioce = sc.nextInt();
			
			switch (chioce) {
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;

			default:
				break;
			}
			
			
		}
		
		
		
	}

}
