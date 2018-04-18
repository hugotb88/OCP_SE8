package genericsBounds;

import java.util.ArrayList;

/**
 * @author victor olvera
 * {@link UpperBoundedWildcards} Fixed
 */
public class UpperBoundedWildcardsFixed {
	public static void main(String[] args) {
		
		//The upper-bounded wildcard says that any class that extends Number or Number itself
		//can be used as the formal parameter type
		ArrayList<? extends Number> list = new ArrayList<Integer>();
		
		
	}
}
