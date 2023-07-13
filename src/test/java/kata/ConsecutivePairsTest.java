package kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsecutivePairsTest {

    @Test
    public void test1() {
        assertEquals(3, ConsecutivePairs.countConsecutivePairs(new int[]{1,2,5,8,-4,-3,7,6,5}));
    }
}
