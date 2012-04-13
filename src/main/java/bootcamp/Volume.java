package bootcamp;

public enum Volume implements Unit{
    GALLON (1),
    LITERS (1/3.78);
    private final double inGallons;

    Volume (double inGallons) {
        this.inGallons = inGallons;
    }

    public double toDouble() {
        return inGallons;
    }
}
