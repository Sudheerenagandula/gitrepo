
 
		 
		public class Shape {
		    void area(int side) {
		        System.out.println("Area of Square : "+(side*side));
		    }
		    void area(float radius) {
		        float pie=22/7f;
		        System.out.println("Area of Circle : "+(pie*radius));
		    }
		    void area(int length,int width) {
		        System.out.println("Area of Rectangle : "+(length*width));
		    }
		    void area(int base, float height) {
		        System.out.println("Area of Triangle : "+(0.5*base*height));
		    }
		    public static void main(String[] args) {
		         Shape sc=new  Shape();
		         sc.area(4);
		         sc.area(3.0f);
		         sc.area(7,3);
		         sc.area(4,8.0f);
		    }
		
	}


