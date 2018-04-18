package functionalProgrammingWithLambdasPredicate;

/**
 * @author victor olvera
 *
 */
public class Animal {
	
	//Fields
	private String species;
	private boolean canHop;
	private boolean canSwim;

	//Constructor
	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}

	//Methods
	public boolean canHop() {
		return canHop;
	}

	public boolean canSwim() {
		return canSwim;
	}

	public String toString() {
		return species;
	}
}
