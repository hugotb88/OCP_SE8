package genericsBounds;

import java.util.ArrayList;
import java.util.List;

/**
 * @author victor olvera Example Fixed Adding Bounds we cannot assign a
 *         List<String> to a List<Object>. That’s fine; we don’t really need a
 *         List<Object>. What we really need is a List of “whatever.” That’s
 *         what List<?> is
 * 
 */
public class UnboundedWildcardsExampleFixed {

	// Methods
	public static void printList(List<?> list) {
		for (Object x : list) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		List<String> keywords = new ArrayList<>();
		keywords.add("java");
		printList(keywords);
	}
	
	
	/*
	printList() takes any type of list as a parameter. keywords is of type List<String>.
	We have a match! List<String> is a list of anything. “Anything” just happens to be a
	String here
	 */
}
