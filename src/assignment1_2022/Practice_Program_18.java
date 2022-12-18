
// Assignment 11

// WrapperClass ListMethod using String type data




package assignment1_2022;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Practice_Program_18 {


	// List types data ==> [1,2,3,4,5,6]
	// Duplicates data are allowed ==>[1,1,2,2,3,4,4,6,8]
	// Insertion order is maintained 
	
	
    // ArrayList is dynamic array and and slower for adding and deleting element 
	
	// LinkedList is a doubly list or it is linked for previous and next element and faster for adding and deleting element
	
	public static void main(String[] args) {
		LinkedList<String> linklist=new LinkedList<>();
		linklist.add("Jyoti");
		linklist.add("Deepali");
		linklist.add("Swati");
		linklist.add(null);  // Null values are allowed
		System.out.println("linklist"+linklist);
		linklist.add(2,"Divya");
		System.out.println("linklist"+linklist);
		linklist.remove(1);
		System.out.println("linklist"+linklist);
		linklist.addFirst("Nikita");
		linklist.addLast("Shraddha");
		System.out.println("linklist"+linklist);
		
		
	
	
	
			
			
        	int a[]=new int[6];   // Array Size is fixed 
			
			ArrayList<String> list=new ArrayList<>();
			System.out.println(list);
			System.out.println(list.size());
			list.add("Jyoti");
			list.add("Deepali");
			System.out.println(list);
			System.out.println(list.size());
			list.add(2,"Swati");
			System.out.println(list);
			list.remove(1);
			System.out.println("Updated list after removal-:"+list);
			list.add("Divya");
			list.add("Nikita");
			System.out.println(list.get(0));
			System.out.println(list.get(1));
			System.out.println(list.get(2));
			System.out.println(list);
			
			
					
			// To iterate Array List
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
			
			
			for (String k:list) {
				System.out.println(k);
			}
			
			
			// Using Iterator
			Iterator<String> itr=list.iterator();
			while(itr.hasNext())  {
				System.out.println(itr.next());
			}
			
			

	}

}


