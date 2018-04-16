package nestedClasses;

/**
 * @author victor olvera
 * Example of MemberInnerClass
 * 
 * A member inner class is defined at the member level of a class (the same level as the methods,
	instance variables, and constructors). Member inner classes have the following properties:
	@ Can be declared public, private, or protected or use default access
	@ Can extend any class and implement interfaces
	@ Can be abstract or final
	@ Cannot declare static fields or methods
	@ Can access members of the outer class including private members

 */
public class MemberInnerClasss {
	
	//Fields
	private String greeting = "Hi";
	
	//Declaration of inner class
	protected class Inner {
		//Fields
		public int repeat = 3;
		
		//Methods
		public void go() {
			for (int i = 0; i < repeat; i++) {
				System.out.println(greeting); //using and element of outer class "MEmberInnerClass"
			}
		}
	}
	
	//Methods of outer class
	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}
	
	
	//main method
	public static void main(String[] args) {
		MemberInnerClasss outer = new MemberInnerClasss();
		outer.callInner();
	}
	
}
