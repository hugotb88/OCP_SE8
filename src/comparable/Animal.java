package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author victor olvera
 * This class uses a custom compareTo, the another one Duck, uses of the String 
 * For example, if we want to sort our animals in the zoo by their id
 */
public class Animal implements Comparable<Animal>{
	
	//Fields
	private int id;
	
	//Constructor
	public Animal(int id) {
		this.id = id;
	}
	
	//Methods
	public String toString() {
		return Integer.toString(id);
	}
	
	
	@Override
	public int compareTo(Animal a) {
		return id - a.id;
	}
	
	//Main
	public static void main(String[] args) {
		Animal a1 = new Animal(5);
		Animal a2 = new Animal(7
				);
		
		List<Animal> animals = new ArrayList<>();
		animals.add(a1);
		animals.add(a2);
		
		//Before we sort, we can check which value returns compareTo
		System.out.println(a1.compareTo(a2)); //-2	-	First rule, compares a smaller id to a large one and get negative value
		System.out.println(a1.compareTo(a1)); // 0	-	Second  rule, id's are the same
		System.out.println(a2.compareTo(a1)); // 2	-	Third rule, compares a higher id to a smaller one and gets positive
		
		Collections.sort(animals); //uses compareTo
		System.out.println(animals); //2,5
		
		
	}
	
}
