package OverloadAndOverride;

/**
 * @author victor olvera
 * Child class with attributes and methods
 */
public class ChildClass extends ParentClass{
	
	//Attributes
	public String extraAttribute;
	
	
	//Methods
	@Override
	public void getDefaultName() {
		System.out.println("This is the getDefaultName method in Child");
	}
	
	//Overload
	public void getDefaultMessage() {
		System.out.println("This is the default Message");
	}
	
	public String getDefaultMessage(String message) {
		return "This is the second default Message: " + message;
	}
	
	public Integer geteDefaultMessage(String message) {
		return 1;
	}
}
