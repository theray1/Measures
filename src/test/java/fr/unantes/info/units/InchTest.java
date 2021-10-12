package fr.unantes.info.units;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InchTest {

    private Inch inch1 = new Inch(1);

    @Test
    public void equals() {
        assertEquals(inch1, inch1);
        assertNotEquals(null, inch1);
        assertNotEquals(this, inch1);
    }

    @Test
    public void testConvertInchToMeter() {
        inch1.toMeter();
    }

    @Test
    public void testConvertInchToFoot() {
        inch1.toFoot();
    }

    @Test
    public void testEqualsInch() {
        Length i1 = new Inch(1);
        Length i2 = new Inch(1);
        assertEquals(i2, i1);
    }

    @Test
    public void testNotEqualsInch() {
        Length i1 = new Inch(1);
        Length i2 = new Inch(2);
        assertNotEquals(i2, i1);
    }
}