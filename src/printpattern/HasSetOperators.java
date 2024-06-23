package printpattern;

import java.util.HashSet;
import java.util.LinkedHashSet;

public abstract class HasSetOperators {
public abstract void main (String[]args);

HashSet <Integer>hashSet =new HashSet<Integer>();
hashSet.add(12);
hashSet.add(14);
hashSet.add(16);
System.out.println("Even Number"+ hashSet);
HashSet <Integer>hashSet1 =new HashSet<Integer>();
hashSet1.add(1);
hashSet1.add(2);
hashSet1.add(3);
System.out.println("odd Number"+ hashSet);
hashset1.addAll(hashSet);
System.out.println("UNION"+ hashSet1);
//hashSet1.addAll(hashSet); // addAll is Used To Perform UNION Operations.
 // System.out.println("UNION "+hashSet1);
 // hashSet1.retainAll(hashSet); // retainAll is used to perform INTERSECTION
 // Operations.
 // System.out.println("INTERSECTION "+hashSet1);
 hashSet1.removeAll(hashSet); // removeAll is used to perform Difference Operations, it prints the common
                                 // Number between 2 HashSets.
 System.out.println("DIFFRENCE " + hashSet1);









}







