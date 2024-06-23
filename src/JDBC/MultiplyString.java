package JDBC;

 
	import java.util.Scanner;
	import java.math.BigInteger;
	public class MultiplyString {
	    public static BigInteger string_multiply(String A, String B) {
	        // Convert the string inputs to BigInteger
	        BigInteger num1 = new BigInteger(A);
	        BigInteger num2 = new BigInteger(B);
	        // Multiply the two BigIntegers
	        BigInteger result = num1.multiply(num2);
	        // Return the result as a BigInteger
	        return result;
	    }
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner scanner = new Scanner(System.in);
	        // Read the first integer as a string
	        String A = scanner.nextLine();
	        // Read the second integer as a string
	        String B = scanner.nextLine();
	        BigInteger result = string_multiply(A, B);
	        // Print the result
	        System.out.println(result.toString());
	        scanner.close();
	    }
	}


