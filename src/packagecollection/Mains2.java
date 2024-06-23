package packagecollection;

  	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.Scanner;
	public class Mains2 {
	    public static void main(String[] args) {
	        int ch;
	        do {
	            System.out.println("Choice 1 is Add Employee Details");
	            System.out.println("Choice 2 is Employee Record Show");
	            System.out.println("Choice 3 is Specific Employee Record is Search");
	            System.out.println("Choice 4 is Specific Employee Record is Delete");
	            Scanner sc = new Scanner(System.in);
	            ch = sc.nextInt();
	            ArrayList<Employee> c = new ArrayList<Employee>();
	         switch (ch) {
	            case 1:
	                System.out.println("Please Add Data for Employee");
	                Scanner sc1 = new Scanner(System.in);
	                System.out.println("Please Enter name");
	                String name = sc1.nextLine();
	                System.out.println("Please Enter Id");
	                int id = sc1.nextInt();
	                System.out.println("Please Enter Rollno");
	                int Rollno = sc1.nextInt();
	                c.add(new Employee(name, id, Rollno));
 	                System.out.println("Record inserted Sucellyfully");
	                                // System.out.println(c);
	                                break;
	                            case 2:
	                                System.out.println("Please Show for All Employee Data ");
	                                System.out.println(c);
	                                Iterator<Employee> it = c.iterator();
	                                while (it.hasNext()) {
	                                    Employee e1 = it.next();
	                                    System.out.println(e1);
	                                }
	                                System.out.println("Hello");
	                                break;
	                            case 3:
	                                break;
	                            }
	                        } while (ch != 0);
	                    }
	                }

	            
	    
	