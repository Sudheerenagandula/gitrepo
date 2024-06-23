package JDBC;

import java.math.BigInteger;

public class StringMul {
 	    public static void main(String[] args) {
	        // Sample input
	        String A = "5";
	        String B = "5";
	        // Output the result of the multiplication
	        System.out.println(multiplyStrings(A, B));
	    }
	    public static String multiplyStrings(String A, String B) {
	        // Convert strings to BigInteger for handling large numbers
	        BigInteger num1 = new BigInteger(A);
	        BigInteger num2 = new BigInteger(B);
	        // Multiply the numbers
	        BigInteger result = num1.multiply(num2);
	        // Return the product as a string
	        return result.toString();
}}
