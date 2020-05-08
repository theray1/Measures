package fr.unantes.info.units;

import org.junit.jupiter.api.Test;

import fr.unantes.info.units.Gallon;
import fr.unantes.info.units.Litre;

public class GallonTest {

	@Test
	public void testToLitre() {
		Gallon g = new Gallon(1);
		Litre l = new Litre(4.546);

		assert l.equals(g.toLitre());

	}

	@Test
	public void testEquals() {
		Gallon g1 = new Gallon(1);
		Gallon g2 = new Gallon(1);

		assert g1.equals(g2);
	}

	@Test
	public void testNotEquals() {
		Gallon g1 = new Gallon(1);
		Gallon g2 = new Gallon(2);

		assert !(g1.equals(g2));

	}

	@Test
	public void testEqualsToNull() {
		Gallon g1 = new Gallon(1);
		g1.equals(null);
		g1.equals(this);

	}

}
