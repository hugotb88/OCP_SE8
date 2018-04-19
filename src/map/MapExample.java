package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author victor olvera
 * 
 * Map Example
 * 
	void clear() 			Removes all keys and values from the map.
	boolean isEmpty() 		Returns whether the map is empty.
	int size() 				Returns the number of entries (key/value pairs) in the map.
	V get(Object key) 		Returns the value mapped by key or null if none is mapped.
	V put(K key, V value)	Adds or replaces key/value pair. Returns previous value or null.
	V remove(Object key) 	Removes and returns value mapped to key. Returns null if none.
	boolean
	containsKey(Object key)	Returns whether key is in map.
	boolean
	containsValue(Object)	Returns value is in map.
	Set<K> keySet() 		Returns set of all keys.
	Collection<V> values() 	Returns Collection of all values.
 * 
 */
public class MapExample {
	public static void main(String[] args) {
		
		//HashMap
		//Java uses the hashCode() of the key to determine the order. The order here happens to
		//not be sorted order, or the order in which we typed the values
		Map<String, String> map = new HashMap<>();
		map.put("koala", "bamboo");
		map.put("lion", "meat");
		map.put("giraffe", "leaf");
		String food = map.get("koala"); // bamboo
		for (String key: map.keySet()) {
			System.out.print(key + ","); // koala,giraffe,lion,	
		}
		
		//TreeMap
		//TreeMap sorts the keys as we would expect. If we were to have called values() instead
		//of keySet(), the order of the values would correspond to the order of the keys.
		Map<String, String> map2 = new TreeMap<>();
		map2.put("koala", "bamboo");
		map2.put("lion", "meat");
		map2.put("giraffe", "leaf");
		String food2 = map2.get("koala"); // bamboo
		for (String key: map2.keySet()) {
			System.out.print(key + ","); // giraffe,koala,lion,
		}
		
		
		//Tricky
		System.out.println(map.contains("lion")); // DOES NOT COMPILE
		System.out.println(map.containsKey("lion")); // true
		System.out.println(map.containsValue("lion")); // false
		System.out.println(map.size()); // 3
		
		
	}
}
