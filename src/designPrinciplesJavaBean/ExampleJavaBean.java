package designPrinciplesJavaBean;

/**
 * @author victor olvera
 * Example of Java Bean with it's rukes
 */
public class ExampleJavaBean {
	
	//Rule: Properties are private
	//Fields
	private int age;
	private int numChildren;
	
	//Rule: Getter for non-boolean properties begins with get
	//Methods
	public int getAge() {
		return age;
	}
	
	//Rule: Getters for boolean properties may begin with is or get
	public boolean isBird() {
		return true; //true For Example purposes
	}
	
	public boolean getBird() {
		return true; //true for example purposes
	}
	
	//Rule: Setter methods begin with "set"
	public void setAge(int age) {
		this.age = age;
	}
	
	//Rule: The method name must have a prefix of set/get/is followed by the first letter of the
	//property in uppercase and followed by the rest of the property name.
	public void setNumChildren(int numChildren) {
		this.numChildren = numChildren;
	}
	
}
