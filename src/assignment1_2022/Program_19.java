
/* Program_19
 
 * HashMap with regnum as key and mark as value. find the avg of marks whose key is odd.
 * input:{12:90,35:90,33:90,56:88}
 * output:avg of(90+90) =90  */




package assignment1_2022;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Program_19 {

	public static int averageOfMarks(Map<Integer,Integer> m1){
		int n=0,c=0;
		Iterator<Integer> i=m1.keySet().iterator();
		while(i.hasNext()){
			Integer b=i.next();
			if(b%2!=0){c++;n+=m1.get(b);
			} 
		}
		return (n/c);
	 }
	public static void main(String[] args) {
		Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
		m1.put(367, 89);
		m1.put(368, 98);
		m1.put(369, 92);
		m1.put(366, 74);
		m1.put(365, 67);
		System.out.println(averageOfMarks(m1));
  }
}


