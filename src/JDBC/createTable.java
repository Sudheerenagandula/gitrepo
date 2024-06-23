 package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class createTable {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String password = "Sudheer2601@";
		String createTableSQL = "CREATE TABLE IF NOT EXISTS Learner (" + "lid INT PRIMARY KEY, "
				+ "lname VARCHAR(255) UNIQUE, " + "lage INT CHECK (lage > 18), " + "degree VARCHAR(255) NOT NULL, "
				+ "city VARCHAR(255) DEFAULT 'mumbai'" + ");";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Database connection successfully established");

			Statement stmt = con.createStatement();
			stmt.execute(createTableSQL);
			System.out.println("Table 'Learner' created or already exists.");

			Scanner scanner = new Scanner(System.in);
			int choice;

			do {
				System.out.println("Menu:");
				System.out.println("1. View Records");
				System.out.println("2. Update Record");
				System.out.println("3. Insert Record");
				System.out.println("4. Delete Record");
				System.out.println("5. Count the number of records");
				System.out.println("6. Search for a Record");
				System.out.println("7. Order Records");
				System.out.println("8. Exit");
				System.out.print("Enter your choice: ");
				choice = scanner.nextInt();

				switch (choice) {
				case 1:
					viewRecords(stmt);
					break;
				case 2:
					updateRecord(con, scanner);
					break;
				case 3:
					insertRecord(con, scanner);
					break;
				case 4:
					deleteRecord(con, scanner);
					break;
				case 5:
					countRecords(stmt);
					break;
				case 6:
					searchRecord(con, scanner);
					break;
				case 7:
					orderingRecords(stmt, scanner);
					break;
				case 8:
					System.out.println("Exiting...");
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
				}
			} while (choice != 8);
			scanner.close();
			stmt.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	private static void viewRecords(Statement stmt) {
		try {
			ResultSet rs = stmt.executeQuery("SELECT * FROM Learner");
			while (rs.next()) {
				System.out.println(
						"ID: " + rs.getInt("lid") + ", Name: " + rs.getString("lname") + ", Age: " + rs.getInt("lage")
								+ ", Degree: " + rs.getString("degree") + ", City: " + rs.getString("city"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void updateRecord(Connection con, Scanner scanner) {
		System.out.print("Enter ID of the record to update: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Consume newline
		System.out.print("Enter new city: ");
		String newCity = scanner.nextLine();

		try {
			String updateSQL = "UPDATE Learner SET city = ? WHERE lid = ?";
			PreparedStatement pstmt = con.prepareStatement(updateSQL);
			pstmt.setString(1, newCity);
			pstmt.setInt(2, id);
			int rowsAffected = pstmt.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Record updated successfully.");
			} else {
				System.out.println("Record not found.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void insertRecord(Connection con, Scanner scanner) {
		System.out.print("Enter ID: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Consume newline
		System.out.print("Enter name: ");
		String name = scanner.nextLine();
		System.out.print("Enter age: ");
		int age = scanner.nextInt();
		scanner.nextLine(); // Consume newline
		System.out.print("Enter degree: ");
		String degree = scanner.nextLine();
		System.out.print("Enter city: ");
		String city = scanner.nextLine();

		try {
			String insertSQL = "INSERT INTO Learner (lid, lname, lage, degree, city) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(insertSQL);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			pstmt.setString(4, degree);
			pstmt.setString(5, city);
			pstmt.executeUpdate();
			System.out.println("Record inserted successfully.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void deleteRecord(Connection con, Scanner scanner) {
		System.out.print("Enter ID of the record to delete: ");
		int id = scanner.nextInt();

		try {
			String deleteSQL = "DELETE FROM Learner WHERE lid = ?";
			PreparedStatement pstmt = con.prepareStatement(deleteSQL);
			pstmt.setInt(1, id);
			int rowsAffected = pstmt.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Record deleted successfully.");
			} else {
				System.out.println("Record not found.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void countRecords(Statement stmt) {
		try {
			ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM Learner");
			if (rs.next()) {
				System.out.println("Number of records: " + rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void searchRecord(Connection con, Scanner scanner) {
		System.out.print("Enter Learner ID: ");
		int id = scanner.nextInt();

		try {
			String searchSQL = "SELECT * FROM Learner WHERE lid = ?";
			PreparedStatement pstmt = con.prepareStatement(searchSQL);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(
						"ID: " + rs.getInt("lid") + ", Name: " + rs.getString("lname") + ", Age: " + rs.getInt("lage")
								+ ", Degree: " + rs.getString("degree") + ", City: " + rs.getString("city"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void orderingRecords(Statement stmt, Scanner scanner) {
		System.out.println("Enter the column name to order by (lid, lname, lage, degree, city): ");
		String column = scanner.next();

		try {
			String orderSQL = "SELECT * FROM Learner ORDER BY " + column;
			ResultSet rs = stmt.executeQuery(orderSQL);
			while (rs.next()) {
				System.out.println(
						"ID: " + rs.getInt("lid") + ", Name: " + rs.getString("lname") + ", Age: " + rs.getInt("lage")
								+ ", Degree: " + rs.getString("degree") + ", City: " + rs.getString("city"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
