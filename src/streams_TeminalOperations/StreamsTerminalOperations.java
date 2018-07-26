package streams_TeminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author Victor Hugo Olvera Cruz
 * Principal terminal operations for streams
 */
public class StreamsTerminalOperations {

    public static void main(String[] args) {

        //count() - Determines number of elements in an finite stream
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count()); // 3


        //min() and max() - Allow you to pass a custom comparator to find the small
        //or largest value in a finite Stream.
        Stream<String> st = Stream.of("monkey","ape","bonobo");
        Optional<String> min = st.min((s1, s2) -> s1.length() - s2.length()); //Determines min
        min.ifPresent(System.out::println); //ape


        //finAny() and findFirst() -   return an element of the stream unless the stream
        //is empty. If the stream is empty, they return an empty Optional. Works with INFINITE Streams
        Stream<String> str = Stream.of("monkey","gorilla","bonobo");
        Stream<String> strInfinite = Stream.generate(() -> "chimp");
        Stream<Double> douInfinite = Stream.generate(Math::random);
        str.findAny().ifPresent(System.out::println); //monkey
        strInfinite.findFirst().ifPresent(System.out::println); //chimp
        douInfinite.findFirst().ifPresent(System.out::println); //random number

        // allMatch(), anyMatch() and noneMatch()
        //The allMatch() , anyMatch() and noneMatch() methods search a stream and return information
        //about how the stream pertains to the predicate. These may or may not terminate
        //for infi nite streams. It depends on the data.

        List<String> list = Arrays.asList("monkey","2","chimp");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter((x.charAt(0)));
        System.out.println(list.stream().anyMatch(pred)); //true because the pred found a at least a char in list
        System.out.println(list.stream().allMatch(pred)); //false because not all elements in list are String
        System.out.println(list.stream().noneMatch(pred)); //false because not all elements in list are not a  String
        System.out.println(infinite.anyMatch(pred)); //true because found chimp in infinite at least one time

        // forEach()
        // A looping construct is available. As expected, calling forEach() on an infi nite stream does
        //not terminate. Since there is no return value, it is not a reduction.
        Stream<String> sforEach =  Stream.of("monkey","gorilla","bonobo");
        sforEach.forEach(System.out::print); //monkeygorillabonobo
        System.out.println();

        // reduce()
        // Combines a srtream into a single object.
        String[] array = new String[] {"w","o","l","f"};
        String result = "";
        for (String sReduce: array) {
            result = result + sReduce;
        }
        System.out.println(result);  //wolf

        // now with lambdas and reduction
        Stream<String> streamReduce =  Stream.of("w", "o", "l", "f");
        String word = streamReduce.reduce("", (sReduce,c) -> sReduce + c);
        System.out.println(word);  //wolf


        // Can you write a reduction to multiply all of the Integer objects in
        //a stream?
        Stream<Integer> sInt = Stream.of(1,2,3);
        System.out.println(sInt.reduce(1, (a, b) -> a*b));


        //collect()
        //The collect() method is a special type of reduction called a mutable reduction. It is
        //more efficient than a regular reduction because we use the same mutable object while
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder newWord = stream.collect(StringBuilder::new,
                StringBuilder::append, StringBuilder::append);

        //The first parameter is a Supplier that creates the object that will store the results as we
        //collect data. Remember that a Supplier doesn’t take any parameters and returns a value.
        //In this case, it constructs a new StringBuilder.
        //The second parameter is a BiConsumer, which takes two parameters and doesn’t return
        //anything. It is responsible for adding one more element to the data collection. In this example,
        //it appends the next String to the StringBuilder.
        //The final parameter is another BiConsumer. It is responsible for taking two data collections
        //and merging them. This is useful when we are processing in parallel. Two smaller
        //collections are formed and then merged into one. This would work with StringBuilder
        //only if we didn’t care about the order of the letters. In this case, the accumulator and combiner
        //have similar logic.

        //another example
        Stream<String> streamS = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = streamS.collect(TreeSet::new, TreeSet::add,
                TreeSet::addAll);
        System.out.println(set); // [f, l, o, w]

    }
}
