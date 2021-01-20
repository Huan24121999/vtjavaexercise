package com.viettel.javastructure;

import java.util.Scanner;

/**
 * The DigitSum program implements an application that calculate sum of the digits of
 * a number between 0 and 1000 and print out on the screen
 *
 * @author HuanNT
 */

public class DigitSum {

    /**
     * Calculate the sum of the number's digits
     *
     * @param n This is a number between 0 and 1000
     * @return int This return sum of the digits of the input number
     */

    public static int addDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    /**
     * This is main method which get data from input and use addDigit method then
     * print out the result
     *
     * @param args Unused
     * @return Nothing
     */
    public static void main(String[] args) {
        int n = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("input a number between 0 and 1000: ");
            try {
                n = scanner.nextInt();
            } catch (Exception ex) {
                scanner.next();
            }
        } while (n < 0 || n > 1000);

        System.out.println("The sum of all digits in " + n + " is " + addDigit(n));
    }
}
