package fr.unantes.info.units;

import java.util.Objects;

public class Gallon {

	double val;
	
	public Gallon(double d) {
		val = d;
	}
	
	public Litre toLitre() {
		return new Litre(4.546);
	}
	
	public boolean equals(Object o) {
		if (Objects.isNull(o)) return false;
				
		if (o instanceof Gallon) {
			Gallon other = (Gallon) o;
			return val == other.val;
		}
		return false;
	}
	
}
