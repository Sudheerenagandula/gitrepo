package files;

import java.io.Serializable;
import java.lang.ClassNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
public class MergingFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileOne, fileTwo, fileThree, line, content="";
	      Scanner scan = new Scanner(System.in);
	      
		 try
	      {
	         FileReader frOne = new FileReader(" C:\\Users\\sudhe");
	         BufferedReader brOne = new BufferedReader(frOne);
	         FileReader frTwo = new FileReader(" C:\\Users\\sudhe\\eclipse-workspace");
	         BufferedReader brTwo = new BufferedReader(frTwo);
	         
	         for(line=brOne.readLine(); line!=null; line=brOne.readLine())
	            content = content + line + "\n";
	         brOne.close();
	         
	         for(line=brTwo.readLine(); line!=null; line=brTwo.readLine())
	            content = content + line + "\n";
	         brTwo.close();
	         
	         try
	         {
	            FileWriter fw = new FileWriter(" C:\\Users\\sudhe\\eclipse-workspace\\CoreJava\\src", true);
	            fw.write(content);
	            fw.close();
	            System.out.println("\nSuccessfully merged the content of two files into the third file");
	         }
	         catch(IOException ioe)
	         {
	            System.out.println("\nSomething went wrong!");
	            System.out.println("Exception: " +ioe);
	         }
	      }
	      catch(IOException ioe)
	      {
	         System.out.println("\nSomething went wrong!");
	         System.out.print("Exception: " +ioe);
	      }
	}

}
