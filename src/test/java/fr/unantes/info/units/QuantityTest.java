package fr.unantes.info.units;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void testEqualsWithNullOther() {
        class Dummy extends Quantity{

            protected Dummy(double d) {
                super(d);
            }

            public boolean equals(Object other) {
                return super.equals(other);
            }
        }

        Dummy dummy = new Dummy(5);

        assertFalse(dummy.equals(null));
    }

    @Test
    public void testEqualsWithOtherNotAQuantity() {
        class Dummy extends Quantity{

            protected Dummy(double d) {
                super(d);
            }

            public boolean equals(Object other) {
                return super.equals(other);
            }
        }

        Dummy dummy = new Dummy(5);

        assertFalse(dummy.equals("Simple Test String"));
    }

}
