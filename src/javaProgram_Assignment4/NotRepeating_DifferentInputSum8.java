/* Program-8
  
 * input--- input1=1;
 *          input2=4;
 *          input3=1;
 *   output1=4;
 *   operation--- print the element which is not repeated    
 *   if all the inputs r different sum all inputs
 *   input---input1=1;
 *           input2=2;
 *           input3=3;
 *   output1=6;
 */

package javaProgram_Assignment4;

public class NotRepeating_DifferentInputSum8 {

			public static void main(String[] args) {
			//int ip1=1,ip2=2,ip3=3;
			int ip1=1,ip2=4,ip3=1;
			//int ip1=1,ip2=1,ip3=1;
			System.out.println(sumOfNonRepeatedChars(ip1,ip2,ip3));
		}
		public static int sumOfNonRepeatedChars(int ip1, int ip2, int ip3){
			int n=0;
			if(ip1!=ip2 && ip2!=ip3 && ip3!=ip1)
				n=ip1+ip2+ip3;
			else if(ip1==ip2 && ip2==ip3)
				n=0;
			else{
				if(ip1==ip2)
					n=ip3;
				else if(ip1==ip3)
					n=ip2;
				else if(ip2==ip3)
					n=ip1;	}
			return n;
		}
	}