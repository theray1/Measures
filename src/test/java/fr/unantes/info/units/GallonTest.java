package fr.unantes.info.units;

import fr.unantes.info.units.Gallon;
import fr.unantes.info.units.Litre;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GallonTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

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
