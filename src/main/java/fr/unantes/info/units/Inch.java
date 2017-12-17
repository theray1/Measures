package fr.unantes.info.units;

public class Inch extends Length {
	
	public Inch (double d) {
		super(d);
	}
	
	public Meter toMeter() {
		
		return new Meter(0.3048);
	}
	
	public Foot toFoot() {
		
		return new Foot(1);
	}
	
	public boolean equals(Object o) {
		return super.equals(o) && (o instanceof Inch);
	}
}
