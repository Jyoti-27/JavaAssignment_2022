
/* Program_1
 * Take score as input from user and assign grade according to score.(Using If else statement).
 *	If score is less than 50 then assign grade as 'fail'
 *	If score is greater than or equal to 50 and less than 60 then assign grade as 'D'
 *	If score is greater than or equal to 60 and less than 70 then assign grade as 'C'
 *	If score is greater than or equal to 70 and less than 80 then assign grade as 'B'
 *	If score is greater than or equal to 80 and less than 90 then assign grade as 'A'
 *	If score is greater than or equal to 90 and less than 100 then assign grade as 'A+'
 *	Else Invalid Grade */



package assignment1_2022;

public class Program_1 {

	public static void main(String[] args) {
		
	int score=90;
		
		
		if(score<50) {
			System.out.println("Student is failed");
		}

		else if(score>=50  && score<60) {
			System.out.println("Student is assigned for grade-D");
		}
		
		else if(score>=60 && score<70) {
			System.out.println("Student is assigned for grade-C");
		}
		
		else if(score>=70 && score<80) {
			System.out.println("Student is assigned for grade-B");
		}
		
		else if(score>=80 && score<90) {
			System.out.println("Student is assigned for grade-A");
		}
		
		else if(score>=90 && score<100) {
			System.out.println("Student is assigned for grade-A+");
		}
		
		else {
			System.out.println("Invalid grade");
		}


		
		
		

	}

}

