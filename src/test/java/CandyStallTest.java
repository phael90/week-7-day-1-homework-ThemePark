import Stalls.CandyFloss;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyStallTest {
    CandyFloss candyFloss;

    @Before
    public void before(String name, String ownerName, int parkingSpot){
        candyFloss = new CandyFloss("CandyLand", "Digory", 2);
    }

    @Test
    public void hasName(){
        assertEquals("CandyLand", candyFloss.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Digory", candyFloss.getName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(2, candyFloss.getParkingSpot());
    }
}
