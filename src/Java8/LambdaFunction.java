package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		// lambda function............
		        System.out.println("lambda func.....");
		        List<Integer> num1 = Arrays.asList(4,67,34,6,10);
		        Collections.sort(num1, (i1,i2) -> i1.compareTo(i2));
		        System.out.println("lambda Sort my array.....");
		        num1.forEach(l->System.out.println(l));
		        //num1.forEach(System.out::println);
		        System.out.println();
		        
		        
		        //method reference..........
		        System.out.println("method reference.....");
		        Collections.sort(num1,(Integer::compareTo));
		        num1.forEach(System.out::println);
		        System.out.println("Normal for loop....");
		        for(int arr:num1) {
		            System.out.println(arr);
		        }
	}

}
