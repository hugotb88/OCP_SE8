package designdPatternsBuilder;

import java.util.List;


/**
 * @author victor olvera
 * Example of Builder thats uses AnimalFixed immutable Class
 *  all of the setter methods return an instance
of the builder object this
 */
public class AnimalBuilder {
	
	//Fields
	private String species;
	private int age;
	private List<String> favoriteFoods;
	
	//Constructor
	public AnimalBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	
	//Methods
	public AnimalBuilder setSpecies(String species) {
		this.species = species;
		return this;
	}
	
	public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {
		this.favoriteFoods = favoriteFoods;
		return this;
	}
	
	public AnimalFixed build() {
		 return new AnimalFixed(species,age,favoriteFoods);
	}
	
	//Example of use
	/* AnimalBuilder duckBuilder = new AnimalBuilder();
	duckBuilder
	 .setAge(4)
	 .setFavoriteFoods(Arrays.asList("grass","fish")).setSpecies("duck");
	Animal duck = duckBuilder.build(); */
	
}
