package java8_removingConditionally;

import java.util.ArrayList;
import java.util.List;

/**
 * @author victor olvera
 *
 * Collection using the new method "removeIf"
 * 
 * boolean removeIf(Predicate<? super E> filter)  
 */
public class RemoveIfExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Magician");
		list.add("Assistant");
		System.out.println(list); // [Magician, Assistant]
		list.removeIf(s -> s.startsWith("A")); // <--- Here
		System.out.println(list); // [Magician]
	}
}
