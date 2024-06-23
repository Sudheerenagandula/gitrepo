package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

 
public class PreparedStatementInsert {

 

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
	 
		
		PreparedStatement ps = con.prepareStatement("insert into employees values(?,?,?)");
        ps.setInt(1,1);
        ps.setString(2,"Sudheer");
        ps.setString(3,"sudheer@gmail.com");
        ps.executeUpdate();
       
        System.out.println("Recored inserted");
	}
}
