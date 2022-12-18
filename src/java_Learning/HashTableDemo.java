package java_Learning;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableDemo {
	// Legacy class used to deal with key-value pair
	
	// Unique  key (no duplicate keys allowed)
	// It doesn't allow null key as well as value
	// It's synchronized(thread safe-secured) at a time one transaction will be processed after completing next one will be processed
	
	
	

	public static void main(String[] args) {
		Hashtable<String,String>   table = new Hashtable<>();
		table.put("Name", "Rohan");
		table.put("AGE", "27");
		table.put("Occupation", "Software Engineer");
		table.put("Technology", "Automation Testing");
		//table.put("xhjk", null);
		table.remove("Occupation");
		
		
		for(Entry<String, String>  m1:  table.entrySet())   {
			System.out.println(m1.getKey()  + "-"  + m1.getValue());
		}
		
		

	}

}

