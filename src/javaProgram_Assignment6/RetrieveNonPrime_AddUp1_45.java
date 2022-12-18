
/* Program-1.45
  
 * Retrieve the non-prime numbers within the range of a given input. Add-up the non-prime numbers and return the result.
 */

package javaProgram_Assignment6;

import java.util.ArrayList;
import java.util.List;

public class RetrieveNonPrime_AddUp1_45 {

	public static void main(String[] args) {
		int i=20,j=40;
		System.out.println("sum of non-prime nos. is:"+additionOfnonPrimeNos(i,j));
		}
	public static int additionOfnonPrimeNos(int i, int j){
		int k=0;
		List<Integer> l1=new ArrayList<Integer>();
		List<Integer> l2=new ArrayList<Integer>();
		for(int a=i;a<=j;a++){
			int c=0;
			for(int b=2;b<a;b++)
				if(a%b==0)
					c++;
			if(c==0)
				l1.add(a); }
		for(int e=i;e<=j;e++)
			l2.add(e);
		l2.removeAll(l1);
		for(int d=0;d<l2.size();d++)
			k+=l2.get(d);
		return k;
	}
 }