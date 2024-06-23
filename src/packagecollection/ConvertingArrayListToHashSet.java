package packagecollection;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertingArrayListToHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> alist=new ArrayList<String>();
	alist.add("sudheer");
	alist.add("varad");
	alist.add("sai");
	alist.add("varad");
	System.out.println(alist);
	 
	HashSet<String> hashSet=new HashSet<String>(alist);

	System.out.println(hashSet);
	}

}
