//100% branch, DON'T reveal fault
package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuggyClassTestBC3 {

    private BuggyClass test;

    @Test
    public void testBuggyMethod3() {
        test = new BuggyClass();
        assertEquals(2, test.buggyMethod3(2, 1));
        assertEquals(0, test.buggyMethod3(0, 1));
        assertEquals(-2, test.buggyMethod3(-2, 1));
    }
}
