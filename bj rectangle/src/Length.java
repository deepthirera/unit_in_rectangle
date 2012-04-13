public class Length extends Unit {
	public Length(int value) {
		super(value);
	}

	public int ConvertProctolower(int genericValue, int divideValue) {
		return genericValue / divideValue;
	}

	public Length multiply(Length b) {
		Length l = new Length((b.getValue()) * this.getValue());
		return l;
	}

	public Length add(Length b) {
		Length l = new Length((b.getValue()) + this.getValue());
		return l;
	}

	public Length multiplyByConstant(int cons, Length b) {
		Length l = new Length((b.getValue() * cons));
		return l;
	}

	public String toString() {
		return value + " length units";
	}

public boolean equals(Object o) {
		if (!(o instanceof Length))
			return false;
		Length a = (Length) o;
		return this.getValue() == a.getValue();
	}


}