package genericsBounds;

import java.util.ArrayList;
import java.util.List;

/**
 * @author victor olvera
 * Wrong LowerBoundedWildcard
 */
public class LowerBoundedWildcard {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		strings.add("tweet");
		List<Object> objects = new ArrayList<Object>(strings);
		addSound(strings);
		addSound(objects);
		
		/*
		 * The problem is that we want to pass a List<String> and a List<Object> to the same method
		 */
	}
}
