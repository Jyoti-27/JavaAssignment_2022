

/* Program_28
 
 * I/P hashmap<String String>{"ram:hari","cisco:barfi","honeywell:cs","cts:hari"};
 * i/p 2="hari";
 * o/p string[]={"ram","cts"};    */





package assignment1_2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Program_28 {

	public static void main(String[] args) {
	      HashMap<String,String> m1=new HashMap<String,String>();
	      m1.put("ram","hari");
	      m1.put("cisco","barfi");
	      m1.put("honeywell","cs");
	      m1.put("cts","hari");
	      String s2="hari";
	      getvalues(m1,s2);
	}
	public static void getvalues(HashMap<String, String> m1, String s2) {
	      ArrayList<String>l1=new ArrayList<String>();
	      for(Entry<String, String> m:m1.entrySet()){
	            m.getKey();
	            m.getValue();
	            if(m.getValue().equals(s2))  
	                  l1.add(m.getKey());           }
	      String[] op= new String[l1.size()];
	      for(int i=0;i<l1.size();i++){
	            op[i]=l1.get(i)   ;
	            System.out.println(op[i]);    }
	}

	
}

