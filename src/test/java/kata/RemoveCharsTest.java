package kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveCharsTest {

    @Test
    public void firstTest() {
        assertEquals("loquen", RemoveChars.remover("eloquent"));
        assertEquals("ountr", RemoveChars.remover("country"));
        assertEquals("erso", RemoveChars.remover("person"));
        assertEquals("lac", RemoveChars.remover("place"));
    }


}
