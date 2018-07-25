package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

/**
 * @author Victor Hugo Olvera Cruz
 * Streams basics, we user the Stream interface
 *
 */

public class StreamsBasics {

    public static void main(String[] args) {

        //Few ways toc reate a finite stream
        Stream<String> empty = Stream.empty(); //count = 0
        Stream<Integer> singleElement = Stream.of(1); //count = 1
        Stream<Integer> fromArray = Stream.of(1,2,3); //count = 2

        //Converting List to Stream
        List<String> list = Arrays.asList("a","b","c");
        Stream<String> fromList = list.stream();  //converts from List
        Stream<String> fromListParallel = list.parallelStream(); //converts from List but also process elements in parallel

        //We can't create an infinite List, but we can do it with Streams

        //"generate" only generates the info
        Stream<Double> randoms =  Stream.generate(Math::random); //An infinite random

        //With "iterate", we can set an starting value
        Stream<Integer> oddNumbers =  Stream.iterate(1, n -> n+2); //Generate infinite oddNumbers



        // ** Method limit() could help to convert inifinite Streams to finite



    }
}
