package JDBC;

import java.util.Scanner;

public class removeFirstLastCharacter {
	 public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter str");
	        String str = scanner.nextLine();
	        char C = 'a'; 
	        
	        String output = removeFirstLastOccurrence(str, C);
	        
	        System.out.println(" Removing first and last occ :- "+output);
	        
	        scanner.close();
	    }
	
	public static String removeFirstLastOccurrence(String str, char ch) {
        int firstIndex = str.indexOf(ch);
        int lastIndex = str.lastIndexOf(ch);
        // If the character is not found or found only once, return the original string
        if (firstIndex == -1 || firstIndex == lastIndex) {
            return str;
        }
        // Build the resulting string
        StringBuilder result = new StringBuilder();
        result.append(str, 0, firstIndex); // Append the part before the first occurrence
        result.append(str, firstIndex + 1, lastIndex); // Append the part between the first and last occurrence
        result.append(str, lastIndex + 1, str.length()); // Append the part after the last occurrence
        return result.toString();
    }
}
