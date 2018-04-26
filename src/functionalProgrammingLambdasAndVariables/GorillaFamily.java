package functionalProgrammingLambdasAndVariables;

/**
 * @author victor olvera
 * Class using functional interfaces and lambdas
 */
public class GorillaFamily {
	
	//Fields
	String walk = "walk";
	
	//Methods
	void everyonePlay(boolean baby) {
		String approach = "amble";
		//approach = "run";
		
		play(() -> walk); // uses an instance variable in the lambda
		play(() -> baby ? "hitch  ride" : "run"); // uses a method parameter
		play(() -> approach); // Line 10 uses an effectively final local variable
	}
	
	void play(Gorilla g){
		System.out.println(g.move());
	}
	
}
