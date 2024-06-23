package JDBC;

 
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class StringModifier {

	    public static void main(String[] args) {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter a string: ");

	        try {
	            String input = reader.readLine();
	            String output = removeFirstAndLastA(input);
	            System.out.println("Modified string: " + output);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static String removeFirstAndLastA(String str) {
	        int firstIndex = str.indexOf('a');
	        int lastIndex = str.lastIndexOf('a');

	        if (firstIndex != -1 && lastIndex != -1 && firstIndex != lastIndex) {
	            return str.substring(0, firstIndex) + str.substring(firstIndex + 1, lastIndex) + str.substring(lastIndex + 1);
	        }

	        return str; // Return the original string if conditions are not met
	    }
	}


