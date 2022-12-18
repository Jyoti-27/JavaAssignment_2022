package java_Learning;

public class BreakContinueDemo2 {

	public static void main(String[] args) {
		
		
		
		// Continue:- skip the loop (without considering condition and) for current value
		for(int i=0; i < 10; i++) {
			if(i==5) {
				
				continue;
			}
			
			System.out.println("continue:-"+i);
			
		}
		

	}

}


