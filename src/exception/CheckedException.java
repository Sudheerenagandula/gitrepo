package exception;

public class CheckedException {
 	    public static void main(String[] args)  {
	        try {
	            Class.forName("basic.Demo12334");
	            System.out.println("Class Found");
	        } catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            System.out.println("Class not Found" +e);
	        }
	    }
	}

