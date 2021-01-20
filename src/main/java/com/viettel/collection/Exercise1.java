package com.viettel.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * The Program allows insert the specified element at the specified position in the linked list
 *
 * @author HuanNT
 */
public class Exercise1 {

    /**
     * test addElement method
     *
     * @param args unused
     */
    public static void main(String[] args) {
        List<String> stringList = new LinkedList<String>();
        String element = null;
        int position = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Input position and String value: ");
                position = scanner.nextInt();
                element = scanner.next();
                addElement(stringList, element, position);
                printList(stringList);
            } catch (Exception ex) {
                System.out.println("The input value is incorrect");
                scanner.next();
            }
        }
    }

    /**
     * Add specified element at the specified position in the specified list
     *
     * @param list     list specified String elements
     * @param element  the specified element
     * @param position the specified position
     */
    public static void addElement(List<String> list, String element, int position) {
        int length = list.size();
        if (position < 0) {
            list.add(0, element);
        }
        // if specified position higher than length of list, put element at the end of list
        else if (position > length) {
            list.add(element);
        } else {
            list.add(position, element);
        }
    }

    /**
     * Print out all elements of specified list
     *
     * @param list specified list
     */
    public static void printList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ": " + list.get(i));
        }
    }

}
