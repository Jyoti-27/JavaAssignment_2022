/* Program-2
 
 *   Find the maximum chunk of a given string
 *   i/p: this isssss soooo good
 *   o/p=5
 */

package javaProgram_Assignment5;

import java.util.StringTokenizer;

public class Maximum_Chunk2 {

	public static void main(String[] args) {
		String s1="this isssss soooo good";	
		System.out.println(maxChunk(s1));
	}
	public static int maxChunk(String s1) {
		int max=0;
		StringTokenizer t=new StringTokenizer(s1," ");
		while(t.hasMoreTokens()){
			String s2=t.nextToken();
			int n=0;
			for(int i=0;i<s2.length()-1;i++)
				if(s2.charAt(i)==s2.charAt(i+1))
					n++;
			if(n>max)
				max=n;
		}
		return (max+1);
	}
 }