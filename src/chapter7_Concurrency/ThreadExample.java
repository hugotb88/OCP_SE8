package chapter7_Concurrency;

import sun.awt.windows.ThemeReader;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject
 */
public class ThreadExample extends Thread {

    //Implementing the desire behaviour of run()
    public void run(){
        System.out.println("Printing something");
    }


    //main
    public static void main(String[] args) {
        (new ThreadExample()).start();
    }
}
