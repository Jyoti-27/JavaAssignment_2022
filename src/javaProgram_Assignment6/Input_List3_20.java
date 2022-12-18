/* Program-3.20
  
 *   input1-List1-{apple,orange,grapes}
 *   input2-List2-{melon,apple,mango}
 *   output={mango,orange}
 *   operation-- In 1st list remove strings starting with 'a' or 'g'
 *               In 2nd list remove strings ending with 'n' or 'e'
 *   Ignore case, return in string array

 */

package javaProgram_Assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Input_List3_20 {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("apple");
		l1.add("orange");
		l1.add("grapes");
		List<String> l2=new ArrayList<String>();
		l2.add("melon");
		l2.add("apple");
		l2.add("mango");
		String[] s2=fruitsList(l1,l2);
		for(String s3:s2)
			System.out.println(s3);
	}
	public static String[] fruitsList(List<String> l1, List<String> l2){
		List<String> l3=new ArrayList<String>();
		for(int i=0;i<l1.size();i++){
			String s1=l1.get(i);
			if(s1.charAt(0)!='a' && s1.charAt(0)!='A' && s1.charAt(0)!='g' && s1.charAt(0)!='G')
				l3.add(s1); }
		for(int i=0;i<l2.size();i++){
			String s1=l2.get(i);
			if(s1.charAt(s1.length()-1)!='n' && s1.charAt(s1.length()-1)!='N' && s1.charAt(s1.length()-1)!='e' && s1.charAt(s1.length()-1)!='E')
				l3.add(s1); }
		Collections.sort(l3);
		String[] s2=new String[l3.size()];
		for(int i=0;i<s2.length;i++)
			s2[i]=l3.get(i);
		return s2;
	}
 }