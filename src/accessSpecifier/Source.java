package accessSpecifier;

public class Source {
	 
	    public String checkName(String firstName, String lastName) throws MyException {
	        if (firstName.isBlank() || lastName.isBlank()) {
	            throw new MyException("First name or last name cannot be blank");
	        } else {
	            return firstName + " " + lastName;
	        }
	    }

	    public static void main(String[] args) {
	        Source source = new Source();
	        try {
	            String fullName = source.checkName("Alan", "Hasley");
	            System.out.println("Full Name:" + fullName);
	        } catch (MyException ex) {
	            System.out.println("Caught exception: " + ex.getMessage());
	        }
	    }
	}


