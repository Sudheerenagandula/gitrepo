package bufferReader;

 
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;

	public class MergingFilesEx2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String fileOne, fileTwo, fileThree, line, content="";
		      Scanner scan = new Scanner(System.in);
		      
			 try
		      {
		         FileReader frOne = new FileReader("D:/CoreJavaProgrames/src/fileExamples/file1.txt");
		         BufferedReader brOne = new BufferedReader(frOne);
		         FileReader frTwo = new FileReader("D:/CoreJavaProgrames/src/fileExamples/file2.txt");
		         BufferedReader brTwo = new BufferedReader(frTwo);
		         
		         for(line=brOne.readLine(); line!=null; line=brOne.readLine())
		            content = content + line + "\n";
		         brOne.close();
		         
		         for(line=brTwo.readLine(); line!=null; line=brTwo.readLine())
		            content = content + line + "\n";
		         brTwo.close();
		         
		         try {
		             // Read file 3
		             FileReader frThree = new FileReader("D:/CoreJavaProgrames/src/fileExamples/file3.txt");
		             BufferedReader brThree = new BufferedReader(frThree);

		             System.out.println("Content of file 3:");

		             String line2;
		             while ((line2 = brThree.readLine()) != null) {
		                 System.out.println(line2);
		             }

		             brThree.close();
		         } catch (IOException ioe) {
		             System.out.println("Something went wrong!");
		             System.out.println("Exception: " + ioe);
		         }	      }
		      catch(IOException ioe)
		      {
		         System.out.println("\nSomething went wrong!");
		         System.out.print("Exception: " +ioe);
		      }
		}

	
}
