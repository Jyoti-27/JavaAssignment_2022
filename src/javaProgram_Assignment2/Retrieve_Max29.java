/* Program-29
  
 * Retrieve the max from array which is in a odd-index

 */


package javaProgram_Assignment2;

import java.util.ArrayList;
import java.util.List;

public class Retrieve_Max29 {

	public static void main(String[] args) {
		int[] a={10,23,45,54,32,14,55,65,56};
		System.out.println(retrieveMaxFromOddIndex(a));
		}
	public static int retrieveMaxFromOddIndex(int[] a) {
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
			if(i%2!=0)
				l.add(a[i]);
		int b=0;
		for(int i=0;i<l.size();i++){
			int c=(Integer) l.get(i);
			if(c>b)
				b=c; }
		return b;
	}
 }