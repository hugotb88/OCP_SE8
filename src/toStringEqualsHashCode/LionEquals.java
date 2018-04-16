package toStringEqualsHashCode;

/**
 * @author victor olvera 
 * 			Remember that Java uses == to compare primitives and
 *         for checking if two variables refer to the same object. Checking if
 *         two objects are equivalent uses the equals() method
 *         
 *         Contract of equals:
 *         The equals() method implements an equivalence relation on non null object references:
 *         *It is reflexive: For any non null reference value x, x.equals(x) should return true.
 *         *It is symmetric: For any non null reference values x and y, x.equals(y) should return
 *         true if and only if y.equals(x) returns true.
 *         *It is transitive: For any non null reference values x, y, and z, if x.equals(y) returns
 *         true and y.equals(z) returns true, then x.equals(z) should return true.
 *         *It is consistent: For any non null reference values x and y, multiple invocations of
 *         x.equals(y) consistently return true or consistently return false, provided no
 *         information used in equals comparisons on the objects is modified.
 *         *For any non null reference value x, x.equals(null) should return false
 *         
 *         **If you overrride equals, is expected you also overrides hashcode
 */
public class LionEquals {

	// Attributes
	private int idNumber;
	private int age;
	private String name;

	// Constructor
	public LionEquals(int idNumber, int age, String name) {
		this.idNumber = idNumber;
		this.age = age;
		this.name = name;
	}

	
	//We are overriding equals checking by idNumber also
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof LionEquals)) {
			return false;
		}
		LionEquals otherLion = (LionEquals) obj;
		return this.idNumber == otherLion.idNumber;
	}

}
