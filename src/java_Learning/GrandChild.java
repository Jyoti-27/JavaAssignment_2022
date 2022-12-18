package java_Learning;

public class GrandChild extends Child{
	
	// multilevel inheritance  (Parent====> Child=====>GrandChild)
	
	public void grandChildMethod() {
		parentDataUpdate();
		super.barking();  // super keyword is using for immediate parent method
	}
	
	

	public static void main(String[] args) {
		GrandChild gc=new GrandChild();
		gc.grandChildMethod();

	}

}

