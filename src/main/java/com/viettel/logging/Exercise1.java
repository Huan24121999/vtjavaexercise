package com.viettel.logging;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
Exercise 1: Create a class with a main( ) that throws an object of class Exception
inside a try block. Give the constructor for Exception a String argument. Catch the
exception inside a catch clause and print the String argument. Add a finally clause and
print a message to prove you were there, use log4j

Exercise 2: Define an object reference and initialize it to null. Try to call a method
through this reference. Now wrap the code in a try-catch clause to catch the exception.
Print the exception with log4j

*/
/**
 * Include 2 exercise: Exercise 1 and Exercise 2
 *
 * @author HuanNT
 */
public class Exercise1 {
    private static final Logger LOGGER = LogManager.getLogger(Exercise1.class);

    public static void main(String[] args) {
        try {
            throw new Exception("Exercise1.main()");

        } catch (Exception ex) {
            LOGGER.error(ex.getMessage());
        } finally {
            LOGGER.info("Finally");
        }

        // Exercise 2
        Object object = null;
        try {
            object.getClass();
        } catch (NullPointerException ex) {
            LOGGER.error(ex.getMessage());
        }
    }
}
