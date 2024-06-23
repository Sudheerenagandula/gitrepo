package Java8;
 
	interface A {
	    public boolean checkSingleDigit(int x);
	}
	class Digit {
	    public static boolean isSingleDigit(int x) {
	        return x > -10 && x < 10;
	    }
	    public boolean isSingleDigit1(int x) {
	        return x > -10 && x < 10;
	    }
	}
	public class TestStaticMethodReference {
	    public static void main(String[] args) {
	        
	        //*** Using Lambda Expression ***//
	        A a1 = (x) -> { return x > -10 && x < 10;};
	        System.out.println(a1.checkSingleDigit(10));//false
	        
	        //*** Using Method Reference  for static method***//
	            //classname::method name;
	        A a2 = Digit::isSingleDigit;
	        System.out.println(a2.checkSingleDigit(9));//true
	        
	        //*** Using Method Reference  for non static method***//
	            //objectname::method name;
	        Digit d=new Digit();
	        A a3=d::isSingleDigit1;
	        System.out.println(a3.checkSingleDigit(19));
	    }
	}

