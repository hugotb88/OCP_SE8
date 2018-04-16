package virtualMethodInvocation;

/**
 * @author victor olvera
 * Java look for the appropiate animal to feed
 */
public class PlayWithAnimal {
	public static void main(String... args) {
		Animal animal = new Lion();
		animal.careFor();
	}
}
