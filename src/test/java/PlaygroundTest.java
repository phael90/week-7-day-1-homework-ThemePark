import Attractions.Dodgems;
import Attractions.Playground;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;
    @Before
    public void before() {
        playground = new Playground("Todler");
        visitor = new Visitor("Donald",20, 180, 200.00);
    }
    @Test
    public void hasName() {
        assertEquals("Todler", playground.getName());
    }

    @Test
    public void isAllowed() {
        assertEquals(true, playground.isAllowedTo(visitor));
    }
}
