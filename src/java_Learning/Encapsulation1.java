package java_Learning;

public class Encapsulation1 {
	// Encapsulation=> wrapping of code and data together into single unit
	// data hiding by getter and setter 
	
    private int age;
    private String name;
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name=name;                  // 'this' keyword represents current class reference i.e. instance variable and
    	                                 // current  reference value of object class
    }
    
    public int getAge() {     // getter
    	return age;
    }
    
    public void setAge(int age) {    // setter
    	this.age=age;
    }

	
	}

