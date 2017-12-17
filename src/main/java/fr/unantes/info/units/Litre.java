package fr.unantes.info.units;

import java.util.Objects;

public class Litre {
	double val;
	
	public Litre(double d) {
		val = d;
	}
	
	public Gallon toGallon() {
		return new Gallon(val/4.546);
	}
	
	public boolean equals(Object o) {
		if (Objects.isNull(o)) return false;
				
		if (o instanceof Litre) {
			Litre other = (Litre) o;
			return val == other.val;
		}
		return false;
	}
	
	
}
