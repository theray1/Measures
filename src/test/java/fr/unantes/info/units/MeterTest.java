package fr.unantes.info.units;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Created on 15/12/2017.
 *
 * @author AtlanMod team.
 */
public class MeterTest {

    private Meter m1 = new Meter(1);

    @Test
    public void toFoot() {
    }

    @Test
    public void toInch() {
    }

    @Test
    public void equals() {
        assertNotEquals(new Length(1.0),m1);

    }

    @Test
    public void testAdd() {
        Meter m0 = new Meter(0);
        assertEquals(new Meter(0),m0.add(m0));
    }
}