package synchronize;
 class name
{
    synchronized void printEvenOdd() {
        //display();
        for(int i=0;i<10;i++)
        {
            if(i%2==0)
            {
            System.out.println("Even number : : "+i);
            }
            else
            {
            System.out.println("Odd number : : "+i);
            }
        }
    }
    public void display()
    {
        System.out.println("Display Thread ");
    }
}
class TableThread 
{
    synchronized void printTable() {
       int tab=9;
        for(int i=1;i<10;i++)
        {
            
            System.out.println(tab+ " * " +i+ " = " +tab*i );
            
        }
}
}
class EvenOdd2 extends Thread {
    EvenOdd eo;
    EvenOdd2(EvenOdd eo) {
        this.eo = eo;
    }
    public void run() {
        eo.printEvenOdd();
    }
}
class TableThread2 extends Thread {
    TableThread t2;
    TableThread2(TableThread t2) {
        this.t2 = t2;
    }
    public void run() {
        t2.printTable();
    }
}
public class SynchronousThreaad {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        EvenOdd eo=new EvenOdd();
        EvenOdd2 eo2=new EvenOdd2(eo);
        eo2.start();
        TableThread t2=new TableThread();
        TableThread2 tt2=new TableThread2(t2);
        tt2.start();
    }
}
    

