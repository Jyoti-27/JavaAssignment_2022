
/* Program_23
 
 * input1={1,2,3}
 * input2={3,4,5}
 * input3;+(union)
 * output:inp1+inp2
 * input1:{1,2,3,4,5}
 * input 2:{2,3,4,5}
 * input3=*(intersection)
 * output:inp1*inp2
 * INPUT1:{1,2,3,4,5}
 * INPUT2:{3,6,7,8,9}
 * INPUT3:-(MINUS)
 * output:inp1-inp2    */

package assignment1_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program_23 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 0, 2, 4, 6, 8 };
		/*
		 * Scanner s = new Scanner(System.in); int c = s.nextInt();
		 */
		arrayOperations(a, b);
		
	}
	
	public static void arrayOperations (int a[], int b[]) {
		
		int size=a.length;
		int [] addition = new int[size];
		int [] subtraction = new int[size];
		int [] multiplication = new int[size];
		
		for(int i=0;i<size;i++) {
			addition[i]=a[i]+b[i];
			subtraction[i]=a[i]-b[i];
			multiplication[i]=a[i]*b[i];
		}
		
		System.out.print("addition array is:-");
		for (int k=0;k<size;k++) {
			System.out.print(" "+addition[k]);
			
		}
		System.out.println("");   //break line
		System.out.print("subtraction array is:-");
		
		for (int k=0;k<size;k++) {
			System.out.print(""+subtraction[k]);
			
		}
		System.out.println(""); //break line
		
		System.out.print("multiplication array is:-");
		for (int k=0;k<size;k++) {
			System.out.print(" "+multiplication[k]);
			
		}
		
	}
	
	/*
	 * public static int[] arrayFunctions(int[] a, int[] b, int c) {
	 * 
	 * List<Integer> l1=new ArrayList<Integer>(); List<Integer> l2=new
	 * ArrayList<Integer>(); //@SuppressWarnings("rawtypes") List<Integer> l3=new
	 * ArrayList<Integer>();
	 * 
	 * for(int i=0;i<a.length;i++) l1.add(a[i]); for(int i=0;i<b.length;i++)
	 * l2.add(b[i]);
	 * 
	 * switch(c){ case 1: l1.removeAll(l2); l1.addAll(l2); Collections.sort(l1);
	 * l3=l1; break; case 2: l1.retainAll(l2); Collections.sort(l1); l3=l1; break;
	 * case 3: if(l1.size()==l2.size()) for(int i=0;i<l1.size();i++)
	 * l3.add(Math.abs(l2.get(i)-l1.get(i))); break; } int[] d=new int[l3.size()];
	 * for(int i=0;i<d.length;i++) d[i]=l3.get(i);
	 * 
	 * return d;
	 * 
	 * 
	 * }
	 */
}
