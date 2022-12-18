
/* Program-1    // Not getting loop idea at c==122
  
 *   i/p: bengal
 *   o/p: ceogbl
 *   if z is there replace with a
 */

package javaProgram_Assignment5;

public class Input_Output1 {

	public static void main(String[] args) {
		//String s1="bengal";
		String s1="aengal";
		System.out.println(stringFormatting(s1));
	}
	public static String stringFormatting(String s1) {
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s1.length();i++){
			char c=s1.charAt(i);
			if(i%2==0){
				if(c==122)
					c=(char) (c-25);
				else{
					c=(char) (c+1);}
					sb.append(c);}
			else
				sb.append(c);}
		return sb.toString();
	}
 }