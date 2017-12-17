package fr.unantes.info.units;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

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
        assertThat(m1).isNotEqualTo(new Length(1.0));

    }

    @Test
    public void testAdd() {
        Meter m0 = new Meter(0);
        assertThat(m0.add(m0)).isEqualTo(new Meter(0));
    }
}