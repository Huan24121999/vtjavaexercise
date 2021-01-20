package com.viettel.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * check whether a map contains key-value mappings (empty) or not.
 *
 * @author HuanNT
 */
public class Exercise5 {
    /**
     * check whether a map contains key-value mappings (empty) or not.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        boolean isEmpty = false;
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        isEmpty = map.isEmpty();
        System.out.println("Map: " + map);
        System.out.println("Is map empty? " + isEmpty);
        map.clear();
        System.out.println("Map: " + map);
        isEmpty = map.isEmpty();
        System.out.println("Is map empty? " + isEmpty);
    }
}
