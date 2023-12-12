//100% statement, DOESN'T reveal fault
package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuggyClassTestSC1a {

    private BuggyClass test;

    @Test
    public void testBuggyMethod1() {
        test = new BuggyClass();
        assertEquals(2, test.buggyMethod1(2,1));
    }

}
