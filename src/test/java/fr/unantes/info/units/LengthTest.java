package fr.unantes.info.units;

import org.junit.jupiter.api.Test;

/**
 * Created on 15/12/2017.
 *
 * @author AtlanMod team.
 */
public class LengthTest {

    @Test
    public void equals() {

        Length dt = new Length(12.0);

        dt.equals(null);
        dt.equals(dt);
        dt.equals(this);

    }
}