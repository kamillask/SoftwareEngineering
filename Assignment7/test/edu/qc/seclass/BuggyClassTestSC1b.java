//<50% statement coverage, REVEALS fault
package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuggyClassTestSC1b {

    private BuggyClass test;

    @Test
    public void testBuggyMethod1() {
        test = new BuggyClass();
        assertEquals(0, test.buggyMethod1(2,0));
    }

}
