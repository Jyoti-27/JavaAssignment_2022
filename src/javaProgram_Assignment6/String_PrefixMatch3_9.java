/* Program-3.9
  
 * String[] input={"100","111","10100","10","1111"} input2="10"
 *  output=3;count strings having prefix"10" but "10" not included in count
 *  operation-- for how many strings input2 matches the prefix of each string in input1

 *  String[] input={"01","01010","1000","10","011"}
 *  output=3; count the strings having prefix"10","01" but "10","01" not included
 *  */

package javaProgram_Assignment6;
import java.util.*;
public class String_PrefixMatch3_9 {
public static void main(String[] args) {
	String[] ip={"100","111","10100","10","1111"};
	//String[] ip={"01","01010","1000","10","011"};
	gteCount(ip);
}
public static void gteCount(String[] ip) {
	int op=0;
	ArrayList<String> l1=new ArrayList<String>();
	for(String s:ip)
		if(s.startsWith("10") || s.startsWith("01") &&(s.length()>2))
			l1.add(s);
	op=l1.size();
	System.out.println(op);
 }
} 
 






