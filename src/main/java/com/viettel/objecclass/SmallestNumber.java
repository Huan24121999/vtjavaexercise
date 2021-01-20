package com.viettel.objecclass;

import java.util.Scanner;

/**
 * SmallestNumber implement a application find a smallest number among 3 numbers
 *
 * @author HuanNT
 */
public class SmallestNumber {

    /**
     * get 3 input numbers and using findSmallestNumber method then print out the result
     *
     * @param args Unused
     * @return Nothing
     */
    public static void main(String[] args) {
        double firstNumber, secondNumber, thirdNumber;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Input 3 numbers: ");
            try {
                firstNumber = scanner.nextDouble();
                secondNumber = scanner.nextDouble();
                thirdNumber = scanner.nextDouble();
                break;
            } catch (Exception ex) {
                scanner.next();
            }
        } while (true);
        System.out.println(findSmallestNumber(firstNumber, secondNumber, thirdNumber));
    }

    /**
     * Return the smallest number among 3 input numbers
     *
     * @param firstNumber  the first value
     * @param secondNumber the second value
     * @param thirdNumber  the third value to find smallest value
     * @return double the result
     */
    public static double findSmallestNumber(double firstNumber, double secondNumber, double thirdNumber) {
        return firstNumber > secondNumber
                ? (firstNumber > thirdNumber ? firstNumber : thirdNumber)
                : (secondNumber > thirdNumber ? secondNumber : thirdNumber);
    }

}
