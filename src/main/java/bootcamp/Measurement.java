package bootcamp;

import java.text.DecimalFormat;

public class Measurement<Dimension extends Unit> {

    private final double baseValue;
    private Dimension unit;

    public Measurement(double length, Dimension unit) {
        this.baseValue = length * unit.toDouble();
        this.unit = unit;
    }

    public int compareTo(Measurement other) {
        if (other.baseValue == this.baseValue) return 0;
        return this.baseValue < other.baseValue ? 1 : -1;
    }

    public Measurement add(Measurement<Dimension> otherMeasurement) {
        double resultValue;
        resultValue = new Double(new DecimalFormat().format((otherMeasurement.baseValue + this.baseValue)/this.unit.toDouble()));
        return new Measurement<Dimension>(resultValue, this.unit);
    }
    
    @Override
    public boolean equals(Object otherMeasurement) {
        if(this == otherMeasurement) return true;
        if(otherMeasurement == null || !(otherMeasurement instanceof Measurement)) return false;
        return(((Measurement)otherMeasurement).baseValue == this.baseValue && ((Measurement)otherMeasurement).unit == this.unit);
    }
}
