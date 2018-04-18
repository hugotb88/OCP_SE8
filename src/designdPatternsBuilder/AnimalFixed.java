package designdPatternsBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author victor olvera Class AnimalFixed with fixes to make it immutable
 */
public class AnimalFixed{
	
	//Fields
	private final String species;
	private final int age;
	private final List<String> favoriteFoods;

	//Constructor
	public AnimalFixed(String species, int age, List<String> favoriteFoods) {
		this.species = species;
		this.age = age;
		if(favoriteFoods == null) {
			throw new RuntimeException("favoriteFoods is required");
		}
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
	}
	
	//Methods
	public String getSpecies() {
		return species;
	}

	public int getAge() {
		return age;
	}

	public int getFavoriteFoodsCount() {
		return favoriteFoods.size();
	}

	public String getFavoriteFood(int index) {
		return favoriteFoods.get(index);
	}
}
