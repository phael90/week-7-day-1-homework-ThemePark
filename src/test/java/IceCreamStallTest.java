import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {
    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("The Mountain", "Ricardo", 1);
    }

    @Test
    public void hasName(){
        assertEquals("The Mountain",iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Ricardo", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(1, iceCreamStall.getParkingSpot());
    }

    @Test
    public  void hasDefaultPrice() {
        assertEquals(2.80, iceCreamStall.defaultPrice(),2);
    }


}
