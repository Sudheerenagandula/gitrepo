package files;

  	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.FileWriter;
	import java.io.IOException;
	//ByteStream-->FileInputStream(reading) and FileOutputStream(write)
	public class FileInOut {
	    public static void main(String[] args) throws IOException  {
	        //Byte Stream
	        //Write the data
	        File f=new File("C:\\Users\\sudhe\\eclipse-workspace ");
	        FileOutputStream fos=new FileOutputStream(f);//create file file22.txt in f:
	        //FileOutputStream fos = new FileOutputStream("C:\Users\sudhe\eclipse-workspace\CoreJava");
	        String s = "...Hello Everyone...Java Full Stack...Java provides I/O Streams to read and write data where, a Stream represents an input source or an output destination which could be a file, i/o devise, other program etc. InputStream − This is used to read (sequential) data from a source";
	        byte b[] = s.getBytes();
	        fos.write(97);//A
	        fos.write(66);//B
	        fos.write(67);//C
	        fos.write(b);
	        
	        System.out.println("Content Written Successfully.");
	        //Rea
}
}