package interfaces;

/**
 * @author victor olvera
 * Example of a normal interfacce
 */
public interface InterfaceA {
	//The class that implements this interface doesn't need to declare the exception
	//When overrides this method
	public int getWingSpan() throws Exception; 
	
	//This static final variable will be accessible without an instance of the interface
	public static final int MAX_SPEED = 100;
	
	//It's a default method, could been optionally overriden in the class that implements the interface
	public default void land() {
		System.out.println("Animal is landing");
	}
	
	//This method is static, and is available without an instance of the interface
	public static double calculateSpeed(float distance, double time) {
		return distance/time;
	}
	
}
