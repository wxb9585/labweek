package week4;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NoTriplesTest {

    @Test
    public void testNoTriples() {
        // Too short
        assertTrue(NoTriples.noTriples(new int[] { 5 }));
        assertTrue(NoTriples.noTriples(new int[] { 5, 5 }));

        // Contains triples
        assertFalse(NoTriples.noTriples(new int[] { 5, 5, 5 }));
        assertFalse(NoTriples.noTriples(new int[] { 1, 1, 2, 2, 2, 1 }));
        assertFalse(NoTriples.noTriples(new int[] { 1, 1, 1, 2, 2, 2, 1 }));

        // Does not contain triples
        assertTrue(NoTriples.noTriples(new int[] { 1, 1, 2, 2, 1 }));
    }

}
