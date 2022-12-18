/*Program-1.7
  
 * Retrieve the odd numbers till given input number. add and subtract it consecutively and return the result.

 * Input:9
 * Output:1+3-5+7-9=-3    
 * */

package javaProgram_Assignment6;
import java.util.*;
public class RetrieveOdd_AddSubtract1_7 {
	public static int consecutiveSumSubofOddNos(int n){
		List<Integer> l1=new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
			if(i%2!=0)
				l1.add(i);
		int n1=l1.get(0);
		for(int i=1;i<l1.size();i++)
			if(i%2!=0)
				n1=n1+l1.get(i);
			else
				n1=n1-l1.get(i);
		return n1;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Input Number:-");
		int n=s.nextInt();
		System.out.println(consecutiveSumSubofOddNos(n));
	}
}