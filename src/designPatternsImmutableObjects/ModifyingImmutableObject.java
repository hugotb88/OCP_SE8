package designPatternsImmutableObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author victor olvera 
 * 		   How do we modify immutable objects if they are
 *         inherently unmodifiable? The answer is, we can’t! Alternatively, we
 *         can create new immutable objects that contain all of the same
 *         information as the original object plus whatever we wanted to change.
 */
public class ModifyingImmutableObject {
	public static void main(String[] args) {
		// Create a new AnimalFixed instance
		AnimalFixed lion = new AnimalFixed("lion", 5, Arrays.asList("meat", "more meat"));
		// Create a new AnimalFixed instance using data from the first instance
		List<String> favoriteFoods = new ArrayList<String>();
		for (int i = 0; i < lion.getFavoriteFoodsCount(); i++) {
			favoriteFoods.add(lion.getFavoriteFood(i));
		}
		AnimalFixed updatedLion = new AnimalFixed(lion.getSpecies(), lion.getAge() + 1, favoriteFoods);
	}
}
