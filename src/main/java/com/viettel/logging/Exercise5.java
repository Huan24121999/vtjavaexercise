package com.viettel.logging;

/**
 * Exercise 5: Find output of the program
 * @author HuanNT
 */

public class Exercise5
{
    public static int y;
    public static void foo(int x)
    {
        System.out.print("foo ");
        y = x;
    }
    public static int bar(int z)
    {
        System.out.print("bar ");
        return y = z;
    }
    public static void main(String [] args )
    {
        int t = 0;
        assert t > 0 : bar(7);
        //assert t > 1 : foo(8); /* Line 18 */
        System.out.println("done ");
    }
}

// answer: Compilation error at line 18 because foo() don't return value
