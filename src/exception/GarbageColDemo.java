package exception;

public class GarbageColDemo {
	 
	        public void finalize()
	        {
	            System.out.println ("Garbage Collection performed by JVM");
	        }
	        public static void main (String args[])
	        {
	            GarbageColDemo s1 = new GarbageColDemo();
	            GarbageColDemo s2 = new GarbageColDemo();
        s1 = null;
	            s2 = null;
	            System.gc();
	        }
	    
	}

