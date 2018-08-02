package streams_AdvancedPipelineConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject
 */
public class StreamCount {

    public static void main(String[] args) {
        List<String> cats = new ArrayList<>();
        cats.add("Annie");
        cats.add("Ripley");
        Stream<String> stream = cats.stream(); //here have two elements
        cats.add("KC");
        System.out.println(stream.count()); //The pipeline starts and looks in the source, then the list has three elements
    }
}
