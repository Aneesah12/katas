package kata;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class LineNumberingTest {

    @Test
    public void test1() {
        assertEquals(Arrays.asList("1: a", "2: b", "3: c"), LineNumbering.number(Arrays.asList("a", "b", "c")));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList("1: ", "2: ", "3: ", "4: ", "5: "), LineNumbering.number(Arrays.asList("", "", "", "", "")));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList(), LineNumbering.number(Arrays.asList()));
    }

}
