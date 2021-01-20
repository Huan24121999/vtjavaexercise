package com.viettel.concurrenty;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * takes a positive integer n from the command line
 * and creates exactly n threads that print out their own name
 *
 * @author HuanNt
 */
public class TestThreadMany {

    /**
     * test createThread method
     *
     * @param args unused
     */
    public static void main(String[] args) {
        int numberThreads = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                numberThreads = scanner.nextInt();
                createThread(numberThreads);
            } catch (InputMismatchException ex) {
                System.out.println("Number is incorrect");
                scanner.next();
            }
        }
    }

    /**
     * Create new threads
     *
     * @param number the number of thread
     */
    public static void createThread(int number) {
        for (int i = 0; i < number; i++) {
            Thread thread = new Thread(null, null, i + "") {
                @Override
                public void run() {
                    System.out.println("Hi, I'm thread " + this.getName());
                }
            };
            thread.start();
        }
    }


}
