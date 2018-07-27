package streams_IntermediateOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject Principal Intermediate Operations for Streams
 * These operations returns an Stream not the final result.
 */
public class StreamsIntermediateOperations {

    public static void main(String[] args) {

        //filter()
        // Returns a Stream with elements that match given expressions
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m")).forEach(System.out::println); //monkey

        //distinct()
        // Returns a Stream with dupliucated values removed, Java calls "equals()"
        //to determine whether the objects are the same.
        Stream<String> sDistinct = Stream.of("duck", "duck", "duck", "goose");
        sDistinct.distinct().forEach(System.out::println); // duck goose

        //limit() and skip()
        // make a Stream smaller. They could make a fi nite stream
        //smaller, or they could make a fi nite stream out of an infi nite stream.
        //The skip()
        //operation returns an infi nite stream starting with the numbers counting from 6, since it
        //skips the fi rst fi ve elements. The limit() call takes the fi rst two of those.
        Stream<Integer> s3 = Stream.iterate(1, n -> n+1);
        s3.skip(5).limit(2).forEach(System.out::println); // 6 7

        //map()
        //The map() method creates a one-to-one mapping from the elements in the stream to the elements
        //of the next step in the stream.
        // This one looks more complicated than the others you have seen. It uses the lambda
        //expression to fi gure out the type passed to that function and the one returned. The return
        //type is the stream that gets returned

        //As an example, this code converts a list of String objects to a list of Integers representing
        //their lengths:
        Stream<String> s4 = Stream.of("monkey", "gorilla", "bonobo");
        s4.map(String::length).forEach(System.out::print); // 676


        //flatMap()
        //The flatMap() method takes each element in the stream and makes any elements it contains
        //top-level elements in a single stream. This is helpful when you want to remove empty
        //elements from a stream or you want to combine a stream of lists. We are showing you the
        //method signature for consistency with the other methods, just so you don’t think we are
        //hiding anything.
        System.out.println();
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
//        Stream<String> animals = Stream.of(zero, one, two); Not valid


        //sorted()
        //The sorted() method returns a stream with the elements sorted. Just like sorting arrays,
        //Java uses natural ordering unless we specify a comparator
        Stream<String> s5 = Stream.of("brown-", "bear-");
        s5.sorted().forEach(System.out::print); // bear-brown-

        //Now with Comparator
        //Remember that we can pass a lambda expression as the comparator. For example, we
        //can pass a Comparator implementation:
        Stream<String> s6 = Stream.of("brown bear-", "grizzly-");
        s6.sorted(Comparator.reverseOrder())
                .forEach(System.out::print); // grizzly-brown bear-



        //peek()
        // The peek() method is our final intermediate operation. It is useful for debugging because it
        //allows us to perform a stream operation without actually changing the stream
        Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(z -> z.startsWith("g"))
                .peek(System.out::println).count(); // grizzly  Here we make an count operation but we printed grizzly
        System.out.println(count); // 1
}
