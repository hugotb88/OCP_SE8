package collectionsBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author victor olvera
 * Example of Array and ArrayList
 */
public class ArrayAndArrayList {
	public static void main(String[] args) {
		
		//ArrayList
		List<String> list = new ArrayList<String>();
		list.add("Fluffy"); //["Fluffy"]
		list.add("Webby");  //["Fluffy","Webby"]
		
		//Array
		String[] array = new String[list.size()]; //Empty array
		array[0] = list.get(1); // [Webby]
		array[1] = list.get(0); // [Webby, Fluffy]
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "-");
		}
		
		//Searching and Sorting
		int[] numbers = {6,9,1,8};
		Arrays.sort(numbers); // [1,6,8,9]
		System.out.println(Arrays.binarySearch(numbers, 6)); // 1
		System.out.println(Arrays.binarySearch(numbers, 3)); // -2
		
		List<Integer> list2 = Arrays.asList(9,7,5,3);
		Collections.sort(list2); // [3, 5, 7, 9]
		System.out.println(Collections.binarySearch(list2, 3)); // 0
		System.out.println(Collections.binarySearch(list2, 2)); // -1 
		
		
		
		
	}
}
