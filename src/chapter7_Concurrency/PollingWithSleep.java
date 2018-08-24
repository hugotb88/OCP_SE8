package chapter7_Concurrency;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject Polling with Sleep
 * Oftentimes, you need a thread to poll for a result to finish. Polling is the process of intermittently
 * checking data at some fixed interval. For example, let’s say that you have a thread
 * that modifies a shared static counter value and your main() thread is waiting for the
 * thread to increase the value above 100
 */
public class PollingWithSleep {

    //attributes
    private static int counter = 0;

    public static void main(String[] args){

        new Thread(() -> {
            for (int i=0; i<500; i++){
                PollingWithSleep.counter++;
            }
        } ).start();

        while (PollingWithSleep.counter <100){
            System.out.println("Not reached yet");
        }
        System.out.println("Reached!");
    }

    //The number of times that "Not reached yet" is showed is aleatory, that's why we need to use sleep()



}
