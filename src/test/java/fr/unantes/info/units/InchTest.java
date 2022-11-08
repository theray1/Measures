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

    @Test
    public void testToInch() {
        Inch i1 = new Inch(1);
        assertEquals(i1.getValue(), i1.toInch().getValue());
    }

    @Test
    void testNotEqualsSameValueDifferentUnits() {
        Inch i1 = new Inch(1);
        Foot f1 = new Foot(1);

        assertNotEquals(i1, f1);
    }

    @Test
    void testNotsEqualsDifferentValuesDifferentUnits() {
        Inch i1 = new Inch(1);
        Foot f1 = new Foot(2);

        assertNotEquals(i1, f1);
        assertNotEquals(f1, i1);
    }

    @Test
    public void actualTestConvertInchToMeter() {
        Inch inch = new Inch(5);
        Meter meter = new Meter(0.127);

        assertEquals(meter, inch.toMeter());
    }

    @Test
    public void testConvertInchToFootWithNonOneValue() {
        Inch inch = new Inch(3);
        Foot foot = new Foot(0.25);

        assertEquals(foot, inch.toFoot());
    }
}