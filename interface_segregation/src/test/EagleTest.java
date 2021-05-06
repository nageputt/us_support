package test;

import org.junit.Test;

import interface_segregation.Eagle;

import static org.junit.Assert.assertEquals;

public class EagleTest {
    @Test
    public void testItCanFly() {
        Eagle eagle = new Eagle(5);
        eagle.fly();
        assertEquals("in the air", eagle.getCurrentLocation());
    }

    @Test
    public void testItLosesFeathers() {
        Eagle eagle = new Eagle(5);
        eagle.molt();
        assertEquals(4, eagle.getNumberOfFeathers());
    }
}
