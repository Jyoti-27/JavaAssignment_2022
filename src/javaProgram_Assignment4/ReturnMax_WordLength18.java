
/* Program-18
  
 *   i/p: Honesty is my best policy
 *   o/p: Honesty
 *   Return the maximum word length from the given string.
 *   If there are two words of same length then,
 *   return the word which comes first based on alphabetical order.

 */

package javaProgram_Assignment4;

import java.util.StringTokenizer;

public class ReturnMax_WordLength18 {

	public static void main(String[] args) {
		String s1="Honesty is my best policy";	
		System.out.println(lengthiestString(s1));
	}
	public static String lengthiestString(String s1) {
		int max=0;
		String s2=new String();
		StringTokenizer t=new StringTokenizer(s1," ");
		loop:
		while(t.hasMoreTokens()){
			String s3=t.nextToken();
			int n=s3.length();
			if(n>max){
				max=n;
				s2=s3;}
			if(n==max)
				for(int i=0;i<s3.length();i++){
					char c1=s2.charAt(i);
					char c2=s3.charAt(i);
					if(c1!=c2){				
						if(c2<c1)
							s2=s3;
						continue loop;}	  }
		}
		return s2;
	}
 }