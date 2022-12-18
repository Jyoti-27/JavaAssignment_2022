package java_Learning;

public class StringDemo1 {

	
        // DataType variablename=Value;
		
		        //int i=10;
				//char c='Y';  char ch='o';  char cha='g';  char chr='e';  char chc='s';  char cht='h';
				
				// char[] cha1={'Y','o','g'.'e'.'s','h'};
				public static void main(String args[]){
				String name="Yogesh";  // by literal
				// String is a sequence of characters
				// string is a class in Java
				System.out.println(name);
				
				//char ch=name.charAt(8);// Exception generates in result
				//System.out.println("Character at index 8:-"+ch); 
				char ch=name.charAt(1);
				System.out.println("Character at index 1:-"+ch); 
				
				//System.out.println("Character at index 1:-"+name.charAt(1));
				
				// String is an object
				String s=new String("Yogesh");  // by String object
				System.out.println(s);
				
				// Class - holds variables, methods  // blueprint of object or blueprint where object is created
				// Object - real time entity or instance of class and it is state,behavior
				
				}	

}


