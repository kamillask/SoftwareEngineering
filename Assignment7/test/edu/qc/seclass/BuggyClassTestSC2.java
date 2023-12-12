//100% statement coverage, DOESN'T reveal fault
package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuggyClassTestSC2 {

    private BuggyClass test;

    @Test
    public void testBuggyMethod2() {
        test = new BuggyClass();
        assertEquals(2, test.buggyMethod2(2, 1));
        assertEquals(-2, test.buggyMethod2(-2, 1));
    }


}
