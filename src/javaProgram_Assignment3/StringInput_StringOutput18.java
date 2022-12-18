/* Program-18
  
 * String[] input1=["Vikas","Lokesh",Ashok]
 * expected output String: "Vikas,Lokesh,Ashok"

 */

package javaProgram_Assignment3;

public class StringInput_StringOutput18 {

	public static void main(String[] args) {
		String[] ip={"Vikas","Lokesh","Ashok"};
		System.out.println(getTheNamesinGivenFormat(ip));
	}
	public static String getTheNamesinGivenFormat(String[] ip) {
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<ip.length;i++)
			sb.append(ip[i]).append(',');
		sb.deleteCharAt(sb.length()-1);
		return sb.toString();
	}
  }