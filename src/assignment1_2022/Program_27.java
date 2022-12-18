
/* Program_27
 
 * Create a program to get the hashmap from the given input string array where the key for the hashmap
 * is first three letters of array element in uppercase and the value of hashmap is the element itself
 * Input:{�goa�,�kerala�,�gujarat�}                 [string array]
 * Output:{{GOA,goa},{KER,kerala},{GUJ,Gujarat}}    [hashmap]   */






package assignment1_2022;

import java.util.ArrayList;
import java.util.HashMap;

public class Program_27 {

	public static void main(String[] args) {
	      String[] s1={"goa","kerala","gujarat"};
	      putvalues(s1);
	}
	public static void putvalues(String[] s1) {
	      ArrayList<String> l1=new ArrayList<String>();
	      HashMap<String,String> m1=new HashMap<String,String>();
	      ArrayList<String> l2=new ArrayList<String>();
	      for(String s:s1)
	            l1.add(s.toUpperCase().substring(0, 3));
	      for(String s:s1)
	            l2.add(s); 
	      for(int i=0;i<l1.size();i++)
	            m1.put(l1.get(i),l2.get(i)); 
	      System.out.println(m1);
	}

}

