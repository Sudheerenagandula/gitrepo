package synchronize;
class Reservation
{
	static int availableSeats = 10;
	synchronized void reserveSeat(int requestedSeats)
	{
	System.out.println(Thread.currentThread().getName() + "Enter.");
	System.out.println("Availableseats : " + availableSeats + " Requestedsetas : " + requestedSeats);
		if(availableSeats >= requestedSeats)
		{
			System.out.println("Set Available.Reverve now :-)");
			try
			{
				Thread.sleep(1000);
				
			}catch(InterruptedException e)
			{
				System.out.println("Thread interrupted");
				
			}
			
			System.out.println(requestedSeats + "Seats Reserved.");
			availableSeats = availableSeats - requestedSeats;
		}
		else
		{
			System.out.println("Requsted seats not available :-(");
			
		}
		System.out.println(Thread.currentThread().getName() + "leaving.");
		System.out.println("....................................................");

	}
	
}
class Person extends Thread
{
	Reservation reserve;
	int requestedSeats;
	
	public Person(Reservation reserve,int requestedSeats)
	{
		this.reserve = reserve;
		this.requestedSeats = requestedSeats;
	}
	public void run()
	{
		reserve.reserveSeat(requestedSeats);
	}
}



public class SeatReservationSynchronizationMenuDrivenEx {

	public static void main(String[] args) {
		Reservation reserve = new Reservation();
		Person thread1 = new Person(reserve, 4);
		thread1.start();
		Person thread2 = new Person(reserve, 5);
		thread2.start();
		Person thread3 = new Person(reserve, 2);
		thread3.start();
		
		
		}

}