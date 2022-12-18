package java_Learning;

public class ClassImplementingAbstract extends InterFaceUtilisingClass {

	public static void main(String[] args) {
		ClassImplementingAbstract obj=new ClassImplementingAbstract();
		obj.test();
		obj.test1();
		obj.test2();
		obj.test4();
		

	}

	@Override
	public void test4() {
		System.out.println("Test4 is implemented");
		
	}

}


