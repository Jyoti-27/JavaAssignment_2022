package java_Learning;

public class JavaMethodsDemo1 {
	
	// public-Access Modifier; void-Return type-doesn't return anything
	
	public int Addition(int a, int b)  //  doesn't get return type  // method header,signature
	// public void Addition(int a, int b)  // getting return type
	
	{
     int c =  a +  b;
     return c;
     
   }


	public static void main(String[] args) {
		
		// Block of code
		JavaMethodsDemo1 obj=new JavaMethodsDemo1();
		
		int sum=obj.Addition(10,20);
		System.out.println(sum);

      }

}

