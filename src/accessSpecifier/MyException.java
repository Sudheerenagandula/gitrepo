package accessSpecifier;

@SuppressWarnings("serial")
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
 
    public String checkName(String firstName, String lastName) throws MyException {
        if (firstName.isBlank() || lastName.isBlank()) {
            throw new MyException("First name or last name cannot be blank.");
        } else {
            return firstName + lastName;
        }
    }
}

 