import Attractions.Rollercoster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercosterTest {
    Rollercoster rollercoster;

    @Before
    public void before(){
        rollercoster = new Rollercoster("Dragon");
    }

    @Test
    public void hasName(){
        assertEquals("Dragon", rollercoster.getName());
    }
}
