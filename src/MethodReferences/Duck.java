package MethodReferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

/**
 * @author victor olvera
 * Class used for Method References example
 */
public class Duck implements Comparable<Duck>{
	
	//Fields
	private String name;
	private int weight;
	
	//Constructor
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	//Methods 
	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public int compareTo(Duck d) {
		return name.compareTo(d.name); //Call String's compareTo
	}
	
	//Main 
	public static void main(String[] args) {
		/*
		 * 	The Duck class itself can define compareTo() in only one way. In this case, name was
			chosen. If we want to sort by something else, we have to define that sort order outside the
			compareTo() method
		 * 
		 */
		
		//Using Lambdas
		Comparator<Duck> byWeight = (d1, d2) -> DuckHelper.compareByWeight(d1, d2); 
		
		/*
		 *  Not bad. There’s a bit of redundancy, though. The lambda takes two parameters and
			does nothing but pass those parameters to another method. Java 8 lets us remove that
			redundancy and simply write this: 
		 */
		
		 Comparator<Duck> byWeight2 = DuckHelper::compareByWeight; 
		 
		 /* The :: operator tells Java to pass the parameters automatically into compareByWeight */
		
		
		List<Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("Quack",7));
		ducks.add(new Duck("Puddles",100));
		ducks.add(new Duck("Donald",30));
		Collections.sort(ducks); 	//Sort by name
		System.out.println(ducks);	//[Donald, Puddles, Quack]
		
		//Applying Comparator
		Collections.sort(ducks, byWeight2);//[Quack, Donald, Puddles]
		System.out.println(ducks);
		
		
		
	}
	
	
}
