import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class TestHouseCat {
    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }
    @Test
    public void canPurr() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertTrue(keyboardCat.canPurr());
    }

}