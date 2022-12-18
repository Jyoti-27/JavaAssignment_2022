/* Program-20
  
 * Square root calculation of
 * ((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2))
 * o/p should be rounded of to int;

 */

package javaProgram_Assignment3;

public class Sqroot_Calculn20 {

	public static void main(String[] args) {
		int x1=4,x2=8;
		int y1=3,y2=5;
		sqrt(x1,x2,y1,y2);
	}
	public 	static void sqrt(int x1, int x2, int y1, int y2) {
		int op;
		op=(int) (Math.sqrt((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2)));
		System.out.println(op);
	}
 }