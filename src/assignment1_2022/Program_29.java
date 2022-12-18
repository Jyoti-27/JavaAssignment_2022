

/* Program_29
 
 * Input1={�ABX�,�ac�,�acd�};
 * Input2=3;
 * Output1=X$d  */






package assignment1_2022;

import java.util.ArrayList;

public class Program_29 {
	public static void main(String[] args) {
		 String[] s1={"ABX","ac","acd"};
		 int ip=3;
		 getStr(s1,ip);
		}
		public  static void getStr(String[] s1, int ip) {
		 String op=" ";
		 String s2=" ";
		 ArrayList<String> l1=new ArrayList<String>();
		 for(String s:s1)
		  if(s.length()==ip)
		  l1.add(s); 
		 StringBuffer buff=new StringBuffer();
		 for(String l:l1){
		     s2=l.substring(l.length()-1);
		     buff.append(s2).append("$"); }
		 op=buff.deleteCharAt(buff.length()-1).toString();
		 System.out.println(op);
		}
	}

