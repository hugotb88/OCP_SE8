package designPatternsSingleton;


/**
 * @author victor olvera
 * Another way to create a Singleton is using an static block of code
 * This class and our previous HayStorage class instantiate the singleton
at the time the class is loaded. Unlike the HayStorage class, though, the AnotherSingleton class
instantiates the singleton as part of a static initialization block
 */
public class AnotherSingleton {
	
	//Field
	private static final AnotherSingleton instance;
	
	//static block of code
	static {
		instance =  new AnotherSingleton();
		//Additional Steps
	}
	
	//Constructor
	private AnotherSingleton() {}
	
	//Methods
	public static AnotherSingleton getInstance() {
		return instance;
	}
	
	//Data access methods
	//...
	
}
