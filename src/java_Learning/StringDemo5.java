package java_Learning;

public class StringDemo5 {

	public static void main(String[] args) {
		String s=new String(" SACHIN ");    // by string object
		String s1=new String(" SACHIN ");    // by string object
		
		
		String name=new String(" SACHIN ");    // by literal
		String name1=new String("SACHIN");    // by literal
		System.out.println(name.length());	
		//System.out.println(name1.replace('C', 'R'));
		System.out.println(name1.replaceAll("SACHIN", "YOGESH"));
		

	}

}

