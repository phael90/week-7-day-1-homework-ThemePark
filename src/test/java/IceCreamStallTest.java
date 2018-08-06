import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {
    IceCreamStall iceCreamStall;

    @Before
    public void before(String name, String ownerName, int parkingSpot){
        iceCreamStall = new IceCreamStall("The Mountain", "Ricardo", 1);
    }

    @Test
    public void hasName(){
        assertEquals("The Mountain",iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Ricardo", iceCreamStall.getownerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(1, iceCreamStall.getParkingSpot());
    }


}
