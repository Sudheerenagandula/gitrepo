package Java8;

 
 
	@FunctionalInterface
	interface MultplicationInterface
	{
	public void multiply(int a,int b);
	}
	public class MethodRefernceExample{
	public static void mul(int a, int b)
	{
	    System.out.println("The multiplication is : " +a*b);
	}
	public static void main(String[] args)
	{
	    ///**** Using Method Reference  for static method***//
	            //classname::method name;
	       // A a2 = Digit::isSingleDigit;
	        //System.out.println(a2.checkSingleDigit(9));//true*/
	    MultplicationInterface  mre4=MethodRefernceExample::mul;
	    mre4.multiply(3, 4);
	}
	}

