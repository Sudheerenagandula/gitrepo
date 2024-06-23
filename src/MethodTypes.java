
public class MethodTypes {
	 
	    private static String areas;
		int add(int a,int b)
	    {
	        return a+b;
	        
	    }
	    void addition(int a,int b) {
	        System.out.println("Additing 2 numbers: "+(a+b));
	    }
	    static String display() {
	        return "Speak something in class";
	    }
	    float area(int r) {
	        return (float) (3.14*r*r);
	    }
	    public static void main(String[] args) {
MethodTypes mt=new MethodTypes();
 int res=mt.add(3,4);
  System.out.println("Area:"+areas);
  String str=MethodTypes.display();
  System.out.println(str);
	    }
}


