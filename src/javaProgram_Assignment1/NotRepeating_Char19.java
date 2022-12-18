/* Program-19
  
 * Find no of characters in a given string which are not repeated.
 * input: "hello"
 * output: 3

 */


package javaProgram_Assignment1;

public class NotRepeating_Char19 {

	public static int noOfnonRepeatedCharacters(String s1){
		StringBuffer sb=new StringBuffer(s1);
		for(int i=0;i<sb.length();i++){
			int n=0;
			for(int j=i+1;j<sb.length();j++)
				if(sb.charAt(i)==sb.charAt(j)){
					sb.deleteCharAt(j);
					n++; }
				if(n>0){
					sb.deleteCharAt(i);
					i--;}		}
		return sb.length();
	}
public static void main(String[] args) {
		String s1="hello";
		System.out.println(noOfnonRepeatedCharacters(s1));
	}
}