package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update {

	 
		// TODO Auto-generated method stub
		public static void main(String[] args) throws SQLException, ClassNotFoundException {
			// TODO Auto-generated method stub
		
			// Load and register the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Define the URL of the database
			String url = "jdbc:mysql://localhost:3306/demo";
			// Establish the connection to the database
			// Parameters: URL, username, password
			Connection con = DriverManager.getConnection(url, "root", "Sudheer2601@");
			// Print a success message if the connection is established
			System.out.println("Database demo connection successfully established");
		 
			
			PreparedStatement ps = con.prepareStatement("UPDATE employees SET empname = ? WHERE empid = ?");
			 ps.setString(1, "Tony");
			 ps.setInt(2,2);
			 ps.executeUpdate();
			 System.out.println("Updated");

	}

}
