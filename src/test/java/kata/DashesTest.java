package kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DashesTest {

    @Test
    public void test() {
        assertEquals("4547-9-3", Dashes.insertDashes(454793));
        assertEquals("123456", Dashes.insertDashes(123456));
        assertEquals("1003-567", Dashes.insertDashes(1003567));    }

}
