package designPatternsImmutableObjects;

import java.util.ArrayList;
import java.util.List;

/**
 * @author victor olvera
 * Example,this class is mmutable because the last method
 * The simplest solution is to mark the class or methods with the final modifier,
although this does limit the usage of the class. Another option is to make the constructor
private and apply the factory pattern, which we will discuss later in this
chapter
 */
public class Animal {
	
	//Fields
	private final List<String> favoriteFoods;
	
	//Constructor
	public Animal(List<String> favoriteFoods) {
		if(favoriteFoods == null) {
			throw new RuntimeException("favoriteFoods is required");
		}
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
	}
	
	//Methods
	public List<String> getFavoriteFoods(){ //THIS MAKES THE CLASS MUTABLE!
		return favoriteFoods;
	}
}
