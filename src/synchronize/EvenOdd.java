package synchronize;
 
class ThreadEven extends Thread {
    public void run() {
        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Number: " + i);
            } else {
                System.out.println("Odd number: " + i);
            }
        }
    }
}
class ThreadFactorial extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            int fact = 10;
            System.out.println(fact + " * " + i + " = " + fact * i);
        }
    }
}
public class EvenOdd {
    public static void main(String[] args) {
        ThreadEven t1 = new ThreadEven();
        t1.start();
        ThreadFactorial t2 = new ThreadFactorial();
        t2.start();
    }

	public void printEvenOdd() {
		// TODO Auto-generated method stub
		
	}
}

 
