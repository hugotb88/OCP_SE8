package collectionsSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author victor olvera
 * Class with some Set interface methos
 */
public class SetMethods {
	
	public static void main(String[] args) {
		
		//HashSet
		Set<Integer> set =  new HashSet<>();
		boolean b1 =  set.add(66); //true
		boolean b2 =  set.add(10); //true
		boolean b3 =  set.add(66); //false
		boolean b4 =  set.add(8); //true
		
		for(Integer integer : set ) {
			System.out.println(integer + ", "); //66,10,8
		}
		
		
		//TreeSet
		Set<Integer> set2 = new TreeSet<>();
		boolean b5 = set2.add(66); //true
		boolean b6 = set2.add(10); //true
		boolean b7 = set2.add(66); //false
		boolean b8 = set2.add(8); //true 
		
		for (Integer integer : set2) {
			System.out.println(integer + ", "); //8,10,66
		}
		
		
	}
}
