import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {
    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor("Donald",20, 180, 200.00);
    }
    @Test
    public void hasName() { assertEquals("Donald", visitor.getName());}

    @Test
    public void hasAge(){
        assertEquals(20, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(180, visitor.getHeight());
    }

    @Test
    public void hadMoney(){
        assertEquals(200.00, visitor.getMoney(),2);
    }
}
