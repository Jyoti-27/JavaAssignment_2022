
/* Program-7
  
 * Input1=”cowboy”; Output1=”cowcow”;
 * Input1=”so”;output1=”sososo”; 
 * HINT: if they give 3 letter word u have to display 2 time;
 */

package javaProgram_Assignment4;

public class Display_Twice7 {

	public static void main(String[] args) {
		//String ip1="cowboy";  
		//String ip2="cow";
		
		String ip1="so";  
	    String ip2="so";
		
		System.out.println(printingStringDependingOncharCount(ip1,ip2));
	}
	public static String printingStringDependingOncharCount(String ip1,String ip2) {
		StringBuffer sb=new StringBuffer();
		int n1=ip2.length();
		if(n1==3)
			for(int i=0;i<n1-1;i++)
				sb.append(ip1.substring(0, n1));
		else if(n1==2)
			for(int i=0;i<n1+1;i++)
				sb.append(ip1.substring(0, n1));
		return sb.toString();
	}
 }