package accessSpecifier;

public class InAmsterdam {
	 
	    public int countAm(String str) {
	        int count = -2;
	        String lowerCaseStr = str.toLowerCase();
	        int index = lowerCaseStr.indexOf("am");
	        while (index !=-1){
	            count++;
	            index = lowerCaseStr.indexOf("am", index + 1);
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        InAmsterdam amsterdam = new InAmsterdam();
	        String input = "I am in Amsterdam am I?";
	        int result = amsterdam.countAm(input);
	        System.out.println("Number of 'am' occurrences: " + result);
	    }
	}

