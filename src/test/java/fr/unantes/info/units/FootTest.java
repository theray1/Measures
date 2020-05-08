package fr.unantes.info.units;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FootTest {

	@Test
	public void testEqualsObject() {
		Foot f1 = new Foot(1.0);

		assertThat(f1).isEqualTo(f1);
		assertThat(f1).isNotEqualTo(new Length(1));
		assertThat(f1).isNotEqualTo(null);

	}

	@Test
	public void testToMeter() {
		Foot foot = new Foot(1);
		Meter m = new Meter(0.3048);

		assert m.equals(foot.toMeter());
	}

	@Test
	public void testToInch() {
		Foot f = new Foot(1);
		Length i = new Inch(12);

		assert i.equals(f.toInch());
	}

}
