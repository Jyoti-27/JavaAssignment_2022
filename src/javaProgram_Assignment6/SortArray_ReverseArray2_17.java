/* Program-2.17
  
 * input array={red,green,blue,ivory}
 * sort the given array
 * reverse the given array
 * if user input is 1 it should give o th element of an reversed array.

 */

package javaProgram_Assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArray_ReverseArray2_17 {

	public static void main(String[] args) {
		String[] s={"red","green","blue","ivory","yellow"};
		int n=1;
		System.out.println(retrievingRequiredColor(s,n));
	}
	public static String retrievingRequiredColor(String[] s, int n) {
		String s1=new String();
		List<String> l=new ArrayList<String>();
		for(int i=0;i<s.length;i++)
			l.add(s[i]);
		Collections.sort(l,Collections.reverseOrder());
		for(int i=0;i<l.size();i++)
			if(i==(n-1))
				s1=l.get(i);
		return s1;
	}
 }