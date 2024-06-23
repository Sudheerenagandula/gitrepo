package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcconncetion {
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		
	 
//		4 steps
//		1. Load the Driver
//		2. Make the connection
//		3.create statement
//		4. Execute Query
		//1. Load The driver
		String driver ="com.mysql.cj.jdbc.Driver";
		String url ="jdbc:mysql://localhost:3306/demo";
		String un="root";
		String pass="Sudheer2601@";
		Class.forName(driver);
		//2.Make the Connection
		Connection conn=DriverManager.getConnection(url,un,pass);
		//3.create Statement
		Statement stmt = conn.createStatement();
		String sql = "select * from student"; //string   //studentid, studentname
		 ResultSet rs = stmt.executeQuery(sql);
		 int sid,age;
		String sname,email;
		//System.out.println("Id\tName\tAge\tEmail");
		System.out.printf("%-8s%-8s%-8s%-10s","ID","Name","Age","Email");
		
		System.out.println("--------------------------");
		
		while(rs.next()){
		  sid = rs.getInt(1); //or rs.getInt("studentid");
		  sname=rs.getString(2); //rs.getString("studentname");
		 age=rs.getInt(3);
		 email=rs.getString(4);
		 System.out.println(sid+"\t"+"\t"+sname+"\t"+age+"\t"+email);
		  
		 
		}
		
	}
	}
