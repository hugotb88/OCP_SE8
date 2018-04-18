package functionalProgrammingWithLambdasPredicate;

/**
 * @author victor olvera . 
 * The following simple program uses a lambda expression
 * to determine if some sample animals match the specified criteria:
 */
public class FindMatchingAnimals {
	
	//Method 
	private static void print(Animal animal, Predicate<Animal> trait) { //Predicate
		if(trait.test(animal)) {
			System.out.println(animal);
		}
	 }
	
	public static void main(String[] args) {
		print(new Animal("fish", false, true), a -> a.canHop());
		print(new Animal("kangaroo", true, false), a -> a.canHop());
	}
}
