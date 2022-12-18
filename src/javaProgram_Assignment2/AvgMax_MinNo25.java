/* Program-25
  
 * Find the average of the maximum and minimum number in an integer array

 */


package javaProgram_Assignment2;

import java.util.Arrays;

public class AvgMax_MinNo25 {

	public static void main(String[] args) {
		int[] a={10,54,23,14,32,45};
		System.out.println(avgOfMaxandMinNoinArray(a));
	}
	public static int avgOfMaxandMinNoinArray(int[] a) {
		Arrays.sort(a);
		int b=a[0];
		int c=a[a.length-1];
		return (b+c)/2;
	}

}