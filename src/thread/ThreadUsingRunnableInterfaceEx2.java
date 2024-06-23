package thread;

 
	 
	class Threads11 extends Thread{
	    public void run() {
	    	for (int i=2; i<15;i++);
	    	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        System.out.println("Threass111");
	    }
	    
	   
	}
	public class ThreadUsingRunnableInterfaceEx2 {
	    public static void main(String[] args) {
	        Threads11 t1=new Threads11();
	        t1.start();
//	        t1.start();
//	        t1.start();
	    }
	}
