import Stalls.TobaccoStall;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {
    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Tobacco Shop", "Tony", 3);
        visitor = new Visitor("Donald",20, 180, 200.00);
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

    @Test
    public void isAllowed(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }
}
