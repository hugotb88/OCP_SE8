package instanceOf;

public class ParentClass extends SuperParentClass {
	public static void main(String[] args) {
		
		SuperParentClass hippo =  new ParentClass();
		boolean b1 = hippo instanceof ParentClass;      //true
		boolean b2 = hippo instanceof SuperParentClass; //true
		boolean b3 = hippo instanceof ChildClass;		//false
		
		SuperParentClass hippo2 = new ParentClass();
		boolean b4 = hippo2 instanceof Object; //true
		hippo2 = null;
		boolean b5 = hippo2 instanceof Object; //false
		
		ParentClass hippo3 = new ParentClass();
		boolean b6 = hippo3 instanceof ChildClass; //Does not compile
		
	}
}
