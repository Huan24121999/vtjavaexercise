package com.viettel.concurrenty;

/**
 * Exercise 2: answer the question about thread
 *
 * @author HuanNT
 */
public class BadThreads {

    static String message;

    private static class CorrectorThread
            extends Thread {

        public void run() {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
            // Key statement 1:
            message = "Mares do eat oats.";
        }
    }

    public static synchronized void main(String args[])
            throws InterruptedException {

        Thread thread = new CorrectorThread();
        message = "Mares do not eat oats.";
        Thread.sleep(2000);
        // Key statement 2:
        thread.start();
        System.out.println(message);
    }
}
/*
ANSWER: can't guarantee that the program always print out "Mares do eat oats"
Because: After creating the new CorrectorThread and using start() method, JVM will arrange this thread
to the runnable threads, dependent on the number existing thread and computer, JVM will call run() method after
that. So, we can't exactly the time when this thread will be called. But the thread of the main method still
running.We can't guarantee the last time the message will be changed. So, It's a reason why we can't guarantee
that the program always print out "Mares do eat oats".
=> Can't change parameters of the sleep() to guarantee the program always print out "Mares do eat oats"
=> Solution: call start() method or call run() method after Key statement 2 and unused Thread.sleep().
*/

