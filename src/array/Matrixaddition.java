package array;

import java.util.Scanner;

public class Matrixaddition {
 

		public static void main(String[] args) {
			int size;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter size:");
	        size = s.nextInt();
	       
	            int a[][] = new int[size][size];
	            int b[][] = new int[size][size];
	            int c[][] = new int[size][size];
	            System.out.println("Enter all the elements of first matrix:");
	            for (int i = 0; i < size; i++) 
	            {
	                for (int j = 0; j < size; j++) 
	                {
	                    a[i][j] = s.nextInt();
	                }
	            }
	            System.out.println("Enter all the elements of second matrix:");
	            for (int i = 0; i < size; i++) 
	            {
	                for (int j = 0; j < size; j++) 
	                {
	                    b[i][j] = s.nextInt();
	                }
	            }
	            System.out.println("First Matrix:");
	            for (int i = 0; i < size; i++) 
	            {
	                for (int j = 0; j < size; j++) 
	                {
	                    System.out.print(a[i][j]+" ");
	                }
	                System.out.println("");
	            }
	            System.out.println("Second Matrix:");
	            for (int i = 0; i < size; i++) 
	            {
	                for (int j = 0; j < size; j++) 
	                {
	                    System.out.print(b[i][j]+" ");
	                }
	                System.out.println("");
	            }
	            for (int i = 0; i < size; i++) 
	            {
	                for (int j = 0; j < size; j++) 
	                {
	                    for (int k = 0; k < size; k++) 
	                    {
	                        c[i][j] = a[i][j] + b[i][j];
	                    }
	                }
	            }
	            System.out.println("Matrix after addition:");
	            for (int i = 0; i < size; i++) 
	            {
	                for (int j = 0; j < size; j++) 
	                {
	                    System.out.print(c[i][j]+" ");
	                }
	                System.out.println("");
	            }
	        }
	       
	    
	}
