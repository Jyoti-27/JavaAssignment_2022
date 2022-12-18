/* Program-5
  
 *   input1="the sun raises in the east";
 *   output1=raises;
 *   count no vowels in each word and print the word which has max
 *   no of vowels if two word has max no of vowel print the first one
 */

package javaProgram_Assignment5;

import java.util.StringTokenizer;

public class Count_Vowels5 {

	public static void main(String[] args) {
		String s1="the sun rises in the east";	
		System.out.println(wordWithMaxVowelCount(s1));
	}
	public static String wordWithMaxVowelCount(String s1) {
		int max=0;
		String s2="aeiouAEIOU";
		String s3=new String();
		StringTokenizer t=new StringTokenizer(s1," ");
		while(t.hasMoreTokens()){
			String s4=t.nextToken();
			int c=0;
			for(int i=0;i<s4.length();i++)
				for(int j=0;j<s2.length();j++)
					if(s4.charAt(i)==s2.charAt(j))
						c++;
			if(c>max){
				max=c;
				s3=s4;}	}
		return s3;
	}
 }