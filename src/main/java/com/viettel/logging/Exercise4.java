package com.viettel.logging;

/**
 * Find output of the program
 * @author HuanNT
 */
public class Exercise4
{
    public void foo()
    {
        assert false; /* Line 5 */
        assert false; /* Line 6 */
    }
    public void bar()
    {
        while(true)
        {
            assert false; /* Line 12 */
        }
        //assert false;  /* Line 14 */
    }
}

/*
answer: Compilation failed because Line 14 is unreachable.  When Line 12 is executed, it throw
a Exception and break program, so Line 14 can't reachable
*/

