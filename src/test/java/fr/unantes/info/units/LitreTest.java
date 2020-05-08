package fr.unantes.info.units;

import java.util.Random;

import org.junit.jupiter.api.Test;

import fr.unantes.info.units.Gallon;
import fr.unantes.info.units.Litre;

import static org.assertj.core.api.Assertions.*;

public class LitreTest {

	@Test
	public void testToGallon() {

		Litre litre = new Litre(4.546);
		Gallon gallon = new Gallon(1);

		assertThat(gallon).isEqualTo(litre.toGallon());

	}

	@Test
	public void testNotEqual() {
		Litre litre = new Litre(15);

		litre.equals("15");
		litre.equals(null);
		litre.equals(litre);
		litre.equals(new Litre(10));
	}

}
