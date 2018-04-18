package genericsBounds;

import java.util.ArrayList;

/**
 * @author victor olvera
 * Let’s try to write a method that adds up the total of a list of numbers. We’ve established
that a generic type can’t just use a subclass
 */
public class UpperBoundedWildcards {
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<Integer>(); //DOESN'T COMPILE
	}
}
