package java8_updateAllElements;

import java.util.Arrays;
import java.util.List;

/**
 * @author victor olvera
 *
 *         Another new method introduced on Lists is replaceAll. Java 8 lets you
 *         pass a lambda expression and have it applied to each element in the
 *         list. The result replaces the current value of that element.
 *
 * 			void replaceAll(UnaryOperator<E> o)
 * 
 * 			It uses a UnaryOperator, which takes one parameter and returns a value of the same type
 */
public class ReplaceAllExample {
	public static void main(String[] args) {
			
			List<Integer> list = Arrays.asList(1, 2, 3);
			list.replaceAll(x -> x*2);
			System.out.println(list); // [2, 4, 6]
			
			//The lambda uses deferred execution to increase the value of each element in the list.
	}
}
