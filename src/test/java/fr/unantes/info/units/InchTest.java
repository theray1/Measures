package fr.unantes.info.units;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Created on 15/12/2017.
 *
 * @author AtlanMod team.
 */
public class InchTest {

    private Inch inch1 = new Inch(1);

    @Test
    public void toMeter() {
        inch1.toMeter();
    }

    @Test
    public void toFoot() {
        inch1.toFoot();
    }

    @Test
    public void equals() {
        assertEquals(inch1,inch1);
        assertNotEquals(null, inch1);
        assertNotEquals(this,inch1);
        assertNotEquals(inch1, new Length(1));
    }
}