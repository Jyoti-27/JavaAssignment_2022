package java_Learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	
	// Collection interface is framework which we have manipulated and store the data, interfaces and implements classes
	
	
	// Definition of ArrayList:-
	// List types data ==> [1,2,3,4,5,6]
	// Duplicates data are allowed ==>[1,1,2,2,3,4,4,6,8]
	// Insertion order is maintained 
	// Null values are allowed
	
    // ArrayList is dynamic array and and slower for adding and deleting element 
	
	// LinkedList is a doubly list or it is linked for previous and next element and faster for adding and deleting element
	
	
	
	
		public static void main(String[] args) {
			LinkedList<Integer> linklist=new LinkedList<>();
			linklist.add(10);
			linklist.add(20);
			linklist.add(30);
			linklist.add(null);  // Null values are allowed
			System.out.println("linklist"+linklist);
			linklist.add(2,40);
			System.out.println("linklist"+linklist);
			linklist.remove(1);
			System.out.println("linklist"+linklist);
			linklist.addFirst(5);
			linklist.addLast(100);
			System.out.println("linklist"+linklist);
			
			
			
			
			
        	int a[]=new int[5];   // Array Size is fixed 
			
			// ArrayList<Integer> list=new ArrayList<>();  /or use below syntax
			List<Integer> list = new ArrayList<>();
			System.out.println(list);
			System.out.println(list.size());
			list.add(10);
			list.add(20);
			System.out.println(list);
			System.out.println(list.size());
			list.add(2,30);
			System.out.println(list);
			list.remove(1);
			System.out.println("Updated list after removal-:"+list);
			list.add(50);
			list.add(10);
			System.out.println(list.get(0));
			System.out.println(list.get(1));
			System.out.println(list.get(2));
			System.out.println(list);
			
			
					
			// To iterate Array List
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
			
			
			for (Integer k:list) {
				System.out.println(k);
			}
			
			
			// Using Iterator
			Iterator<Integer> itr=list.iterator();
			while(itr.hasNext())  {
				System.out.println(itr.next());
			}
			
			

	}

}

