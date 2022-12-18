
/* Program-3.10
  
 *   input1=1 ,input2=2 ,input3=3 --- output=6;
 *   input1=1 ,input2=13,input3=3 --- output=1;
 *   input1=13,input2=2 ,input3=8 --- output=8;
 *   if value equal to 13,escape the value '13', as well as the next value to 13.
 *   sum the remaining values

 */

package javaProgram_Assignment6;

import java.util.ArrayList;
import java.util.List;

public class Input_Sum3_10 {

	public static void main(String[] args) {
		int ip1=13,ip2=2,ip3=8;
		System.out.println(thirteenLapse(ip1,ip2,ip3));
	}
	public static int thirteenLapse(int ip1, int ip2, int ip3) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(ip1);
		l.add(ip2);
		l.add(ip3);
		int s=0;
		for(int i=0;i<l.size();i++){
			if(l.get(i)!=13)
				s+=l.get(i);
			if(l.get(i)==13)
				i=i+1;}
		return s;
	}
}