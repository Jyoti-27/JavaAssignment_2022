

/* Program_24
 
 * Retrieve the non-prime numbers within the range of a given input. Add-up the non-prime numbers and return the result.  */



package assignment1_2022;

import java.util.ArrayList;
import java.util.List;

public class Program_24 {
	
	
public static void main (String[] args)  {

    int i=20,j=40;
	System.out.println("Sum of non-prime numbers is:-" +additionOfnonPrimeNos(i,j));
}
	
	public static int additionOfnonPrimeNos(int i, int j)  {
	int k = 0;
	List<Integer> l1=new ArrayList<Integer> ();
	List<Integer>  l2=new ArrayList<Integer> ();
	for(int a=i;a<=j;a++){
		int c=0;
		int b1 = 5;
		for(int b=2;b<a;b++) 
			//int b1 = 0;
			if(a%b1==0) {
				c++;
		if(c==0)
			l1.add(a); }
	for(int e=i;e<=j;e++) {
		l2.add(e);
	l2.removeAll(l1);}
	
	for(int d=0;d<l2.size(); d++) {
		k+=l2.get(d);
	return k;
	}
}
	return k;

	}
}

	
	
