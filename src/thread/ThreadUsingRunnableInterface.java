package thread;

class Threadone implements Runnable{
	private String i;

	public void run() {
		 
		
		for (int i=2; i<15;i++);
		 
		System.out.println("My Thread 1:" + i);
	}
}
public class ThreadUsingRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Threads11 t1 = new Threads11();
Thread t = new Thread(t1);
t.start();
}

}
 