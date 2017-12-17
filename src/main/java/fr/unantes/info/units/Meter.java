package fr.unantes.info.units;

import edu.umd.cs.findbugs.annotations.NonNull;

public class Meter extends Length {
	
	public Meter(double i) {
		super(i);
	}
	
	public Foot toFoot() {
		return new Foot(1);
	}
	
	public Length toInch() {
		return new Inch(12);
	}

	public Meter add(@NonNull Meter other) {
		return new Meter(this.length + other.length);
	}

	public boolean equals(Object o) {
		return super.equals(o) && (o instanceof Meter);
	}
}
