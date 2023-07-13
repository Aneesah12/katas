package kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PatternTest {

    @Test
    public void patternTestOne() {
        assertEquals("1", MyPattern.pattern(1));
    }

    @Test
    public void patternTestTwo() {
        assertEquals("123\n23\n3", MyPattern.pattern(3));
    }

    @Test
    public void patternTestThree() {
        assertEquals("12345\n2345\n345\n45\n5", MyPattern.pattern(25));
    }

    @Test
    public void patternTestFour() {
        assertEquals("", MyPattern.pattern(0));
    }

    @Test
    public void patternTestFive() {
        assertEquals("", MyPattern.pattern(-25));
    }

    @Test
    public void patternTestSix() {
        assertEquals("", MyPattern.pattern(-59));
    }

}
