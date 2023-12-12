//>50% branch coverage, REVEALS fault
package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuggyClassTestBC2 {

    private BuggyClass test;

    @Test
    public void test2BuggyMethod2() {
        test = new BuggyClass();
        assertEquals(-1, test.buggyMethod2(-1, 1));
        assertEquals(0, test.buggyMethod2(2, 0));
    }
}
