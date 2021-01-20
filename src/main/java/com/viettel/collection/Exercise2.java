package com.viettel.collection;

import java.util.*;

/**
 * The Program allows retrieve an element (at a specified index) from a given array list.
 *
 * @author HuanNT
 */
public class Exercise2 {
    /**
     * test getElement method
     *
     * @param args unused
     */
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        int position = 0;
        String element = null;
        Scanner scanner = new Scanner(System.in);

        // put element to list
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("C");
        stringArrayList.add("D");
        stringArrayList.add("E");
        printList(stringArrayList);
        while (true) {
            try {
                System.out.println("Input position: ");
                position = scanner.nextInt();
                element = getElement(stringArrayList, position);
                System.out.println(element);
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Can't get element at position: " + position);
            } catch (InputMismatchException ex) {
                scanner.next();
                System.out.println("Position value is incorrect");
            }
        }
    }

    /**
     * get element at the specified position of specified list
     *
     * @param list     specified list
     * @param position specified position
     * @return element at the position of list
     */
    public static String getElement(List<String> list, int position) {
        return list.get(position);
    }

    /**
     * Print out all elements of list
     *
     * @param list specified list
     */
    public static void printList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ": " + list.get(i));
        }
    }

}
