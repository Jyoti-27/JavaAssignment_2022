package java_Learning;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String s=new String(" SACHIN ");    // by string object
		String s1=new String("SACHIN");    // by string object
		
		
		String name=new String(" SACHIN ");    // by literal
		String name1=new String("SACHIN");    // by literal
		System.out.println(name.length());	
		System.out.println(name1.replace('C', 'R'));
		//System.out.println(name1.replaceAll("SACHIN", "YOGESH"));
		
		System.out.println("8888"+s.trim());	
		System.out.println(s.trim());
		
		
		boolean check=s.equals(name);
		System.out.println("with equal method:-"+check);
		
		boolean check1=s==name;
		System.out.println("with == operator:-"+check1);
		
		boolean check2=name1==name;
		System.out.println("with == operator:-"+check2);
		
		boolean check3=s==s1;
		System.out.println("with == operator:-"+check3);
		
		char ch=name.charAt(5);
		System.out.println("Character at index 5 :-"+ ch);

	}

}

