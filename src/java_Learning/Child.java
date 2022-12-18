package java_Learning;

public class Child extends Parent {
	
	// inheritance
	
	public void parentDataUpdate() {
		height=10;
		Type="Dog";
		weight=65;
		display();
		barking();
	
		
	}
	
	public void barking() {
	System.out.println("Dog is Barking");
	}

	

	public static void main(String[] args) {
	
	    sleeping();
	    eating();
	    Child child=new Child();
	    child.parentDataUpdate();
	    

	}

}


