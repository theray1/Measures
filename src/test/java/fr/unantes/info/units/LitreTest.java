package fr.unantes.info.units;

import java.util.Random;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LitreTest {


	@Test
	public void testToGallon() {
		Litre litre = new Litre(4.546);
		Gallon gallon = new Gallon(1);
		assertEquals(litre.toGallon(),gallon);
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
