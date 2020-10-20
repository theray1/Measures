package fr.unantes.info.units;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestConversion {


	@Test
	public void testConvertMeters2Foot() {
		Foot foot = new Foot(1);
		Meter cm = new Meter(0.3048);
		assertEquals(cm.toFoot(),foot);
	}


	
	@Test
	public void testConvertMeterToInch() {
		Length i = new Inch(12);
		Meter m = new Meter(0.3048);
		assertEquals(m.toInch(),i);	
	}

	@Test
	public void testConvertInchToMeter() {
		Inch i = new Inch(12);
		Meter m = new Meter(0.3048);
		assertEquals(i.toMeter(),m);
	}
	

	
	@Test
	public void testConvertInchToFoot() {
		Foot f = new Foot(1);
		Inch i = new Inch(12);
		assertEquals(i.toFoot(),f);
	}
	
	@Test
	public void testEqualsFoot() {
		Foot f1 = new Foot(1);
		Foot f2 = new Foot(1);
		assertEquals(f2,f1);
	}
	
	@Test
	public void testNotEqualsFoot() {
		Foot f1 = new Foot(1);
		Foot f2 = new Foot(2);
		assertNotEquals(f2,f1);
	}
	
	@Test
	public void testEqualsMeter() {
		Meter m1 = new Meter(1);
		Meter m2 = new Meter(1);
		assertEquals(m2,m1);
	}
	
	@Test
	public void testNotEqualsMeter() {
		Meter m1 = new Meter(1);
		Meter m2 = new Meter(2);
		assertNotEquals(m2,m1);
	}
	
	@Test
	public void testEqualsInch() {
		Length i1 = new Inch(1);
		Length i2 = new Inch(1);
		assertEquals(i2,i1);
    }
    
	@Test
	public void testNotEqualsInch() {
		Length i1 = new Inch(1);
		Length i2 = new Inch(2);
		assertNotEquals(i2,i1);
	}
}
