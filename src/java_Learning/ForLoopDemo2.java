package java_Learning;

public class ForLoopDemo2 {

	public static void main(String[] args) {
		
		String name="sachin";   // Array of characters-['s','a','c','h','i','n']

		
		// for loop
		for(int i=1; i<=10; i++) {
			System.out.println("Value of i:-"+i);
			
		}
		
		
		
		System.out.println(name.length());
		
		
		for(int k=0; k < name.length(); k++ ) {
			System.out.println(name.charAt(k));
			
		}
		
		// Advance for loop(or for each loop)
		for(char i: name.toCharArray()) {
			System.out.println("Using Advance for loop:-"+i);
			
		}
	}

}

