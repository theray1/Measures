package fr.unantes.info.units;

import java.util.Random;

import fr.unantes.info.units.Gallon;
import fr.unantes.info.units.Litre;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class LitreTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

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
