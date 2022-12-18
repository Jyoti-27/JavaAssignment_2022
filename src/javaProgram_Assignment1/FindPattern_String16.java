/* Program-16 // check it- corrected
 
 * Find if a given pattern appears in both the input strings at same positions.
 * input1: "hh--ww--"
 * input2: "rt--er--"
 * output: true(false otherwise)

 */


package javaProgram_Assignment1;

public class FindPattern_String16 {

	public static boolean stringPattern(String s1,String s2){
		String st1=s1.length()<s2.length()?s1:s2;
	    String st2=s1.length()>s2.length()?s1:s2;
        boolean b=true;
        String s=st2.substring(st1.length());
	    if(s.contains("-"))
	    	 b=false;
	    else{
        loop:
	    for(int i=0;i<st1.length();i++)
	    	if((st1.charAt(i)=='-') || (st2.charAt(i)=='-'))
	    		if(st1.charAt(i)!=st2.charAt(i)){
	    			 b=false;
	    			 break loop;  }
	    	} 
	    return b;
	}
	public static void main(String[] args) {
		String s1="hh--ww--";
		String s2="rt--er--";
		boolean b=stringPattern(s1,s2);
		if(b==true)
			System.out.println("Same pattern");
		else
			System.out.println("Different pattern");
	}
}