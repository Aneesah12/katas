package kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountingDuplicatesTest {

    @Test
    public void abcdeReturnsZero() {
        assertEquals(0, CountingDuplicates.numberOfDuplicates("abcde"));
    }

    @Test
    public void aabbcdeReturnsTwo() {
        assertEquals(2, CountingDuplicates.numberOfDuplicates("aabbcde"));
    }

    @Test
    public void aabBcdeReturnsTwo() {
        assertEquals(2, CountingDuplicates.numberOfDuplicates("aabBcde"));
    }

    @Test
    public void indivisibilityReturnsTwo() {
        assertEquals(1, CountingDuplicates.numberOfDuplicates("indivisibility"));
    }

}
