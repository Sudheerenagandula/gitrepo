package exception;

import java.util.Scanner;

 

public class MyException extends Exception {
	 
	   public MyException(String s) {
	        super(s);
	    }
}
	 
	 public class MyException {
	    String checkName(String firstName, String lastName ) throws MyException {
	        if (firstName.isBlank() || lastName.isBlank()) {
	         //  throw new MyException("First name or last name cannot be blank");
	        } else {
	            return firstName;
	        }
			return lastName;
	    }
	

 
	    public static void main(String[] args) {
	     MyException emp=new MyException (null);
	     Scanner sc =new Scanner (System.in);
	     System.out.println( "Enter the first name and last name");
	       
	     String fname=sc.nextLine();
	     String lname=sc.nextLine();

	     try {
	         
 	            System.out.println( emp.validName(fName,lName));
	        }
	        catch (MyException e) {
	            System.out.println("Exception: " + ((Object) e).getMessage());
	        }
	    }
	}

