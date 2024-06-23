package packagecollection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<String>que =new LinkedList<>();
que.add("First");
que.add("Second");
que.add("Third");
que.add("Fourth");
que.add("Fifth");
System.out.println(que);
que.remove();
System.out.println(que);
System.out.println(que.peek());
System.out.println(que.element());
System.out.println(que);
System.out.println(que.poll());
System.out.println(que);

	}

}
