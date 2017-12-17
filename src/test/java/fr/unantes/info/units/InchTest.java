package fr.unantes.info.units;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

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
        assertThat(inch1).isEqualTo(inch1);
        assertThat(inch1).isNotEqualTo(null);
        assertThat(inch1).isNotEqualTo(this);
        assertThat(inch1).isNotEqualTo(new Length(1  ));

    }
}