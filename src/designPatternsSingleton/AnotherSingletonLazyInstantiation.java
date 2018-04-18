package designPatternsSingleton;

/**
 * @author victor olvera
 * Another technique to create Singleton
 * The AnotherSingletonLazyInstantiation class, though, does not create the singleton object
when the class is loaded but rather the first time it is requested by a client. Creating
a reusable object the first time it is requested is a software design pattern known as
lazy instantiation
 */
public class AnotherSingletonLazyInstantiation {
	
	//Field
	private static AnotherSingletonLazyInstantiation instance;
	
	//Constructor
	private AnotherSingletonLazyInstantiation() {}
	
	//Methods
	public static AnotherSingletonLazyInstantiation getInstance() {
		if(instance == null) { 
			instance = new AnotherSingletonLazyInstantiation(); //Not thread safe, the method should be synchronized
		}
		return instance;
	}
	
	//Data access methods
	//...
	
	
	/*
	 Thread safety is the property of an object that guarantees safe execution by multiple
		threads at the same time. 
	 */
}
