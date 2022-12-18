/* Program-1.47
  
 * Input a hashmap. Count the keys which are not divisible by 4 and return.
 */

package javaProgram_Assignment6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InputHashmap_CountKeys1_47 {

	public static void main(String[] args) {
		Map<Integer, String> m1=new HashMap<Integer, String>();
		m1.put(24, "preethi");
		m1.put(32, "bhanu");
		m1.put(25, "menu");
		m1.put(31, "priya");
		System.out.println(fetchingKeysDivisibleByFour(m1));
	}
	public static int fetchingKeysDivisibleByFour(Map<Integer, String> m1) {
		int k=0;
		Iterator<Integer> i=m1.keySet().iterator();
		loop:
		while(i.hasNext()){
			int j=i.next();
			if(j%4!=0)
				k++;
			continue loop; }
		return k;
	}
}