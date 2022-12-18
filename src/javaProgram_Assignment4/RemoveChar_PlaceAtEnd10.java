/* Program-10
  
 *   input --String input1 ="xaXafxsd"
 *   output--String output1="aXafsdxx"
 *   operation-- remove the character "x"(only lower case) from string and place at the end

 */

package javaProgram_Assignment4;

public class RemoveChar_PlaceAtEnd10 {

	public static void main(String[] args) {
		String input="xaXafxsd";
		System.out.println(removalOfx(input));
	}
	public static String removalOfx(String input) {
		StringBuffer sb=new StringBuffer(input);
		int j=0;
		for(int i=0;i<sb.length();i++)
			if(sb.charAt(i)=='x'){
				sb.deleteCharAt(i);
				j++;}
		for(int i=0;i<j;i++)
			sb.append('x');
		return sb.toString();
	}
 }