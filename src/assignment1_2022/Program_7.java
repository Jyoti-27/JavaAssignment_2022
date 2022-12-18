  /* Program_7
   * Write a program to find and list Prime numbers between 1 and any given number.
   * Example: Limit=50
   * Display Prime numbers between 1 and 50   */




// using For_Loop Statement



package assignment1_2022;

public class Program_7 {

	public static void main(String[] args) {
        int i, number, count; 
		
		System.out.println(" Prime Numbers from 1 to 50 are : ");	
		for(number = 1; number <= 50; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }  
		}
	}
}



// Second method:

// Scanner scan=new scan(System.in);
// System.out.println("Please check the number to be checked")
//  int num=scan.nextInt();
// int num;
// int flag=0;
// int n,m=0;
// m=num/2;
// if(num==0,|| num==1){
// System.out,println("Not a prime number");
// }
// else{
// for(n=2;n<m;n++){
//     if(num%n==0){
//        flag=1;
//   System.out,println("Not a prime number");
//        break;
//      }
//    }
//  }
// if(flag==0){
//   System.out.println("Number is a prime number");
//          }
//        }
//    }
