package fr.unantes.info.units;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FootTest {

	@Test
	public void testEqualsObject() {
		Foot f1 = new Foot(1.0);
		assertEquals(f1, f1);
		assertNotEquals(null, f1);
	}

	@Test
	public void testToMeter() {
		Foot foot = new Foot(1);
		Meter m = new Meter(0.3048);
		assertEquals(foot.toMeter(), m);
	}

	@Test
	public void testToInch() {
		Foot f = new Foot(1);
		Length i = new Inch(12);
		assertEquals(f.toInch(), i);
	}

	@Test
	public void testEqualsFoot() {
		Foot f1 = new Foot(1);
		Foot f2 = new Foot(1);
		assertEquals(f2, f1);
	}

	@Test
	public void testNotEqualsFoot() {
		Foot f1 = new Foot(1);
		Foot f2 = new Foot(2);
		assertNotEquals(f2, f1);
	}

	@Test
	public void testToFoot() {
		Foot f1 = new Foot(1);
		assertEquals(f1.getValue(), f1.toFoot().getValue());
	}

	@Test
	void testNotEqualsSameValueDifferentUnits() {
		Foot f1 = new Foot(1);
		Meter m1 = new Meter(1);

		assertNotEquals(f1, m1);
	}

}
