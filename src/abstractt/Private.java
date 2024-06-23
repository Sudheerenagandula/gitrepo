package abstractt;

class Vehicle{
private void disVehicle() {
	System.out.println("vehicle");
	
}
}
class car extends Vehicle{
	void discar() {
		System.out.println("car");
	}
}
public class Private{
	private int s=100;
	private String display() {
		return "display"+s;
		
	}
	
private Private() {
	System.out.println("print constructor");
	
}
public static void main(String[] args) {
	Private p= new Private();
	System.out.println(p.display());
	p.display();
}
	
}