package java_Learning;

public class AccessModifierDemo2 {
	
	

	 // private,default,public,protected
   // class,variable,methods,constructor
   // level of access
	
	//private static int a=20;
	//public static int b=15;
	

		private static int a=20;
		
		//public static int b=15;
		
		static int b=25;  //default modifier
		
		protected static int j=50;
		
		public static int k=100;
		
		
		private void addition(int a1, int b) {
			int sum=a1+b;
			System.out.println("Value of Sum:-"+sum);
			System.out.println(a);
			
		}
		
		void subtraction(int c,int d) {
			int x=c-d;
			System.out.println("Subtraction:"+x);
		
		}
		
		protected void multiplication(int a,int b) {
			int y=a*b;
			System.out.println("Multiplication:"+y);
		
		}
		
		public void division(int a,int b) {
			int y=a/b;
			System.out.println("Division:"+y);
		
		}
		public static void main(String[] args) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(j);
			System.out.println(k);
			
		
			

	}

}


