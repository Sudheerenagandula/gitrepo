package array;

public class PositiveNUmber {
	public class PositiveNumbers {

	    public static void main(String[] args) {
	        int[] numbers = { -4, -3, 2, -1, 0 }; // Example array
	        convertToPositive(numbers);
	        
	        // Display the converted array
	        for (int number : numbers) {
	            System.out.print(number + " ");
	        }
	    }

	    private static void convertToPositive(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] < 0) {
	                array[i] = -1; // Convert negative number to positive
	            }
	        }
	    }
	}

}
