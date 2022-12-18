package java_Learning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

public class SetDemo {
	
	// Set is used for unique data(or value) i.e. duplicate data is not allowed in set
	// null values are allowed
	
	// Two types:-
	// 1. HashSet==> It doesn't maintain insertion order
	// 2. LinkedHashSet==> It maintains insertion order

	public static void main(String[] args) {
	
	// 1. HashSet==> It doesn't maintain insertion order	
	HashSet<String> set=new HashSet<>();
	set.add("Sachin");
	set.add("Sourav");
	set.add("Rahul");
	set.add("Sachin");  // only once type not duplicated
	System.out.println(set);
	set.remove("Sachin");   // for remove direct add value; not allowed by index value like list type
	set.add(null);
	System.out.println("Original"+set);
	Object sample=set.clone();
	System.out.println("Cloned Set"+sample);
	System.out.println(set);
	
	// Using iterator
	Iterator<String>  itr=set.iterator();
	while(itr.hasNext())  {
		System.out.println(itr.next());
	}
		
	
	
	
	
	// 2. LinkedHashSet==> It maintains insertion order
	LinkedHashSet<String> linkset=new LinkedHashSet<>();
	linkset.add("Anil");
	linkset.add("Shrinath");
	linkset.add("Zaheer");
	linkset.add("Anil");
	linkset.add("null");
	System.out.println(linkset);
	linkset.remove("Anil");
	System.out.println(linkset);
	

	}

}

