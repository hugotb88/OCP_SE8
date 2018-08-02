package streams_AdvancedPipelineConcepts;


import java.util.Optional;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject
 */
public class StreamChainingOptional {


    //Suppose that you are given an Optional<Integer> and asked to print the value, but
    //only if it is a three-digit number. Without functional programming, you could write the
    //following:
    private static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) { // outer if
            Integer num = optional.get();
            String string = "" + num;
            if (string.length() == 3) // inner if
                System.out.println(string);
        }
    }

    //It works, but it contains nested if statements. That’s extra complexity. Let’s try this
    //again with functional programming:
    private static void threeDigitFunctionalProgramming(Optional<Integer> optional) {
        optional.map(n -> "" + n) // part 1
                .filter(s -> s.length() == 3) // part 2
                .ifPresent(System.out::println); // part 3
    }

    public static void main(String[] args) {
        Integer i1 = new Integer(123);
//        Integer i1 = new Integer(1234);
        Optional<Integer> obj3 = Optional.of(i1);
        StreamChainingOptional.threeDigit(obj3);
        StreamChainingOptional.threeDigitFunctionalProgramming(obj3);
    }
}
