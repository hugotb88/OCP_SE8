package chapter7_Concurrency;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject
 */
public class RunnableExample  implements Runnable{

    public static void main(String[] args) {
        (new Thread(new RunnableExample())).start(); ///creating a Thread with an instance of the class and running start method
    }

    @Override
    public void run() {
        System.out.println("Run is the method inside of Runnable");
    }
}
