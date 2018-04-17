package differencceObjectReference;

/**
 * @author victor olvera
 *
 */
public class Lemur extends Primate implements HasTail {

	// Fields
	public int age = 18;

	// Contructors

	// Methods
	@Override
	public boolean isTailStriped() {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) {
		//Example 1, Lemur, primate and Hastail have access to lemur properties in memory, 
		//but each one see different attributes
		
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		HasTail hasTail = lemur; //This "rifa"cause hasTail is an Interface
		System.out.println(hasTail.isTailStriped());
		Primate primate = lemur;
		System.out.println(primate.hasHair());
		
		//Example 2
//		Lemur lemur2 = primate; // DOES NOT COMPILE
		Lemur lemur3 = (Lemur)primate;

	}

}
