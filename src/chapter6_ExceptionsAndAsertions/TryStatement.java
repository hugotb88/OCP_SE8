package chapter6_ExceptionsAndAsertions;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject Try Statement
 */
public class TryStatement {

    public static void main(String[] args) {

        //We would try to execute some code
        try{
            //Something
        }catch(Exception ex){
            //Something if the code goes wrong
        }finally{
            //Code that always executes
        }


        //Example
        try{
            //Something
            Integer i = 8;
            System.out.println(i/0);
        }catch(ArithmeticException are){
            //Something if the code goes wrong
            System.out.println("This exception is triggered because you tried to divide between zero");
        }finally{
            //Code that always executes
            System.out.println("This code is always executed");
        }
    }

}
