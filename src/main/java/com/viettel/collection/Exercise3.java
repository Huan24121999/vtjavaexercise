package com.viettel.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Compare two sets and retain elements which are same on both sets
 *
 * @author HuanNT
 */
public class Exercise3 {
    /**
     * Compare two sets and retain elements which are same on both sets
     *
     * @param args unused
     */
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        set1.add("D");
        set1.add("E");
        set2.add("A");
        set2.add("B");
        set2.add("c");
        set2.add("d");
        set2.add("E");
        System.out.println("Set 1's elements: " + set1);
        System.out.println("Set 2's elements: " + set2);
        set1.retainAll(set2);
        System.out.println("The same elements after comparing: " + set1);
    }

}
