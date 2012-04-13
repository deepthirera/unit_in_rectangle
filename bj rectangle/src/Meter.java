public class Meter extends Length {

	public Meter(int value) {
		super(value * 1000);
	}

	public String toString() {
		return super.getValue() / 1000 + " meter";
	}

}