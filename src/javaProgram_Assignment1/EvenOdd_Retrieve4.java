
/*  Program-4
  
 * Given two arrayslist. retrieve the odd position elements form first input and even position elements from second list. 
 * put it into the new arraylist at the same positions from where they are retrieved from.
 * (consider 0th position as even position, and two lists are of same size)
 * input1:{12,1,32,3}
 * input2:{0,12,2,23}
 * output:{0,1,2,3}
*/


package javaProgram_Assignment1;

public class EvenOdd_Retrieve4 {
	public static int[] retrievePosition(int[] a,  int[] b){
		int[] c=new int[a.length];
		int i;
		for(i=0;i<a.length;i++){
			if(i%2==0)
				c[i]=b[i];
			if(i%2!=0)
				c[i]=a[i]; }
		return c;
	}
	public static void main(String[] args) {
		int[] a={12,1,32,3};
		int[] b={0,12,2,23};
		int[] c=retrievePosition(a,b);
		for(int d:c)
			System.out.println(d);
	}
}

	


