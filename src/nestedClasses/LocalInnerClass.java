package nestedClasses;

/**
 * @author victor olvera
 * Class inside of method
 *  The compiler is generating a class fi le from your
inner class. A separate class has no way to refer to local variables. If the local variable is final ,
Java can handle it by passing it to the constructor of the inner class or by storing it in the class
file. 
 */
public class LocalInnerClass {
	
	//Fields
	private int length = 5;
	
	//Constructor
	
	//Methods
	public void calculate() {
		final int width = 10;
		
		//Declaration of local inner class
		class Inner{
			//Method of inner class
			public void multiply() {
				System.out.println(length * width);
			}
		}
		
		Inner inner = new Inner();
		inner.multiply();
	}
	
	
	//Main 
	public static void main(String[] args) {
		LocalInnerClass outer = new LocalInnerClass();
		outer.calculate();
	}
	
}
