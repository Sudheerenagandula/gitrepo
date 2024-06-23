package Java8;

 

	 
		import java.util.Arrays;
		import java.util.Collections;
		import java.util.List;
		public class MethodReferenceex {
		    public static void main(String[] args) {
		        // lambda function 
		        System.out.println("Lambda Function");
		        List<String> str1 = Arrays.asList("Nitesh","Rutuja","Karim","onkar");
		        Collections.sort(str1, (i1,i2) -> i1.compareTo(i2));
		        System.out.println("Sort String by Lambda Function");
		        str1.forEach(l->System.out.println(l));
		        System.out.println();
		        
		        
		        //method reference..........
		        System.out.println("Method Reference");
		        Collections.sort(str1,(String::compareTo));
		        str1.forEach(System.out::println);
		        System.out.println("Method Reference");
		        for(String arr:str1) {
		            System.out.println(arr);
		        }
		    }
		
	}


