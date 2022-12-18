
/* Program-6
 * 
 * input={"1","2","3","4"}
 * output=10
 * i.e,if string elements are nos,add it.
 * input={"a","b"}
 * output=-1;
 */

package javaProgram_Assignment3;

public class Add_String6 {

	public static void main(String[] args) {
		//String s[]={"1","2","3","4"};
		String s[]={"a","b","3","4"};
		System.out.println(checkForStringElements(s));
	}
	public static int checkForStringElements(String[] s) {
		int n=0;
		boolean b=false;
		for(int i=0;i<s.length;i++)
		{
			String s1=s[i];
			for(int j=0;j<s1.length();j++)
			{
				char c=s1.charAt(j);
				if(Character.isDigit(c))
					b=true;
				else
				{
					b=false;
					break;
					}		
				}
			if(b==true)
				n+=Integer.parseInt(s1);
			else
			{
				n=-1;
				break;
				}		
			}
		return n;
	}
 }