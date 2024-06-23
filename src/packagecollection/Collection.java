package packagecollection;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {
 
	 
	  
 
	 

		public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        ArrayList<String> arrayList = new ArrayList<String>();
	        arrayList.add("Kareem");
	        arrayList.add("Varad");
	        arrayList.add("Nitesh");
//	        System.out.println(arrayList);
//	        arrayList.set(0, "Onkar");
//	        System.out.println(arrayList);
//	        System.out.println(arrayList.get(0));
//	        System.out.println(arrayList.get(1));
//	        System.out.println(arrayList.isEmpty());
//	        System.out.println(arrayList.size());
//	        arrayList.remove(0);
//	        System.out.println(arrayList);
	        ArrayList<String> arrayList1 = new ArrayList<String>();
	        // arrayList1.isEmpty();
	        System.out.println("Is Empty " + arrayList1.isEmpty());
	        arrayList1.addAll(arrayList);// Add all Elements.
	        arrayList1.add("EduBridge");
	        System.out.println(arrayList1);
	        // arrayList1.removeAll (arrayList1);
	        System.out.println(arrayList1);
Collections.sort(arrayList1);
System.out.println(arrayList1);
	        for(String list:arrayList1);
	     
			String list = null;
			System.out.print(list+"");
			System.out.println( );
			System.out.println(arrayList1.contains("kareem123") );


}}
