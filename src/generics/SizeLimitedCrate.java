package generics;

/**
 * @author victor olvera
 * Another Generic Class with two parameters, T represents the type that we are putting in the crate. 
 U represents the unit that we are
using to measure the maximum size for the crate
 */
public class SizeLimitedCrate<T,U> {
	
	//Fields
	private T contents;
	private U sizeLimit;
	
	//Constructor
	public SizeLimitedCrate(T contents, U sizeLimit) {
		this.contents = contents;
		this.sizeLimit = sizeLimit;
	}
	
}
