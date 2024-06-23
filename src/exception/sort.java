package exception;

public class sort {
	 
	    public static char maxOccurringChar(String str) {
	        int[] charCount = new int[256]; // Assuming ASCII characters
	        
	        // Count occurrences of each character
	        for (int i = 0; i < str.length(); i++) {
	            charCount[str.charAt(i)]++;
	        }
	        
	        char maxChar = '\0';
	        int maxCount = 0;
	        
	        // Find the character with maximum occurrence
	        for (int i = 0; i < 256; i++) {
	            if (charCount[i] > maxCount) {
	                maxCount = charCount[i];
	                maxChar = (char) i;
	            }
	        }
	        
	        return maxChar;
	    }

	    public static void main(String[] args) {
	        String str = "hello";
	        System.out.println("Maximum occurring character: " + maxOccurringChar(str));
	    }
	
}