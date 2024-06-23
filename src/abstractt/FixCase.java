package abstractt;

public class FixCase {

 
		// TODO Auto-generated method stub
		 

			  public static String fixCase(String str) {
			    int upperCount = 0;
			    int lowerCount = 0;
			    for (char c : str.toCharArray()) {
			      if (Character.isUpperCase(c)) {
			        upperCount++;
			      } else if (Character.isLowerCase(c)) {
			        lowerCount++;
			      }
			    }
			    return upperCount > lowerCount ? str.toUpperCase() : str.toLowerCase();//terminory operator
			  }

			  public static void main(String[] args) {
			    System.out.println(fixCase("AbCdEfG")); // ABCDEFG
			    System.out.println(fixCase("xYz")); // xyz
			    System.out.println(fixCase("ABCabcXYZ")); // abcabcxyz
			  }
			
	}


