package streams_AllTogether;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject Put all the things in Streams together
 */
public class StreamsAllTogether {

    public static void main(String[] args) {
        //In Java 7, we’d have to write something like the following:
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        List<String> filtered = new ArrayList<>();
        for (String name : list) {
            if (name.length() == 4) filtered.add(name);
        }
        Collections.sort(filtered);
        Iterator<String> iter = filtered.iterator();
        if (iter.hasNext()) System.out.println(iter.next());
        if (iter.hasNext()) System.out.println(iter.next());
        if (iter.hasNext()) System.out.println(iter.next());


        // The problem
        //we are trying to solve gets lost in the implementation. It is also very focused on the how
        //rather than on the what. In Java 8, the equivalent code is as follows:

        List<String> list2 = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        list2.stream().filter(n -> n.length() == 4).sorted()
                .limit(2).forEach(System.out::println);


        //Formated to read it easily
        List<String> list3 = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        list3.stream().filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);


        //The difference is that we express what is going on. We care about String objects of
        //length 4. Then we then want them sorted. Then we want to first two. Then we want to
        //print them out.


        //Another examples (This never ends until the heap space is not enough
//        Stream.generate(() -> "Elsa")
//                .filter(n -> n.length() == 4)
//                .sorted()
//                .limit(2)
//                .forEach(System.out::println);


        //This prints "Elsa" twice because first finds the limit 2 and then sort the elements
        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);



        //This never ends because we never had an element with length 4, then we can't limit to 2 elemnts and sort them
        //But here the heapspace is not used as inm the first example, then we never get an Exception
        Stream.generate(() -> "Olaf Lazisson")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);

    }
}
