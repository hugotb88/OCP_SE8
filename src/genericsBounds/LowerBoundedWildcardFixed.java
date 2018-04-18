package genericsBounds;

import java.util.ArrayList;
import java.util.List;

/**
 * @author victor olvera
 * Wrong LowerBoundedWildcard
 */
public class LowerBoundedWildcardFixed {
	public static void addSound(List<? super String> list) { // lower bound
		list.add("quack");
	}
	
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		strings.add("tweet");
		List<Object> objects = new ArrayList<Object>(strings);
		addSound(strings);
		addSound(objects);
	}
	
	/*
		With a lower bound, we are telling Java that the list will be a list of String objects or a
		list of some objects that are a superclass of String. Either way, it is safe to add a String to
		that list.
		Just like generic classes, you probably won’t use this in your code unless you are writing
		code for others to reuse. Even then it would be rare. But it’s on the exam, so now is the time
		to learn it! 
	 */
}
