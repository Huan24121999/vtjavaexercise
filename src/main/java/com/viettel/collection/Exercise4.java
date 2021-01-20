package com.viettel.collection;

import java.util.*;

/**
 * get the element in a tree set which is greater than or equal to the given element
 *
 * @author HuanNT
 */
public class Exercise4 {
    public static void main(String[] args) {
        // create tree set
        TreeSet<Double> doubleSet = new TreeSet<Double>();
        double givenNumber = 0;
        double element = 0;
        Scanner scanner = new Scanner(System.in);

        // add numbers in the set
        doubleSet.add(1.4);
        doubleSet.add(1.999);
        doubleSet.add(7.4);
        doubleSet.add(8.4);
        doubleSet.add(30.2);
        while (true) {
            try {
                System.out.println("Input double number: ");
                givenNumber = scanner.nextDouble();
                element = doubleSet.ceiling(givenNumber);
                System.out.println("The number is greater than or equal to " + givenNumber + " : " + element);
            } catch (InputMismatchException ex) {
                System.out.println("The input value is incorrect");
                scanner.next();
            }
        }
    }
}
