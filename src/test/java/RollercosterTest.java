import Attractions.Rollercoster;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercosterTest {
    Rollercoster rollercoster;
    Visitor visitor;

    @Before
    public void before(){
        rollercoster = new Rollercoster("Dragon");
        visitor = new Visitor("Donald",20, 180, 200.00);
    }

    @Test
    public void hasName(){
        assertEquals("Dragon", rollercoster.getName());
    }

    @Test
    public void isAllowed() {
        assertEquals(true, rollercoster.isAllowedTo(visitor));
    }

    @Test
    public  void hasDefaultPrice() {
        assertEquals(8.40, rollercoster.defaultPrice(),2);
    }

    @Test
    public void hasPriceFor() {
    assertEquals(16.80, rollercoster.priceFor(visitor));
    }

}
