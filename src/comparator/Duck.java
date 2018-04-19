package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

/**
 * @author victor olvera
 * Example of interface Comparator
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
		
		Comparator<Duck> byWeight= new Comparator<Duck>() {
			public int compare(Duck d1, Duck d2) {
				return d1.getWeight()-d2.getWeight();
			}
		};
		
		
		List<Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("Quack",7));
		ducks.add(new Duck("Puddles",100));
		ducks.add(new Duck("Donald",30));
		Collections.sort(ducks); 	//Sort by name
		System.out.println(ducks);	//[Donald, Puddles, Quack]
		
		//Applying Comparator
		Collections.sort(ducks, byWeight);//[Quack, Donald, Puddles]
		System.out.println(ducks);
		
		/* 
		 	Comparator is a functional interface since there is only one abstract method to implement.
			This means that we can rewrite the comparator in the previous example as any of the
			following:
			
			Comparator<Duck> byWeight = (d1, d2) -> d1.getWeight()—d2.getWeight();
			Comparator<Duck> byWeight = (Duck d1, Duck d2) -> d1.getWeight()—d2.getWeight();
			Comparator<Duck> byWeight = (d1, d2) -> { return d1.getWeight()—d2.getWeight(); };
			Comparator<Duck> byWeight = (Duck d1, Duck d2) -> {return d1.getWeight()—d2.getWeight(); };
 
		  */
		
		
	}
	
	
}
