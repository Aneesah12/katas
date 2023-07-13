package kata;

import org.junit.Test;

import static org.junit.Assert.*;

public class FruitGuyTest {

    @Test
    public void testEmptyFruit() {
        assertTrue(FruitGuy.removeRotten(new String[0]).length == 0);
    }

    @Test
    public void fruitGuyTest() {
        assertArrayEquals(new String []{"apple","banana","apple","pineapple","kiwi"}, FruitGuy.removeRotten(new String []{"rottenApple","rottenBanana","rottenApple","rottenPineapple","rottenKiwi"}));
    }

    @Test
    public void fruitGuyTest1() {
        assertArrayEquals(new String[]{}, FruitGuy.removeRotten(null));
    }
}
