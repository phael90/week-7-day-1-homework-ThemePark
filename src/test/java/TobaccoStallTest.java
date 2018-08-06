import Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {
    TobaccoStall tobaccoStall;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Tobacco Shop", "Tony", 3);
    }

    @Test
    public void hasName(){
        assertEquals("Tobacco Shop", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Tony", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(3, tobaccoStall.getParkingSpot());
    }
}
