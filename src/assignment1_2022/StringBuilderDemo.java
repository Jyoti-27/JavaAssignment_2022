package assignment1_2022;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sb2=new StringBuilder("I am learning");
		sb2.append(" Automation");
		System.out.println(sb2);
		sb2.replace(14,23,"Selenium");
		System.out.println(sb2);
		sb2.delete(13,23);
		System.out.println(sb2);
		sb2.reverse();
		System.out.println(sb2);
		

	}

}


