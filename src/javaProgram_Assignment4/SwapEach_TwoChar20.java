/* Program-20
  
 *   swap the every 2 chrecters in the given string 
 *   If size is odd number then keep the last letter as it is.
 *   Ex:- input: forget
 *	 output: ofgrte
 *   Ex:- input  : NewYork
 *        output : eNYwrok
 */

package javaProgram_Assignment4;

public class SwapEach_TwoChar20 {

	public static void main(String[] args) {
		String s1="NewYork";
		System.out.println(formattingGivenString(s1));
	}
	public static String formattingGivenString(String s1) {
		StringBuffer sb=new StringBuffer();
		int j=0;
		if(s1.length()%2==0)
			j=s1.length();
		else
			j=s1.length()-1;
		
		for(int i=0;i<j;i=i+2){
			String s2=(s1.substring(i, i+2));
			StringBuffer sb1=new StringBuffer(s2);
			sb.append(sb1.reverse());}
		
		String s3=new String();
		if(s1.length()%2==0)
			s3=sb.toString();
		else
			s3=sb.append(s1.charAt(s1.length()-1)).toString();
		return s3;
	}
 }