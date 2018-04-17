package polymorphism;

/**
 * @author victor olvera
 * Class Whale implements LiveInOcean interface
 */
public class Whale implements LivesInOcean{

	@Override
	public void makeSound() {
		System.out.println("Rare sing ");
	}
	
}
