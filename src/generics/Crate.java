package generics;

/**
 * @author victor olvera
 * Generic class Crate
 * 
 * You can introduce generics into your own classes. The syntax for introducing a generic is to
declare a formal type parameter in angle brackets. For example, the following class named
Crate has a generic type variable declared after the name of the class

The generic type T is available anywhere within the Crate class. When you instantiate
the class, you tell the compiler what T should be for that particular instance.

A type parameter can be named anything you want. The convention is to use single
uppercase letters to make it obvious that they aren’t real class names. The following are
common letters to use:
** E for an element
** K for a map key
** V for a map value
** N for a number
** T for a generic data type
** S, U, V, and so forth for multiple generic types

 */
public class Crate<T> {
	
	//Fields
	private T contents;
	
	//Methods
	public T emptyCrate() {
		return contents;
	}
	
	public void packCrate(T contents) {
		this.contents = contents;
	}
	
}
