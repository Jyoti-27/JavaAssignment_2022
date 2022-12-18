
/* Program_22
 
 * An array of integers is given.The given element is removed new array is returned.
 * input1:{10,10,20,30,76}
 * output: {20,20,76}(10 is asked to remove)   */






package assignment1_2022;

import java.util.ArrayList;
import java.util.List;

public class Program_22 {

	 public static int[] removalOfGivenElementFromArray(int[] a,int c){
         List l1 = new ArrayList();
         for(int i = 0;i < a.length;i++)
               if(a[i] != c)
                     l1.add(a[i]);
         int b[] = new int[l1.size()];
         for(int i = 0;i < b.length;i++)
               b[i] = (int) l1.get(i);
         return b;
   }
   public static void main(String[] args) {
         int a[] = {10,10,20,30,76};
         int c = 10;
         int[] b = removalOfGivenElementFromArray(a,c);
   for(int d:b)
         System.out.println(d);
   }
}


