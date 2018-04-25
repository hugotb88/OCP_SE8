package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;
import java.util.function.Function;

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
//		System.out.println(map.contains("lion")); // DOES NOT COMPILE
		System.out.println(map.containsKey("lion")); // true
		System.out.println(map.containsValue("lion")); // false
		System.out.println(map.size()); // 3
		
		
		//New API for Maps
		//putIfAbsent Method
		
//		Sometimes you need to update the value for a specific key in the map. There are a few
//		ways that you can do this. The first is to replace the existing value unconditionally:
		
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Jenny", "Tram");
		System.out.println(favorites); // {Jenny=Tram}
		
//		There’s another method, called putIfAbsent(), that you can call if you want to set a
//		value in the map, but this method skips it if the value is already set to a non-null value:
		Map<String, String> favorites2 = new HashMap<>();
		favorites2.put("Jenny", "Bus Tour");
		favorites2.put("Tom", null);
		System.out.println(favorites2);
		favorites2.putIfAbsent("Jenny", "Tram");
		favorites2.putIfAbsent("Sam", "Tram");
		favorites2.putIfAbsent("Tom", "Tram");
		System.out.println(favorites2); // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}
		
		
		//merge Method
		/*
		 The merge() method allows adding logic to the problem of what to choose. Suppose that
		 our guests are indecisive and can’t pick a favorite. They agree that the ride that has the longest
	 	 name must be the most fun 
		 * */
		BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() >
		v2.length() ? v1 : v2;
		Map<String, String> favorites3 = new HashMap<>();
		favorites3.put("Sam", null);
		favorites3.merge("Tom", "Skyride", mapper);
		favorites3.merge("Sam", "Skyride", mapper);
		System.out.println(favorites3); // {Tom=Skyride, Sam=Skyride}
		
		
		//computeIfPresent and computeIfAbsent
//		These two methods are on the upgrade exam but not on the OCP exam. In a nutshell,
//		computeIfPresent() calls the BiFunction if the requested key is found.
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 1);
		BiFunction<String, Integer, Integer> mapper2 = (k, v) -> v + 1;
		Integer jenny = counts.computeIfPresent("Jenny", mapper2);
		Integer sam = counts.computeIfPresent("Sam", mapper2);
		System.out.println(counts); // {Jenny=2}
		System.out.println(jenny); // 2
		System.out.println(sam); // null
		
		//For computeIfAbsent(), the functional interface runs only when the key isn’t present or
		//is null:
		Map<String, Integer> counts3 = new HashMap<>();
		counts3.put("Jenny", 15);
		counts3.put("Tom", null);
		Function<String, Integer> mapper3 = (k) -> 1;
		Integer jenny3 = counts3.computeIfAbsent("Jenny", mapper3); // 15
		Integer sam3 = counts3.computeIfAbsent("Sam", mapper3); // 1
		Integer tom3 = counts3.computeIfAbsent("Tom", mapper3); // 1
		System.out.println(counts3); // {Tom=1, Jenny=15, Sam=1}
	}
}
