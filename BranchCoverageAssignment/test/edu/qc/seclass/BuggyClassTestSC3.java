//100% statement, less than 100% branch, REVEAL fault
package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuggyClassTestSC3 {

    private BuggyClass test;

    @Test
    public void test1BuggyMethod3() {
        test = new BuggyClass();
        assertEquals(-1, test.buggyMethod3(-1, 1));
        assertEquals(0, test.buggyMethod3(2, 0));
    }
}
