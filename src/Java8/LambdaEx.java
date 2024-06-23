package Java8;

import java.util.Arrays;
import java.util.List;

public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		List<Integer> intSeq = Arrays.asList(1,2,3); 
		intSeq.forEach(x -> System.out.println(x)); 
	
		System.out.println( "List Elem"+intSeq);
	System.out.println( "List Elements using enhansed loop");

	for(int arr:intSeq) {
	System.out.println(arr);
	}
	
	
	
	}

}
