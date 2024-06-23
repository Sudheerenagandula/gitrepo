package Java8;
 
@FunctionalInterface
interface InterfaceOne {
	int addTwoNumbers(int a, int b, int c);
}

@FunctionalInterface
interface InterfaceTwo {
	int squareRoot(int a1);
}

@FunctionalInterface
interface InterfaceThree {
	int squareOfNum(int a);
}

@FunctionalInterface
interface InterfaceFour {
	int addOfNum(int a, int b);
}

@FunctionalInterface
interface InterfaceFive {
	String noParameter();
}

@FunctionalInterface
interface InterfaceSix {
	String noParameter2();
}

public class LambdaExpressionRules {

	public static void main(String[] args) {
		InterfaceOne ione = (a, b, c) -> {
			int sum = a + b;
			return sum * c;
		};
		InterfaceTwo itwo = a1 -> {

			int sqr = a1 * a1;
			return sqr;
		};
		InterfaceThree ithree = n -> n * n;
		InterfaceFour ifour = (a, b) -> a + b;
		InterfaceFive ifive = () -> "success";
		InterfaceSix isix = () -> {
			
			String name = "Gayathri";
			return name;
		};
		//Multiple parameters and multiple lines in body
		int infaceOne = ione.addTwoNumbers(3, 4, 5);
		System.out.println("The answer is: " + infaceOne);
		//Single Parameter and multiple Lines in body
		int infaceTwo = itwo.squareRoot(16);
		System.out.println("The answer is: " + infaceTwo);
		//Single Parameter and Single Line Expression
		int infaceThree = ithree.squareOfNum(3);
		System.out.println("The answer is: " + infaceThree);
		//Multiple Parameters and Single Line Expression
		int infaceFour = ifour.addOfNum(3, 4);
		System.out.println("The answer is: " + infaceFour);
		//no parameters and single Line Expression
		String infaceFive = ifive.noParameter();
		System.out.println("The answer is: " + infaceFive);
		//no parameter and multiple line Expressions
		String infacesix = isix.noParameter2();
		System.out.println("The answer is: " + infaceOne);
	}

}
 