/* Program-13
  
 *   prove whether a number is ISBN number or not
 *   input="0201103311"
 *   ISBN number:  sum=0*10 +2*9+ 0*8 +1*7+ 1*6 +0*5+ 3*4 +3*3+ 1*2 +1*1
 *   sum%11==0 then it is ISBN number

 */

package javaProgram_Assignment4;

public class ISBNNum_Sum13 {

	public static void main(String[] args) {
		String ip="020110331";
		boolean b=ISBNnumber(ip);
		if(b==true)
			System.out.println("valid ISBN number");
		else
			System.out.println("check ur data");
	}
	public static boolean ISBNnumber(String ip) {
		boolean b=false;
		int sum=0;
		for(int i=0,j=ip.length();i<ip.length();i++,j--){
			String s=String.valueOf(ip.charAt(i));
			int n=Integer.parseInt(s);
			sum+=(n*j);	}
		System.out.println(sum);
		if(sum%11==0)
			b=true;
		return b;
	}
 }