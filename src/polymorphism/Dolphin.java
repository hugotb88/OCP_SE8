package polymorphism;

/**
 * @author victor olvera
 * Class Dolphin implements LivesInOcean Interface
 */
public class Dolphin implements LivesInOcean{

	@Override
	public void makeSound() {
		System.out.println("Rare Whistle");
	}
	
}
