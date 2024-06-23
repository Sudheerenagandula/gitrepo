package JDBC;
	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

	public class StudentData {

		public static void main(String[] args) throws SQLException, ClassNotFoundException {
			// Load and register the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Define the URL of the database
			String url = "jdbc:mysql://localhost:3306/demo";
			// Establish the connection to the database
			// Parameters: URL, username, password
			Connection con = DriverManager.getConnection(url, "root", "Sudheer2601@");
			// Print a success message if the connection is established
			//    bSystem.out.println("            Database demo connection successfully established      ");

			Statement st = con.createStatement();
			// Variables
//			int sid;
//			String sname,degree,city;
			Scanner sc = new Scanner(System.in);
			int choice;
			do{
				System.out.println("|-----------------------------------------------------------------------|");
				System.out.println("|                        STUDENT INFORMATION                            |");
				System.out.println("|_______________________________________________________________________|");
				System.out.println("|       Click 1 - Displaying Of Student Details                         |");
				System.out.println("|       Click 2 - Add Details                                           |");
				System.out.println("|       Click 3 - Update Of Student Details                             |");
				System.out.println("|       Click 4 - Delete Of Student Details                             |");
				System.out.println("|       Click 5 - Count The Number Of Records                           |");
				System.out.println("|       Click 6 - Search The Record                                     |");
				System.out.println("|       Click 7 - Order The Records By ID, Name, Age, Degree, City      |");
				System.out.println("|       Click 8 - Exit                                                  |");
				System.out.println("|_______________________________________________________________________|");
				System.out.println("|                                                                       |");
				System.out.println("  Enter Your Choice : ");
				 choice = sc.nextInt();

				switch (choice) {
				case 1:
					DisplayRecord(st);
					break;
				case 2:
					insertDetails(st, sc);
					break;
				case 3:
					updateDetails(st, sc);
					break;
				case 4:
					deleteRecord(st, sc);
					break;
				case 5:
					countRecords(st, sc);
					break;
				case 6:
					searchRecord(con, sc);
					break;
				case 7:
					ordering(con, sc);
					break;
				case 8:
					System.out.println("----EXITING----");
					System.exit(0);

					sc.close();
					st.close();
					con.close();
					break;

				default:
					System.out.println("Entered Invalid Choice");
					break;
				}

			}while(choice!=8);

		}

		// Insert Learner Details

		private static void insertDetails(Statement st, Scanner sc) throws SQLException {
			System.out.print("Enter ID: ");
			int learnerid = sc.nextInt();
			sc.nextLine(); // consume newline
			System.out.print("Enter Name: ");
			String lname = sc.nextLine();
			System.out.print("Enter Age: ");
			int lage = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Degree: ");
			String degree = sc.nextLine();
			System.out.print("Enter City: ");
			String city = sc.nextLine();
			String insertQuery = String.format(
					"INSERT INTO learner (lid, lname, lage, degree, city) VALUES (%d, '%s', %d, '%s', '%s')", learnerid,
					lname, lage, degree, city);
			st.executeUpdate(insertQuery);
			System.out.println("RECORD INSERTED SUCCESFULLY");
		}

		// Display Records

		private static void DisplayRecord(Statement st) throws SQLException {
			ResultSet rs = st.executeQuery("SELECT * FROM learner");
			System.out.println("LEARNER RECORDS");
			while (rs.next()) {
				System.out.println("Learner_ID: " + rs.getInt(1));
				System.out.println("LName: " + rs.getString(2));
				System.out.println("Lage: " + rs.getInt(3));
				System.out.println("LDegree: " + rs.getString(4));
				System.out.println("City: " + rs.getString(5));

			}
			rs.close();
		}

		// UPDATE RECORDS

		private static void updateDetails(Statement st, Scanner sc) throws SQLException {
			int choice;
			do {
				System.out.println("Menu:");
				System.out.println("1. Update Name");
				System.out.println("2. Update Age");
				System.out.println("3. Update Degree");
				System.out.println("4. Update City");
				System.out.println("5. Exit");
				System.out.println("Enter your choice For What You Can Want To Update");
				 choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.print("Enter ID of the Learner to update: ");
					int rollNo = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter new Name: ");
					String newClass = sc.nextLine();
					String updateQuery = "UPDATE Learner SET lname='" + newClass + "' WHERE lid=" + rollNo;
					st.executeUpdate(updateQuery);
					System.out.println("Record updated successfully");
					break;
				case 2:
					System.out.print("Enter ID of the Learner to update: ");
					int rollNo1 = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter new AGE: ");
					String newAge = sc.nextLine();
					String updateAge = "UPDATE Learner SET lage='" + newAge + "' WHERE lid=" + rollNo1;
					st.executeUpdate(updateAge);
					System.out.println("Record updated successfully");
					break;
				case 3:
					System.out.print("Enter ID of the Learner to update: ");
					int rollNo2 = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter new Degree: ");
					String newDegree = sc.nextLine();
					String updateDegree = "UPDATE Learner SET degree='" + newDegree + "' WHERE lid=" + rollNo2;
					st.executeUpdate(updateDegree);
					System.out.println("Record updated successfully");
					break;
				case 4:
					System.out.print("Enter ID of the Learner to update: ");
					int rollNo3 = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter new City: ");
					String newCity = sc.nextLine();
					String updateCity = "UPDATE Learner SET city='" + newCity + "' WHERE lid=" + rollNo3;
					st.executeUpdate(updateCity);
					System.out.println("Record updated successfully");
					break;
				case 5:
					System.out.println("-----Exiting From Updation Records-----");
					//System.exit(0);
					//sc.close();

					break;
				default:
					System.err.println("Invaild Choice");
					break;
				}

			}while(choice!=5);

		}

		// Delete Records

		private static void deleteRecord(Statement stmt, Scanner scanner) throws SQLException {
			System.out.print("Enter ID of the Learner to delete: ");
			int rollNo = scanner.nextInt();
			String deleteQuery = "DELETE FROM Learner WHERE lid=" + rollNo;
			stmt.executeUpdate(deleteQuery);
			System.out.println("Record deleted successfully");
		}

		private static void countRecords(Statement st, Scanner scanner) throws SQLException {
			String countQuary = "select count(*) from learner";
			ResultSet rs = st.executeQuery(countQuary);
			rs.next();
			int learnerscount = rs.getInt(1);
			System.out.println("Total Number of Learners : " + learnerscount);
		}

		// Search Records

		private static void searchRecord(Connection con, Scanner sc) throws SQLException {
			System.out.println("Enter Learner ID : ");
			int id = sc.nextInt();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM learner WHERE lid= ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("ID: " + rs.getInt("lid") + ", Name: " + rs.getString("lname") + ", Age: "
						+ rs.getInt("lage") + ", Degree: " + rs.getString("degree") + ", City: " + rs.getString("city"));
			}
			con.close();
		}

		private static void ordering(Connection con, Scanner sc) throws SQLException {
			int choice;
			do{
				System.out.println("---------Menu---------");
				System.out.println("1. Order By ID");
				System.out.println("2. Order By Name");
				System.out.println("3. Order By Age");
				System.out.println("4. Order By Degree");
				System.out.println("5. Order By City");
				System.out.println("6. Exit");
				System.out.println("Enter your choice For What You Can Want To Update");
				 choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Getting The Learner Record Order By ID : ");
					PreparedStatement ps = con.prepareStatement("SELECT * FROM learner ORDER BY lid ");
					ResultSet rs = ps.executeQuery();
					while (rs.next()) {
						System.out.println("ID: " + rs.getInt("lid") + ", Name: " + rs.getString("lname") + ", Age: "
								+ rs.getInt("lage") + ", Degree: " + rs.getString("degree") + ", City: "
								+ rs.getString("city"));
					}
					break;
				case 2:
					System.out.println("Getting The Learner Record Order By Name : ");
					PreparedStatement ps1 = con.prepareStatement("SELECT * FROM learner ORDER BY lname ");
					ResultSet rs1 = ps1.executeQuery();
					while (rs1.next()) {
						System.out.println("ID: " + rs1.getInt("lid") + ", Name: " + rs1.getString("lname") + ", Age: "
								+ rs1.getInt("lage") + ", Degree: " + rs1.getString("degree") + ", City: "
								+ rs1.getString("city"));
					}
					break;
				case 3:
					System.out.println("Getting The Learner Record Order By Age : ");
					PreparedStatement ps2 = con.prepareStatement("SELECT * FROM learner ORDER BY lage ");
					ResultSet rs2 = ps2.executeQuery();
					while (rs2.next()) {
						System.out.println("ID: " + rs2.getInt("lid") + ", Name: " + rs2.getString("lname") + ", Age: "
								+ rs2.getInt("lage") + ", Degree: " + rs2.getString("degree") + ", City: "
								+ rs2.getString("city"));
					}
					break;
				case 4:
					System.out.println("Getting The Learner Record Order By Degree : ");
					PreparedStatement ps3 = con.prepareStatement("SELECT * FROM learner ORDER BY degree ");
					ResultSet rs3 = ps3.executeQuery();
					while (rs3.next()) {
						System.out.println("ID: " + rs3.getInt("lid") + ", Name: " + rs3.getString("lname") + ", Age: "
								+ rs3.getInt("lage") + ", Degree: " + rs3.getString("degree") + ", City: "
								+ rs3.getString("city"));
					}
					break;
				case 5:
					System.out.println("Getting The Learner Record Order By City : ");
					PreparedStatement ps4 = con.prepareStatement("SELECT * FROM learner ORDER BY city ");
					ResultSet rs4 = ps4.executeQuery();
					while (rs4.next()) {
						System.out.println("ID: " + rs4.getInt("lid") + ", Name: " + rs4.getString("lname") + ", Age: "
								+ rs4.getInt("lage") + ", Degree: " + rs4.getString("degree") + ", City: "
								+ rs4.getString("city"));
					}
					break;
				case 6:
					System.out.println("---Exiting From Order By----");
					//System.exit(0);
					//sc.close();
					//con.close();
				default:
					System.out.println("Invailed Choice");
					break;
				}

			}while(choice!=6);
		}

	}


