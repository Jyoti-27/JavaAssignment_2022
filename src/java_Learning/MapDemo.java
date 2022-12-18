package java_Learning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	// Map is an interface used to deal with key-value pair
	// It contains unique key
	// Duplicate values are allowed and overwrite the recent value so only allows unique key
	// HashMap is not synchronized so it is faster
	// Only one null key is allowed
	
	// Two types as:
	// 1. HashMap:- It doesn't maintain insertion order
	// 2. LinkedHashMap:- It maintains insertion order

	public static void main(String[] args) {
		
		Map<String,String>  map=new HashMap<>();
		map.put("FirstName","Sachin");
		map.put("LastName","Tendulkar");
		//map.put("FirstName","xyz");  // Duplicate key must overridden
		map.put("Age","27");   // Key is different but values allowed same so duplication is there
		map.put("Test","IPL-20");  // Key is different but values allowed same so duplication is there
		map.put(null,"test");
		map.put("temp","Tendulkar");
		map.put("temp1","Tendulkar");
		
		
		map.remove("Age");   // Only remove key automatically removed according value
		System.out.println(map.get("FirstName"));
		
		if(map.containsKey("FirstName"))   {
			if(map.get("FirstName").equals("Sachin"))   {
				System.out.println("Correct FirstName");
				
			}
		}
		
		
		
		
		
		
		// Two methods for iterating
		
		
		//1. Traversing through map using entrySet
		for(Map.Entry<String,String> m:map.entrySet())  {
			String key=m.getKey();
			System.out.println(m.getKey()+ " - "+m.getValue());
		}
		
		
		
		//2. Converting to set
		Set<Entry<String,String>>  test=map.entrySet();
		Iterator<Entry<String, String>>  itr=test.iterator();
		while(itr.hasNext())  {
			// System.out.println(itr.next());
			
			System.out.println(itr.next().getKey()+" - "+itr.next().getValue());
			
		}
		
		System.out.println(map.get("=============================="));
		
		Map<Integer, String>   map1 = new LinkedHashMap();
		map1.put(1, "Rohit");
		map1.put(2, "Rahul");
		map1.put(3,  "SKY");
		map1.put(4, "Ishan");
		
		//1. Traversing through map using entrySet
				for(Map.Entry<Integer,String> m1:map1.entrySet())  {
					int key=m1.getKey();
					System.out.println(m1.getKey()+ " - "+m1.getValue());
				}
		
		
		
		
	}

}

