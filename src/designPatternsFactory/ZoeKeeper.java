package designPatternsFactory;

/**
 * @author victor olvera
 * Class that uses the Factory
 */
public class ZoeKeeper {
	public static void main(String[] args) {
		final Food food =  FoodFactory.getFood("polar bear");
		food.consumed();
	}
	
}


/*

Depending on the value of animalName, we return different types of food for use in our
factory. The factory pattern gives us a number of features. First of all, different animals
can share the same food, such as goat and rabbit both eating pellets but with varying
quantities. Next, notice in our ZooKeeper method that we don’t care about the particular
type of food that we get, as long as it implements the Food interface. This loose coupling
of ZooKeeper and Food allows us to change the rules in the FoodFactory at a later date
without requiring any code changes to our ZooKeeper class. Of course, the developer could
cast the object to a particular subclass of Food after it is returned from the FoodFactory,
although that practice is generally discouraged when using a factory pattern as it creates a
tightly coupled solution.

*/


