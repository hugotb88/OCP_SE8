package java8_loopingThroughCollections;

import java.util.Arrays;
import java.util.List;

/**
 * @author victor olvera Looping in Collections using Lambdas and Method
 *         References
 * 
 *         There are a few ways to do this. We could use an iterator, the
 *         enhanced for loop, or a number of other approaches—or we could use a
 *         Java 8 lambda.
 * 
 */
public class ExampleOfLooping {
	public static void main(String[] args) {
		List<String> cats = Arrays.asList("Annie", "Ripley");
		
		//This could be work
		for (String cat : cats) {
			System.out.println(cat);
		}
		
		//Another way is
		cats.forEach(c -> System.out.println(c));
		
		//And the another way is
		cats.forEach(System.out::println);

			
	}
}
