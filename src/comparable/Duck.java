package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author victor olvera
 * Example of interface Comparable
 */
public class Duck implements Comparable<Duck>{
	
	//Fields
	private String name;
	
	//Constructor
	public Duck(String name) {
		this.name = name;
	}
	
	//Methods //Use readable output
	public String toString() {
		return name;
	}
	
	public int compareTo(Duck d) {
		return name.compareTo(d.name); //Call String's compareTo
	}
	
	//Main 
	public static void main(String[] args) {
		List<Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("Quack"));
		ducks.add(new Duck("Puddles"));
		ducks.add(new Duck("Donald"));
		Collections.sort(ducks); 	//Sort by name
		System.out.println(ducks);	//[Puddles, Quack]
	}
	
	/*Since Duck is comparing objects of type
		String and the String class already has a compareTo() method, it can just delegate
	*/
	
}
