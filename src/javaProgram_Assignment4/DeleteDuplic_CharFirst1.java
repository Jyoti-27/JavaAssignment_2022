
/* Program-1  // Not getting expected output// checked
  
 *  INPUT1= helloworld
 *  INPUT2= 2. delete the char,if rpted twice.
 *  if occurs more than twice,leave the first occurence and delete the duplicate
 *  O/P= helwrd;
 */

package javaProgram_Assignment4;

public class DeleteDuplic_CharFirst1 {

	public static void main(String[] args) {
		String input1="helloworld";
		int input2=2; 
	    System.out.println(deletingtheCharOccuringTwice(input1,input2));
	}
	public static String deletingtheCharOccuringTwice(String input1, int input2) {
		StringBuffer sb=new StringBuffer(input1);
		int c=1;
		for(int i=0;i<sb.length();i++){
			c=1;
			for(int j=i+1;j<sb.length();j++)
				if(sb.charAt(i)==sb.charAt(j))
					c++;
			if(c>=input2){	
				for(int j=i+2;j<sb.length();j++)
					if(sb.charAt(i)==sb.charAt(j))
						sb.deleteCharAt(j);
				sb.deleteCharAt(i);
				i--;   }	
			}
		return sb.toString();
	}
 }