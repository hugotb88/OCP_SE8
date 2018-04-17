package interfaces;

/**
 * @author victor olvera
 * 
 */
public class ClassA implements InterfaceA {

	@Override
	public int getWingSpan() throws Exception {
		return 15;
	}
	
	public void land() {
		System.out.println("Override of the default method");
	}

}
