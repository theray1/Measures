package fr.unantes.info.units;

public class Foot extends Length {

	public Foot(double i) {
		super(i);
	}
	
	public Meter toMeter() {
		return new Meter(0.3048);
	}
	
	public Length toInch() {
		
		return new Inch(12);
	}
	
	public boolean equals(Object o) {
		return super.equals(o) && (o instanceof Foot);
	}
}
