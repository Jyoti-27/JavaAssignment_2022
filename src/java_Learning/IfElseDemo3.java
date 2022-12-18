package java_Learning;

public class IfElseDemo3 {

	public static void main(String[] args) {
		
		
	   // nested if else
       int score=36;
       if(score>=35) {
		
		
		if(score>=35  && score<60) {
			System.out.println("Student is passed");
		}

		else if(score>60  && score<75) {
			System.out.println("Student is passed with first class");
		}
		
		else if(score>75) {
			System.out.println("Student is passed with Distinction");
		}
		
		else {
			System.out.println("Student is failed");
		}


	}

  }
}

