/* Program-13
  
 * Take the word with a max length in the given sentenance
 * in that check for vowels if so count the no.of occurances !
 * Input 1="Bhavane is a good girl"
 * Output =3
 * Input 1="Bhavanee is a good girl"
 * Output =4

 */

package javaProgram_Assignment3;

import java.util.StringTokenizer;

public class OccuranceOf_Vowels13 {

	public static void main(String[] args) {
		String s1="Bhavane is a good girl";
		//String s1="Bhavanee is a good girl";
		
		System.out.println(countVowelsInMaxLengthString(s1));
	}
	public static int countVowelsInMaxLengthString(String s1) {
		int n1=0, max=0;
		String s4="AEIOUaeiou";
		String s3=new String();
		StringTokenizer t=new StringTokenizer(s1," ");
		while(t.hasMoreTokens()){
		String s2=t.nextToken();
		int n2=s2.length();
		if(n2>max){
			max=n2;
			s3=s2;}	}
		for(int i=0;i<s3.length();i++)
			for(int j=0;j<s4.length();j++)
				if(s3.charAt(i)==s4.charAt(j))
					n1++;
		return n1;
	}
 }