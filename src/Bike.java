
public class Bike {
protected String name="Sudheer";
protected void display() {
	System.out.println("Display value:"+name);
}

}
class Bike2 extends Bike{
	protected String name1="Bike";
	protected void display() {
		display();
		
		System.out.println("Display value:"+name1);
}
	
}
public class Bike1 {
	public static void main (String[] args) {
		Bike2 b=new Bike2();
		b.display();
	}
}
