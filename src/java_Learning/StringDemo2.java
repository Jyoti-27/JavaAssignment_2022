package java_Learning;

public class StringDemo2 {

	public static void main(String[] args) {

		
		String name="Yogesh";  // by literal
		// String is a sequence of characters
		// string is a class in Java
		System.out.println(name);
		char ch=name.charAt(5);
		System.out.println("Character at index 5:-"+ch); 
		System.out.println("Character at index 5:-"+name.charAt(5));
		
		
		// String concat (+)
		String lastname="Desai";
		// String fullname=name.concat(lastname);
		String fullname=name+lastname;
		System.out.println(fullname);
		String completeName=name+" Bapusaheb " +lastname;
		System.out.println(completeName);
		
		
		// equals()
		boolean status=name.equals("YOGESH");
		System.out.println(status);
		
		boolean status1=name.equalsIgnoreCase("YOGESH");
		System.out.println(status1);
		
		
		
		System.out.println(name.toUpperCase());
		
		//String completeName=name+" Bapusaheb " +lastname;
		System.out.println("=========="+completeName);
		
		
		String substr1=completeName.substring(6);
		System.out.println(substr1);
		
		String substr2=completeName.substring(0,6);
		System.out.println(substr2);
		
		
		// Split
		String[] splstring=completeName.split(" ");
		System.out.println(splstring.length);
		System.out.println(splstring[0]);
		System.out.println(splstring[1]);
		System.out.println(splstring[2]);
		
		   
		
		
		
		// String is an object
		//String s=new String("Yogesh");  // by String object
		
		
		// Class - holds variables, methods  // blueprint of object or blueprint where object is created
		// Object - real time entity or instance of class and it is state,behavior
	}

}

