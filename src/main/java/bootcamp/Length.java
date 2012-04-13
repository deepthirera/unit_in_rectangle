package bootcamp;

public enum Length implements Unit{
    INCHES(1),
    FEET(12),
    CM(2.0/5),
    MM(2.0/50);

    final private double inInches;

    Length(double inInches) {
        this.inInches = inInches;
    }

    public double toDouble(){
        return this.inInches;
    }
}
