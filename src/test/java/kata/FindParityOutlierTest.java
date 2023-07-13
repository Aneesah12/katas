package kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindParityOutlierTest {

    @Test
    public void identifyOnlyOddNumber() {
        assertEquals(11, FindParityOutlier.parityOutlier(new int[] {2, 4, 0, 100, 4, 11, 2602, 36}));
    }

    @Test
    public void identifyEvenOddNumber() {
        assertEquals(160, FindParityOutlier.parityOutlier(new int[] {160, 3, 1719, 19, 11, 13, -21}));
    }

}
