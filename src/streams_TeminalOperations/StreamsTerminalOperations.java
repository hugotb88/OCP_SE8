package streams_TeminalOperations;

import java.util.Optional;
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

    }
}
