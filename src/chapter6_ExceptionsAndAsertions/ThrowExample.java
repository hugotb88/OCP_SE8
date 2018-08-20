package chapter6_ExceptionsAndAsertions;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject Example of Throws and Throw
 * Throw is used inside of the method to trigger an exception
 */
public class ThrowExample {

    //This method triggers an exception
    static void validateStudent(int age){
        if(age<5)
            throw new ArithmeticException("age to play more");
        else
            System.out.println("welcome to school");
    }

    public static void main(String[] args) {
        validateStudent(3);
    }
}
