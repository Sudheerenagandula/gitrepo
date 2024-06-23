package packagecollection;

import java.util.Deque;
import java.util.LinkedList;
public class DeQueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Deque<String> deque=new LinkedList<>();
        deque.add("Gayathri");
        deque.addFirst("Second");
        deque.offerFirst("Third");//offer first has more priority than addfirst
        System.out.println("Deque: " + deque);
        // Adding elements to the end of the Deque
        deque.addLast("Last");
        deque.offerLast("Last2");

        // Printing the elements of the Deque
        System.out.println("Deque: " + deque);

        // Retrieving the first and last elements
        System.out.println("First Element: " + deque.getFirst());
        System.out.println("Last Element: " + deque.getLast());
        // Retrieving the first and last elements
        System.out.println("First Element: " + deque.peekFirst());
        System.out.println("Last Element: " + deque.peekLast());

        // Removing the first and last elements
        //deque.removeFirst();
        //deque.removeLast();
        deque.pollFirst();
        deque.pollLast();
        // Printing the elements after removal
        System.out.println("Deque after removal: " + deque);

        // Checking if the Deque is empty
        System.out.println("Is Deque empty? " + deque.isEmpty());

        // Getting the size of the Deque
        System.out.println("Size of Deque: " + deque.size());

        
        
	}

}