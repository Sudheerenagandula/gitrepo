
public class Car {
 	class Car1 {
	   protected static String name="sudheer";
	   
	    // protected method
	    protected void display() {
	        System.out.println("Car class"+ name);
	    }
	}
	class car extends Car1{//we can access protected in  subclass
	    protected  String name="BMW" ;
	     
	    		public void display1(){
	    			  System.out.println ("display1"+name);
	       
	    	//	super(speed);
	        // TODO Auto-generated constructor stub
	    
 }    
	}
	public class PtrotectedDemo  {    
	    public static void main(String[] args) {
	        Car1 c=new Car1();//we can access protecteed in non subclass
	        c.display();
	       
	        Car.Car1 car1 = new Car.Car1();
			car1.display();
	    }
	}

}
