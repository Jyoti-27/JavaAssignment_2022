
/* Program_14

* 1.Given two integer arrays. merge the common elements into a new array. find the sum of the elements
* input1:{1,2,3,4}
* input2:{3,4,5,6}
* logic:{3,4}
* output:7      */




package assignment1_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Program_14 {
	public static int mergeArray(int a[],int b[]){
        List l1 = new ArrayList();
        List l2 = new ArrayList();
        int i,d = 0;
        for(i = 0;i<a.length;i++)
              l1.add(a[i]);
        for(i = 0;i<b.length;i++)
              l2.add(b[i]);
        l1.retainAll(l2);
        for(i = 0;i<l1.size();i++)
              d += (Integer) l1.get(i);
        return d;
  }
	
	public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {3,4,5,6};
        System.out.println(mergeArray(a,b));
  }
}

