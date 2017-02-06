package week5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OneTimePadEncipherTest {

    @Test
    public void testCharToInt() {
        assertEquals(0, OneTimePadEncipher.charToInt('a'));
        assertEquals(25, OneTimePadEncipher.charToInt('z'));
        assertEquals(0, OneTimePadEncipher.charToInt('A'));
        assertEquals(25, OneTimePadEncipher.charToInt('Z'));
    }

    @Test
    public void testIntToChar() {
        assertEquals('a', OneTimePadEncipher.intToChar(0));
        assertEquals('z', OneTimePadEncipher.intToChar(25));
    }

    @Test
    public void testEncipher() {
        assertEquals("eqnvz", OneTimePadEncipher.encipher("HELLO", "XMCKL"));

        assertEquals("eshygwvfltxdwwurkx", OneTimePadEncipher.encipher("SUPERSECRETMESSAGE", "MYSUPERDUPERSECRETCKEY"));

        assertEquals("sw itmn jcxyic", OneTimePadEncipher.encipher("IS THIS SECURE", "KEEPMEVERYVERYSAFE"));
    }

}