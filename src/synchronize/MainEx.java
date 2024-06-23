package synchronize;
class Thread1 extends Thread{
    int sum=0;
    public void run(){
        
        synchronized(this){
        	   int tab=7;
        	for(int i=1;i<=10;i++){
 				// sum=i++;
            	System.out.println( tab+ " * " +i+ " = " +tab*i );
            }
            //child thread send notification to Main thread
            this.notify();
        }
    }
}
public class MainEx
{
    public static void main(String[] args) throws Exception {
        Thread1 t=new Thread1();
        t.start();
        
        synchronized(t){
            //Main thread calling wait() method
            t.wait();
            //Main Thread get notification 
            System.out.println(t.sum);
        }
        
        
    }
}
 


