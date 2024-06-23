package JDBC;

import java.util.ArrayList;
import java.util.Collection;

public class List {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		((ArrayList) list).add(1); // Line 1
		Object object = list.get(list.size()); // Line 2
		System.out.println(object);
	}

}
