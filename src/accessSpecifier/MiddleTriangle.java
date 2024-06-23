package accessSpecifier;

import java.util.Scanner;

public class MiddleTriangle {
	 
	
	 static void printPattern(int n)
	 {
	 int i,j;
	 for(i=1;i<=n;i++)
	 {
	 for(j=1;j<=n-i;j++)
	 {
	 System.out.print(" ");
	 
	 }
	 for(j=1;j<=i;j++)
	 {
	 System.out.print(i+" ");
	 }
	 System.out.println();
	 }
	 }
	
	 public class Source {
	 public static void main(String[] args) {
	 
	 @SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
	 
	 // Declare the variable
	 int a ,b,c;
	 
	 // Read the variable from STDIN
	 a = in.nextInt();
	 b = in.nextInt();
 c = in.nextInt();
 @SuppressWarnings("unused")
MiddleTriangle m=new MiddleTriangle();
	 MiddleTriangle.printPattern(a);
	 MiddleTriangle.printPattern(b);
	 MiddleTriangle.printPattern(c);
	 // Output the variable to STDOUT
	 //System.out.println(a);
	 }
	 
	 }
}

