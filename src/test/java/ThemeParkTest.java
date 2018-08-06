import Attractions.Attraction;
import Attractions.Rollercoster;
import ThemeParks.ThemePark;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    Visitor visitor;
    Attraction attraction;

    @Before
    public void before(){
        themePark = new ThemePark();
        visitor = new Visitor("Donald",20, 180, 200.00);
        attraction = new Rollercoster("Dragon");
    }

    @Test
    public void canVisitorVisitAttraction(){
        assertEquals("Donald visited Dragon", themePark.visit(visitor, attraction));
    }
}
