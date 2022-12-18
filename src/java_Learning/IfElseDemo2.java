package java_Learning;

public class IfElseDemo2 {

	public static void main(String[] args) {

		
		
		// if else if ladder
		int score=90;
		
		
		if(score>=35  && score<60) {
			System.out.println("Student is passed");
		}

		else if(score>60  && score<75) {
			System.out.println("Student is passed with first class");
		}
		
		else if(score>75) {
			System.out.println("Student is passed with Distinction");
		}
		
		else if(score<35) {
			System.out.println("Student is failed");
		}

		
		
		
	}

}


