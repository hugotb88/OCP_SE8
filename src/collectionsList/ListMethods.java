package collectionsList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author victor olvera
 * Some of the methods of List interface
 */
public class ListMethods {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		//add - void add(E element)
		list.add("SD"); // [SD]
		
		//add - void add(int index, E element), add element at index and move toward the rest of elements
		list.add(0, "NY"); // [NY,SD]
		
		//set - E set(int index, E e), Replaces element at index and returns original
		list.set(1, "FL"); // [NY,FL]
		
		//remove - void remove(int index), Removes elemnt at index and moves the rest toward the front
		list.remove("NY"); // [FL]
		list.remove(0); // []
		
		///////////
		list.add("OH");
		list.add("CO");
		list.add("NJ");
		
		//Looping through a list
		for (String string: list) {
			System.out.println(string);
		}
		
		//Another way
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			String string = (String) iter.next();
			System.out.println(string);
		}
		
		//get - E get(int index), Returns element at index
		String state = list.get(0); ///OH
		
		//indexOf - int indexOf(Object o), Returns first matching index or -1 if not found
		int index =  list.indexOf("NJ");
		
		
	}
}
