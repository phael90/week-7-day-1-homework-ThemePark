import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {
    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(20, 180, 200.00);
    }

    @Test
    public void hasAge(){
        assertEquals(20, visitor.getAge());
    }

    @Test
    public void

}
