
/* Program-12   
 
 * Accept a string and find if it is of date format "dd/mm/yyyy".
 * input:01/13/2012
 * output:false
 */

package javaProgram_Assignment1;

import java.util.StringTokenizer;

public class DataFormat_String12 {

	public static boolean formattingDate(String s){
		boolean b1=false;
		StringTokenizer t=new StringTokenizer(s,"/");
		int n1=Integer.parseInt(t.nextToken());
		int n2=Integer.parseInt(t.nextToken());
		String s2=t.nextToken();
		int n3=Integer.parseInt(s2);
		int n4=s2.length();
		if(n4==4)
		{
			if(n3%4==0)
			{
				if((n2==2)&&(n1<=29))
					b1=true;
				else if((n2==4)||(n2==6)||(n2==9)||(n2==11)&&(n1<=30))
					b1=true;
				else if((n2==1)||(n2==3)||(n2==5)||(n2==7)||(n2==8)||(n2==10)||(n2==12)&&(n1<=31))
					b1=true; 
			}
			else 
			{
				if((n2==2)&&(n1<=28))
					b1=true;
				else if((n2==4)||(n2==6)||(n2==9)||(n2==11)&&(n1<=30))
					b1=true;
				else if((n2==1)||(n2==3)||(n2==5)||(n2==7)||(n2==8)||(n2==10)||(n2==12)&&(n1<=31))
					b1=true; 
			}
		}
		return b1;
	}
	public static void main(String[] args) {
	String s="01/12/2012";
	boolean b=formattingDate(s);
	if(b==true)
		System.out.println("date is in dd/MM/yyyy format");
	else
		System.out.println("date is not in dd/MM/yyyy format");
	}
}