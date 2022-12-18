
/* Program_39
 
 * Input a hashmap. Count the keys which are not divisible by 4 and return.  */



package assignment1_2022;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Program_39 {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put(24, "preethi");
		m1.put(32, "bhanu");
		m1.put(25, "menu");
		m1.put(31, "priya");
		System.out.println(fetchingKeysDivisibleByFour(m1));
	}
	public static int fetchingKeysDivisibleByFour(Map m1) {
		int k=0;
		Iterator i=m1.keySet().iterator();
		loop:
		while(i.hasNext()){
			int j=(int) i.next();
			if(j%4!=0)
				k++;
			continue loop; }
		return k;
	}
}

