package designPrinciplesEncapsulation;

/**
 * @author victor olvera
 * Example of Encapsulation
 * Encapsulation is the idea of combining fi elds and methods in
a class such that the methods operate on the data, as opposed to the users of the class
accessing the fi elds directly. 

  imagine that we are designing a new Animal class, and we have the following
	design requirements:
 	* Each animal has a non null , non empty species field
 	* Each animal has an age field that is greater than or equal to zero 
 * 
 */
public class Animal {
	
	//Fields without encapulation
	public String species;
	public int age;
	
	
	public static void main(String[] args) {
		//Example 1, we are broking the two variables, 
		//species is null and age is -100
		Animal a = new Animal();
		a.age = -100;
	}
	
}
