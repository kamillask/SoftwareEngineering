package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyCustomStringTest {

    private MyCustomStringInterface mycustomstring;

    @Before
    public void setUp() {
        mycustomstring = new MyCustomString();
    }

    @After
    public void tearDown() {
        mycustomstring = null;
    }

    //***************testCountNumbers****************************************************************************************************************
    
    
    @Test
    public void testCountNumbers1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(7, mycustomstring.countNumbers());
    }

    //number at end
    @Test
    public void testCountNumbers2() {
    	mycustomstring.setString("Test1");
        assertEquals(1, mycustomstring.countNumbers());
    }

    //number in beginning
    @Test
    public void testCountNumbers3() {
    	mycustomstring.setString("1Test");
        assertEquals(1, mycustomstring.countNumbers());
    }

    //no numbers
    @Test
    public void testCountNumbers4() {
    	mycustomstring.setString("There's no numbers in here.");
        assertEquals(0, mycustomstring.countNumbers());
    }

    //null string
    @Test (expected = NullPointerException.class)
    public void testCountNumbers5() {
    	mycustomstring.setString(null);
    	mycustomstring.countNumbers();
    }

    //empty string
    @Test
    public void testCountNumbers6() {
    	mycustomstring.setString("");
        assertEquals(0, mycustomstring.countNumbers());
    }

    
  //***************testGetEveryNthCharacterFromBeginningOrEnd****************************************************************************************************************
    
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd2() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }
    
    //null string false
    @Test (expected = NullPointerException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd3() {
    	mycustomstring.setString(null);
    	mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false);
    }

    //n<=0
    @Test (expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd4() {
    	mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
    	mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-1, false);
    }

    //empty, true
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd5() {
    	 mycustomstring.setString("");
         assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }

    //n=length, false
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
    	mycustomstring.setString("Hello World");
        assertEquals("d", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(11, false));
    }

    //n>length, false
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
    	mycustomstring.setString("Hello World");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(12, false));
    }

    //empty, false
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd8() {
    	mycustomstring.setString("");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    //n=length, true
    public void testGetEveryNthCharacterFromBeginningOrEnd9() {
    	mycustomstring.setString("Hello World");
        assertEquals("H", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(11, true));
    }

    //n>length, true
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd10() {
    	mycustomstring.setString("Hello World");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(12, true));
    }

    //null true
    @Test (expected = NullPointerException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd11() {
    	mycustomstring.setString(null);
    	mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true);
    }

    //n<=0 true
    @Test (expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd12() {
    	mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
    	mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-1, true);
    }

    //every char true
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd13() {
    	mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, true));
    }

    //every char false
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd14() {
    	mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, false));
    }

    
  //***************testConvertDigitsToNamesInSubstring****************************************************************************************************************
    
    @Test
    public void testConvertDigitsToNamesInSubstring1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", mycustomstring.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring2() {
    	mycustomstring.setString("there's no digits in this string.");
        mycustomstring.convertDigitsToNamesInSubstring(1, 33);
        assertEquals("there's no digits in this string.", mycustomstring.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring3() {
    	mycustomstring.setString("347383");
        mycustomstring.convertDigitsToNamesInSubstring(1, 6);
        assertEquals("ThreeFourSevenThreeEightThree", mycustomstring.getString());
    }
    
    //startPos>endPos
    @Test (expected = IllegalArgumentException.class)
    public void testConvertDigitsToNamesInSubstring4() {
    	mycustomstring.setString("347383");
    	mycustomstring.convertDigitsToNamesInSubstring(6, 1);
    }

    //start outofbounds
    @Test (expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring5() {
    	mycustomstring.setString("347383");
    	mycustomstring.convertDigitsToNamesInSubstring(-1, 6);
    }

    //start=end
    @Test
    public void testConvertDigitsToNamesInSubstring6() {
    	mycustomstring.setString("347383");
    	mycustomstring.convertDigitsToNamesInSubstring(2, 2);
    	assertEquals("3Four7383", mycustomstring.getString());
    }
    
    //endposition outofbounds
    @Test (expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring7() {
    	mycustomstring.setString("347383");
    	mycustomstring.convertDigitsToNamesInSubstring(1, 7);
    }
    
    //nullpointerexception
    @Test (expected = NullPointerException.class)
    public void testConvertDigitsToNamesInSubstring8() {
    	mycustomstring.setString(null);
    	mycustomstring.convertDigitsToNamesInSubstring(1, 6);
    	
    }

}
