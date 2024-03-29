package week5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OneTimePadDecipherTest {

    @Test
    public void testDecipher() {
        assertEquals("YOUMANAGEDIT", OneTimePadDecipher.decipher("uvufsghktdal", "WHATSTHEPASSWORD"));

        assertEquals("YOUCANDECIPHEROK", OneTimePadDecipher.decipher("wconlahzgzgleuai", "YOULLNEVERREADMYONETIMEPAD"));

        assertEquals("IS THIS SECURE", OneTimePadDecipher.decipher("sw itmn jcxyic", "KEEPMEVERYVERYSAFE"));
    }
}