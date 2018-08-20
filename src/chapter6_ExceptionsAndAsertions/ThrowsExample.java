package chapter6_ExceptionsAndAsertions;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject Used when you know that the code can potentially trigger an exception
 */
public class ThrowsExample {

    //Division method
    static float division (int a,int b) throws ArithmeticException{
        float res;
        if(a == 8){
            res = a/0;
        }else{
            res = a/b;
            System.out.println(res);
        }
        return res;

    }

    public static void main(String[] args) {
        try{
            division(5,5);
        }catch(Exception e){
            System.out.println("The Arithmetic Exception was triggered");
        }
    }
}
