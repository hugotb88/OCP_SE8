package abstractClassExample;

/**
 * @author victor olvera
 * Abstract Class example
 */
public abstract class BaseClass {
	//i could leave blank and  it compiles
	
	//or i could declare an abstract method
	abstract void clean();
	
	//or i can declare the method without the abstract keyword but with implementation
	void cleaner() {}
}
