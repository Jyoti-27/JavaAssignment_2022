
/* Program_16
 
 *  arraylist of string type which has name#mark1#mark2#mark3 format. retrieve the name of the student who has scored max marks(total of three)
 * input:{"arun#12#12#12","deepak#13#12#12"}
 * output:deepak   */






package assignment1_2022;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Program_16 {
	public static String retrieveMaxScoredStudent(String[] s1){
		Map<String, Integer> m1=new HashMap<String, Integer>();
		for(int i=0;i<s1.length;i++){
			String s2=s1[i];
			StringTokenizer t=new StringTokenizer(s2,"#");
			String s3=t.nextToken();
			int n1=Integer.parseInt(t.nextToken());
			int n2=Integer.parseInt(t.nextToken());
			int n3=Integer.parseInt(t.nextToken());
			int n=n1+n2+n3;m1.put(s3, n);}
		
		//System.out.println(m1);
		int max=0;
		String m=new String();
		Iterator<String> i=m1.keySet().iterator();
		while(i.hasNext()){
			String s4=i.next();
			int j=m1.get(s4);
			if(j>max){max=j;m=s4; 
			}
		 }
		return m;
		}
	
	public static void main(String[] args) {
		String[] s1={"arun#12#12#12","deepak#13#12#12","puppy#12#11#12"};
		System.out.println(retrieveMaxScoredStudent(s1));

	}

}
