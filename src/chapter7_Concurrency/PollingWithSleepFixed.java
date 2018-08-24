package chapter7_Concurrency;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject Polling with Sleep
 * In this example, we delay 1,000 milliseconds at the end of the loop, or 1 second. While this
 * may seem like a small amount, we have now prevented a possibly infinite loop from executing
 * and locking up our main program. Notice that we also changed the signature of the main
 * method, since Thread.sleep() throws the checked InterruptedException. Alternatively, we
 * could have wrapped each call to the Thread.sleep() method in a try/catch block.
 */
public class PollingWithSleepFixed {

    //attributes
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            for (int i=0; i<500; i++){
                PollingWithSleepFixed.counter++;
            }
        } ).start();

        while (PollingWithSleepFixed.counter <100){
            System.out.println("Not reached yet");
            Thread.sleep(1000); //1 second
        }
        System.out.println("Reached!");
    }

    //The number of times that "Not reached yet" is showed is aleatory, that's why we need to use sleep()



}
