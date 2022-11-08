package fr.unantes.info.units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LitreTest {

	@Test
	public void testToGallon() {
		Litre litre = new Litre(4.546);
		Gallon gallon = new Gallon(1);
		assertEquals(litre.toGallon(), gallon);
	}

	@Test
	public void testNotEqual() {
		Litre litre = new Litre(15);

		litre.equals("15");
		litre.equals(null);
		litre.equals(litre);
		litre.equals(new Litre(10));
	}

	@Test
	public void testToLitre() {
		Litre l1 = new Litre(1);
		assertEquals(l1.getValue(), l1.toLitre().getValue());
	}

	@Test
	public void testEqualsLitre() {
		//Should be split into two or more tests
		Litre l0 = new Litre(5);
		Litre l1 = new Litre(5);
		Litre l2 = new Litre(4);

		assertTrue(l0.equals(l1));
		assertFalse(l0.equals(l2));
	}

}
