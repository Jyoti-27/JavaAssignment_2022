/*  Program-11
 
 * Two input strings are accepted. If the two strings are of same length concate them and return, if they are not of same length, reduce the longer string to size of smaller one, and concat them
 * input1:"hello"
 * input2:"hi" 
 * output:"lohi"
 * input1:"aaa"
 * input2:"bbb"
 * output:"aaabbb"

 */



package javaProgram_Assignment1;

import java.util.Map;
import java.util.Scanner;

public class Concatanation_String11 {
	
public String minCat(String st1, String st2) 
{
	  if (st1.length() == st2.length())
	    return st1+st2;
	  if (st1.length() > st2.length())
	  {
	    int diff = st1.length() - st2.length();
	    return st1.substring(diff, st1.length()) + st2;
	  } else 
	  {
	    int diff = st2.length() - st1.length();
	    return st1 + st2.substring(diff, st2.length());
	  }
    }
	  String minCat1(String st3, String st4) 
	  {
	
    if (st3.length() == st4.length())
       return st3+st4;
    if (st3.length() > st4.length())
    {
      int diff = st3.length() - st4.length();
      return st3.substring(diff, st3.length()) + st4;
    } else 
    {
      int diff = st4.length() - st3.length();
      return st3 + st4.substring(diff, st4.length());
     }
   }

public static void main (String[] args)
    {
	Concatanation_String11 m= new Concatanation_String11();
      String str1 =  "hello";
	  String str2 =  "hi";
	  String str3 =  "aaa";
	  String str4 =  "bbb";
	  System.out.println("The given strings is: "+str1+" and "+str2);
	  System.out.println("The new string is: "+((Concatanation_String11) m).minCat(str1,str2));
	  System.out.println("The given strings is: "+str3+" and "+str4);
	  System.out.println("The new string is: "+((Concatanation_String11) m).minCat(str3,str4));
	  
     
	 }
}

	  