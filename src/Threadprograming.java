
public class Threadprograming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
class Thread1 extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++);
		System.out.println("My Thread" + i);
		
		
	}

public void display() {
	System.out.println( "Thread1 display");
	

}
	}
class Thread2 extends Thread{
	public void run() {
		for (int i = 10; i < 15; i++);
		System.out.println("My Thread"+ i);
	
}
public void display() {
	System.out.println( "Thread2 display");
	
	}
}
	}}
