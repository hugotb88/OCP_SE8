package functionalInterfaces_ConsumerBiCosumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author victor olvera
 * Example of Functional Interface "Suplier" implementation
 */
public class ConsumerExample {
	public static void main(String[] args) {
		
		//Consumer
		 Consumer<String> c1 = System.out::println;
		 Consumer<String> c2 = x -> System.out.println(x);
		 
		 c1.accept("Annie");
		 c2.accept("Annie");
		 
//		 This example prints Annie twice. You might notice that the Consumer examples used the
//		 method reference System.out::println . That’s OK. Java uses the context of the lambda to
//		 determine which overloaded println() method it should call. 
		 
		 //BiConsumer
		 HashMap<String,Integer> map = new HashMap<>();
		 BiConsumer<String,Integer> b1 = map::put;
		 BiConsumer<String,Integer> b2 = (x,y) -> map.put(x, y);
		 
		 b1.accept("Victor", 10);
		 b2.accept("Victor", 10);
		 
		 System.out.println(map);
		 
		 //Another example
		 Map<String, String> map2 = new HashMap<>();
		 BiConsumer<String, String> b3 = map2::put;
		 BiConsumer<String, String> b4 = (k, v) -> map2.put(k, v);
		 
		 b3.accept("chicken", "Cluck");
		 b4.accept("chick", "Tweep");
		 
		 System.out.println(map2); 
		
	}
}
