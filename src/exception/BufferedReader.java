package exception;

import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader {
 	   

		public static void main(String[] args) throws NumberFormatException, IOException {
	        //Scanner sc=new Scanner(System.in);
	        InputStreamReader isr=new InputStreamReader(System.in);
	        BufferedReader br=new BufferedReader();
	        System.out.println("Enter value of a: ");
	        int a=Integer.parseInt(br.readLine());
	        System.out.println("Value of a: "+a);
	        System.out.println("Enter Name: ");
	        String nm=br.readLine();
	        System.out.println("Name: "+nm);
	        
	    }

		private String readLine() {
			// TODO Auto-generated method stub
			return null;
		}

		 
		}
	
