/* Program-12
  
 *   Add elements of digits:9999 
 *   output:9+9+9+9=3+6=9;

 */

package javaProgram_Assignment5;

public class Addition_Elements12 {

	public static void main(String[] args) {
		int n=9999;
		System.out.println(conversiontoaSingleDigit(n));
	}
	public static int conversiontoaSingleDigit(int n){
		loop:
			while(n>10){
				int l=0,m=0;
				while(n!=0){
					m=n%10;
					l=l+m;
					n=n/10; }
				n=l;
				continue loop; }
		return n;
	}
  }