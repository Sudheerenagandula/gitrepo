package packagecollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExample {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        TreeSet<String> hashSet = new  TreeSet<String>();//HashSet replace with treeset = alphabetic order
        hashSet.add("Kareem");
        hashSet.add("Varad");//only one null values is allowed in HashSet
        hashSet.add("Nitesh");//HashSet will print random values
        System.out.println(hashSet);
}
}
