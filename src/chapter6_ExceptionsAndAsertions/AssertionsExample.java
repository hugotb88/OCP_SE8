package chapter6_ExceptionsAndAsertions;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject Assert concepts,
 * sintax
 * assert boolean_expression
 * assert boolean_expression: error_message
 *
 * *Important: First you need to enable assertions in the comandline using java -ea
 *
 */
public class AssertionsExample {

    public static void main(String[] args) {

        // An assertion is a Boolean expression that you place at a point in your code where you
        //expect something to be true.
        int numGuests = -5;
//        assert numGuests > 0;
        assert numGuests < 0;
        System.out.println(numGuests);
    }
}
