/* Program-3.50
  
 *   HashMap<String,String> input1={“mouse”:”100.2”,”speaker”:”500.6”,”Monitor”:”2000.23”};
 *   String[] input2={“speaker”,”mouse”};
 *   Float output=600.80(500.6+100.2);

 */

package javaProgram_Assignment6;

import java.util.HashMap;
import java.util.Iterator;

public class Hashmap_String3_50 {

	public static void main(String[] args) {
		HashMap<String, String> m1=new HashMap<String, String>();
		m1.put("mouse", "100.2");
		m1.put("speaker","500.6");
		m1.put("monitor", "2000.23");
		String[] s={"speaker","mouse"};
		System.out.println(getTheTotalCostOfPheripherals(m1,s));
	}
	public static float getTheTotalCostOfPheripherals(HashMap<String,String> m1,String[] s) {
		Float f=(float) 0;
		Iterator<String> i=m1.keySet().iterator();
		while(i.hasNext()){
		String s1=(String) i.next();
		Float f1=Float.parseFloat(m1.get(s1));
		for(int j=0;j<s.length;j++)
			if(s[j].equals(s1))
				f+=f1;	}
		return f;
	}
 }