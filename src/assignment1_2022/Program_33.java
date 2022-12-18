
/* Program_33
 
 *  input-- String input1="AAA/abb/CCC"
 *  char input2='/'
 *  output-- String[] output1;
 *  output1[]={"aaa","bba","ccc"};

 *  operation-- get the strings from input1  using stringtokenizer
 *               reverse each string
 *               then to lower case
 *               finally store it in output1[] string array    */





package assignment1_2022;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Program_33 {

	public static void main(String[] args) {
		 String ip1="AAA/abb/CCC";
		 char ip2='/';
		 String op[]=loweringCasenReverseofaString(ip1,ip2);
		 for(String s:op)
		 System.out.println(s);
		}
		public static String[] loweringCasenReverseofaString(String ip1, char ip2){
		 List<String> l=new ArrayList<String>();
		 StringTokenizer t=new StringTokenizer(ip1,"/");
		 while(t.hasMoreTokens()){
		  StringBuffer sb=new StringBuffer(t.nextToken().toLowerCase());
		  l.add(sb.reverse().toString()); }
		 String op[]=new String[l.size()];
		 for(int i=0;i<op.length;i++)
		  op[i]=l.get(i);
		 return op;
		}
	}

