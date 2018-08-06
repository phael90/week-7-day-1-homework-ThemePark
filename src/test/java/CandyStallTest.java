import Stalls.CandyFloss;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyStallTest {
    CandyFloss candyFloss;

    @Before
    public void before(){
        candyFloss = new CandyFloss("CandyLand", "Digory", 2);
    }

    @Test
    public void hasName(){
        assertEquals("CandyLand", candyFloss.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Digory", candyFloss.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(2, candyFloss.getParkingSpot());
    }

    @Test
    public  void hasDefaultPrice() {
        assertEquals(4.20, candyFloss.defaultPrice());
    }
}
