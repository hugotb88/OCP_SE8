package designPrinciplesEncapsulation;

/**
 * @author victor olvera
 * Class Animal with Encapsulation
 */
public class AnimalWithFix {
	
	//Fields
	private String species;
	private int age;
	
	//Constructor
	public AnimalWithFix(String species) {
		this.species = species;
	}
	
	//Methods
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		if(species == null || species.trim().length()==0) {
			throw new IllegalArgumentException("Species is required");
		}
		this.species = species;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age<0) {
			throw new IllegalArgumentException("Age can't be a negative number");
		}
		this.age = age;
	}
	
}
