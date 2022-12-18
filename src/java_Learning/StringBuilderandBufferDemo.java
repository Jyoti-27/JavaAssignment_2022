package java_Learning;

public class StringBuilderandBufferDemo {
	
	// String is immutable
	
	// mutable by using StringBuilder and Stringbuffer class

	public static void main(String[] args) {
		
		String name="Selenium";  // Selenium
		String name1=name;      // Selenium
		System.out.println(name1.hashCode());
		System.out.println(name.hashCode());
		
		
		
		// String name1=name+"automation";
		
		//System.out.println(name);
		//System.out.println(name1);
		
		name=name+"automation";  // Seleniumautomation
		System.out.println(name.hashCode());
		System.out.println(name1);
		System.out.println(name1.hashCode());  // Selenium
		
		
		System.out.println("==================StringBuilder is non-synchronized===================");
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.hashCode());
		sb.reverse();
		System.out.println(sb);
		sb.delete(0, 3);
		//sb.replace(1,3,xyz);
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		
		System.out.println("===================StringBuffer is synchronized========================");
		StringBuffer sbf=new StringBuffer("Rohit");
		System.out.println(sbf.hashCode());
		sbf.reverse();
		System.out.println(sbf);
		sbf.delete(0, 3);
		//sbf.replace(1,3,xyz);
		System.out.println(sbf);
		System.out.println(sbf.hashCode());
		
		
		
		//System.out.println(name1.hashCode);
		
		//StringBuilder sb=new StringBuilder("Sachin");
		
		

	}

}


