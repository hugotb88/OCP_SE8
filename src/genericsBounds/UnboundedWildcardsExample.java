package genericsBounds;

import java.util.ArrayList;
import java.util.List;

/**
 * @author victor olvera Example of generics
 */
public class UnboundedWildcardsExample {
	
	//Methods
	public static void printList(List<Object> list) {
		for (Object x : list)
			System.out.println(x);
	}

//	First part, doesn't compile
	public static void main(String[] args) {
		List<String> keywords = new ArrayList<>();
		keywords.add("java");
		printList(keywords); // DOES NOT COMPILE
	}
	
	/* 
 	Wait. What’s wrong? A String is a subclass of an Object. This is true. However,
	List<String> cannot be assigned to List<Object>. We know; it doesn’t sound logical. Java
	is trying to protect us from ourselves with this one. 
	 */
	
}
