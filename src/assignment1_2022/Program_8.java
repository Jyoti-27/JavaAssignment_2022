
 /* Program_8
  * Write a program to display Day of the week using Switch case
  * Ex: Day=3 then display 'Wednesday'   */



package assignment1_2022;

public class Program_8 {

	public static void main(String[] args) {
        int day=3;
		
		switch(day) {
		case 1:
			System.out.println("Monday");
		break;
		case 2:
			System.out.println("Tuesday");
		break;
		case 3:
			System.out.println("Wednesday");
		break;
		case 4:
			System.out.println("Thursday");
		break;
		default:
			System.out.println("Friday/Saturday/Sunday");
		
		}

	}

}

