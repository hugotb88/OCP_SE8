package functionalProgramming;

/**
 * @author victor olvera
 * example of Functional Interface
 * Check the Annotation
 */

@FunctionalInterface
public interface FunctionalInterfaceExample {
	public void sprint(Animal animal);
	
	
} 

/* Examples of Functional interfaces also*/
/*
 
public interface SprintFaster extends Sprint {

public void sprint(Animal animal);
}

public interface Skip extends Sprint {
 public default int getHopCount(Kangaroo kangaroo) {return 10;}
 public static void skip(int speed) {}
} 

 */