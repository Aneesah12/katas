package kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareDigitsTest {

    @Test
    public void test1() {
        assertEquals(81, SquareDigits.toSquare(9));
    }

    @Test
    public void test2() {
        assertEquals(819, SquareDigits.toSquare(93));
    }

    @Test
    public void test3() {
        assertEquals(811181, SquareDigits.toSquare(9119));
    }
}
