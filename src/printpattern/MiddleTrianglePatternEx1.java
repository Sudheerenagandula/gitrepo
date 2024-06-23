package printpattern;

import java.util.Scanner;

public class MiddleTrianglePatternEx1 {
	 
		    static void printPattern(int n) {
		        int i, j;
		        for (i = 1; i <= n; i++) {
		            for (j = 1; j <= n - i; j++) {
		                System.out.print(" ");
		            }
		            for (j = 1; j <= i; j++) {
		                
		                System.out.print(j + " ");
		            }
		            System.out.println();
		        }
		    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Scanner sc = new Scanner(System.in);
	         System.out.println("---Enter 3 Pattern Numbers to get Middle Triangle---");
	         int num1 = sc.nextInt();
	         int num2 = sc.nextInt();
	         int num3 = sc.nextInt();
	         // MiddleTriangle m = new MiddleTriangle();
	         MiddleTrianglePatternEx1.printPattern(num1);
	         MiddleTrianglePatternEx1.printPattern(num2);
	         MiddleTrianglePatternEx1.printPattern(num3);

		}

	}

