package exception;

public class sort1 {

 
		  public static char MaxOccurringChar(String str) {
			  int[] charcount=new int [256] ;
			  
			     char maxChar = '\0';
			        int maxCount = 0;
			        
		    for (int i = 0; i < 256; i++) {
	            if (charcount[i] > maxCount) {
	                maxCount = charcount[i];
	                maxChar = (char) i;
		  }
	}
return maxChar;
}
		    public static void main(String[] args) {
		        String str = "Doselect";
		      
		        char charmaxChar = MaxOccurringChar (str);
		        
		        System.out.println("Maximum occurring character: " + MaxOccurringChar(str));
		    }
	}
