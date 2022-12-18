
/* Program-1.41
  
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
 * output:inp1-inp2

 */

package javaProgram_Assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Input_Output1_41 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 3,6,7,8,9 };
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
}