
/* Program_20
 
 *  A integer input is accepted. find the square of individual digits and find their sum.
 * input:125
 * output:1*1+2*2+5*5  */






package assignment1_2022;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Program_20 {
	// n=(int) m1.get(b);

	public static int averageOfMarks(Map m1){
        int n = 0,c = 0;
        Iterator i = m1.keySet().iterator();
        while(i.hasNext()){
              Integer b = (Integer) i.next();
              if(b%2 != 0){
                    c++;
                    n=(int) m1.get(b);
              }
        }
        return (n/c);
  }
  public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put(367, 89);
        m1.put(368, 98);
        m1.put(369, 92);
        m1.put(366, 74);
        m1.put(365, 67);
        System.out.println(averageOfMarks(m1));
  }
}

