package functionalProgrammingWithLambdas;

/**
 * @author victor olvera . 
 * The following simple program uses a lambda expression
 * to determine if some sample animals match the specified criteria:
 */
public class FindMatchingAnimals {
	
	//Method 
	private static void print(Animal animal, CheckTrait trait) {
		if(trait.test(animal)) {
			System.out.println(animal);
		}
	}
	
	public static void main(String[] args) {
		print(new Animal("Fish", false,true),a -> a.canHop());
		print(new Animal("Kangaroo", true,false),a -> a.canHop()); //Kangaroo
	}
}
