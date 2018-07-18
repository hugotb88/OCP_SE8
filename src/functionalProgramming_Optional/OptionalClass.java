package functionalProgramming_Optional;

import java.util.Optional;

/**
 * @author victor olvera
 */

public class OptionalClass {

    //Method that returns an Optional
    public static Optional<Double> average(int... scores) {
        if (scores.length == 0)
            return Optional.empty();

        int sum = 0;
        for (int score : scores)
            sum += score;
        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {
        Optional<Double> obj1 = average();
        Optional<Double> obj2 = average(90,100);


        //checks if Optional contains` something
        if(obj2.isPresent())
            System.out.println(obj2.get()); //95.0

        //checks if Optional contains something, triggers an Exception
//        if(obj1.isPresent())
//            System.out.println(obj1.get());

        //Example fixing null posibility
        Double d1 = new Double(90);
        Optional<Double> obj3 = Optional.of(d1);
        obj3 = (obj3.get()==null) ? Optional.empty() : Optional.of(d1);
        System.out.println(obj3.get());


        //Example with ofNullable, another way to do that we did above
        OptionalClass oc4 = new OptionalClass();
        Optional<OptionalClass> obj4 = Optional.ofNullable(oc4);
        System.out.println(obj4.get());

    }
}


