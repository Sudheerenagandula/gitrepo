
  	package files;
	import java.io.File;
	import java.io.IOException;
	public class Files {
	    public static void main(String[] args) throws IOException   {
	        // TODO Auto-generated method stub
//	        File file = new File("C:\\Users\\sudhe\\eclipse-workspace\\CoreJava\\src");
//	        if (file.createNewFile()) {
//	            System.out.println("File Created.");
//	        } else {
//	            System.out.println("File Not Created");
 	            File fileObj = new File("C:\\Users\\sudhe\\eclipse-workspace\\CoreJava\\src ");
	                    if (fileObj.exists()) {
	                        System.out.println("\nSpecified file path: " + fileObj.getAbsolutePath());
	                        System.out.println("\nIs the file Writable: " + fileObj.canWrite());
	                        // checking whether the file is Readable or not
	                        System.out.println("\nIs the file Readable " + fileObj.canRead());
	                        // retrieving file name
	                        System.out.println("\nFile name: " + fileObj.getName());
	                        // retrieving file size
	                        System.out.println("\nFile size (in bytes) " + fileObj.length());
	                        File fileDirObj = new File("C:\\Users\\sudhe\\eclipse-workspace\\CoreJava\\src\\array ");
	                        java.lang.String[] fileList = fileDirObj.list();
	                        System.out.println("list of files available in the directory");
	                        // displaying here the list of files available in the directory
	                        for (int i = 0; i < fileList.length; i++) {
	                            System.out.print("\n" + fileList[i]);
	                        }
	                        System.out.println("\n");
	                    } else {
	                        System.out.println("Specified file does not exist.");
	                    }
	            
	        }
	    }
	

