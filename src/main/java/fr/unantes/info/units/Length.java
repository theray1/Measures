package fr.unantes.info.units;

public class Length {

	protected final double length;

	public Length(double d) {
		this.length = d;
	}
	
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		
		if (! (o instanceof Length)) {
			return false;
		}
		
		Length other = (Length) o;
		return other.length == length;
	}
}
