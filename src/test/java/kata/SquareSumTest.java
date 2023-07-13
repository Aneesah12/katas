package kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareSumTest {

    @Test
    public void test() {
        assertEquals(9, SquareSum.squareIt(new int[] {1,2,2}));
        assertEquals(5, SquareSum.squareIt(new int[] {1,2}));
        assertEquals(50, SquareSum.squareIt(new int[] {5,-3,4}));
        assertEquals(0, SquareSum.squareIt(new int[] {}));
    }
}
