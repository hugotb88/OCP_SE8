package polymorphism;

/**
 * @author victor olvera
 * Class that uses instances of Dolphin and Whale
 */
public class Oceanographer {
	
	//Methods
	public void checkSounud(LivesInOcean animal) {
		animal.makeSound();
	}
	
	
	public static void main(String[] args) {
		Oceanographer o = new Oceanographer();
		o.checkSounud(new Dolphin());
		o.checkSounud(new Whale());
	}
}


/*

Polymorphism also allows one object to take on many different forms. As you may
remember from studying for the OCA exam, a Java object may be accessed using a
reference with the same type as the object, a reference that is a superclass of the object, or
a reference that defines an interface that the object implements, either directly or through
a superclass. Furthermore, a cast is not required if the object is being reassigned to a
supertype or interface of the object.

*/