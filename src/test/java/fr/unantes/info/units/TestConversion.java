package fr.unantes.info.units;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestConversion {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConvertMeters2Foot() {
		Foot foot = new Foot(1);
		Meter cm = new Meter(0.3048);
		
		assert foot.equals(cm.toFoot());
	}


	
	@Test
	public void testConvertMeterToInch() {
		Length i = new Inch(12);
		Meter m = new Meter(0.3048);
		
		assert i.equals(m.toInch());
		
	}

	@Test
	public void testConvertInchToMeter() {
		Inch i = new Inch(12);
		Meter m = new Meter(0.3048);
		
		assert m.equals(i.toMeter());
	}
	

	
	@Test
	public void testConvertInchToFoot() {
		Foot f = new Foot(1);
		Inch i = new Inch(12);
		
		assert f.equals(i.toFoot());
	}
	
	@Test
	public void testEqualsFoot() {
		Foot f1 = new Foot(1);
		Foot f2 = new Foot(1);
		
		assert f1.equals(f2);
	}
	
	@Test
	public void testNotEqualsFoot() {
		Foot f1 = new Foot(1);
		Foot f2 = new Foot(2);
		
		assert !(f1.equals(f2));
	}
	
	@Test
	public void testEqualsMeter() {
		Meter m1 = new Meter(1);
		Meter m2 = new Meter(1);
		
		assert m1.equals(m2);
	}
	
	@Test
	public void testNotEqualsMeter() {
		Meter m1 = new Meter(1);
		Meter m2 = new Meter(2);
		
		assert !(m1.equals(m2));
	}
	
	@Test
	public void testEqualsInch() {
		Length i1 = new Inch(1);
		Length i2 = new Inch(1);
		
		assert i1.equals(i2);
	}
	@Test
	public void testNotEqualsInch() {
		Length i1 = new Inch(1);
		Length i2 = new Inch(2);
		
		assert !(i1.equals(i2));
	}
}
