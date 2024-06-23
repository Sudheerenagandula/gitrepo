package JDBC;

	import java.sql.Connection;
import java.sql.DriverManager;
	public class DatabaseConnection {
	    private static String driver="com.mysql.cj.jdbc.Driver";
	    private static String url="jdbc:mysql://localhost:3306/10223_10224_10225db";
	    private static String un="root";
	    private static String pass="Sudheer2601@";
	    private static Connection conn;
	    
	    private DatabaseConnection() {}
	    
	    public static Connection getConnetction() {
	        
	        try {
	            Class.forName(driver);
	            if(conn==null)
	               conn = DriverManager.getConnection(url,un,pass);
	            
	    }catch(Exception e) {
	            e.printStackTrace();
	        }
	        
	        return conn;
	        
	    }
	}


