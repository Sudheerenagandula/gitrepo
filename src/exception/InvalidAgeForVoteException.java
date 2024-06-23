package exception;

public class InvalidAgeForVoteException {

	public char[] getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

 
		}
		public class VotingException {
		    String validAge(int age) throws InvalidAgeForVoteException  {
		        if(age<15) {
		            throw new InvalidAgeForVoteException("Age is smaller than 15");
		        }
		        else {
		            return "Valid for vote ";
		        }
		    }
		    public static void main(String[] args) {
		        VotingException v=new VotingException();
		        
		        try {
		            System.out.println(v.validAge(4));
		        } catch (InvalidAgeForVoteException e) {
		            System.out.println(e.getMessage());
		        
		        }
		    }
			}


