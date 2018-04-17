package nestedClasses;

/**
 * @author victor olvera
 *	A static nested class is a static
class defined at the member level. It can be instantiated without an object of the
enclosing class, so it can’t access the instance variables without an explicit object of
the enclosing class. For example, new OuterClass().var allows access to the instance
variable var.

**Also, you can import it from another package
 */
public class StaticNestedClass {
	
	//Nested class
	static class Nested{
		//Field of Nested
		private int price = 6;
	}
	
	public static void main(String[] args) {
		Nested nested = new Nested();
		System.out.println(nested.price);
	}
	
}
