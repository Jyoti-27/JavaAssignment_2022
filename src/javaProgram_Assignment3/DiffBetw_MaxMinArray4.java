/* Program-4
  
 * int[] a={12,14,2,26,35}
 * find the difference b/w max and min values in array
 * output:35-2=33.

 */


package javaProgram_Assignment3;

import java.util.Arrays;

public class DiffBetw_MaxMinArray4 {

	public static void main(String[] args) {
		int a[]={12,14,2,26,35};
		System.out.println(diffBwMaxAndMin(a));
	}
	public static int diffBwMaxAndMin(int[] a) {
		Arrays.sort(a);
		int n=a[a.length-1]-a[0];
		return n;
	}
 }