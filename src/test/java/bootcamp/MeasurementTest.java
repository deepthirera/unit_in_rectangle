package bootcamp;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static bootcamp.Length.*;
import static bootcamp.Volume.*;

public class MeasurementTest {

    @Test
    public void should_compare_like_units() {
        Measurement a = new Measurement<Length>(13, INCHES);
        Measurement b   = new Measurement<Length>(13, INCHES);
        assertThat(a.compareTo(b), equalTo(0));

    }

    @Test
    public void should_compare_inches_and_feet() {
        Measurement inches = new Measurement<Length>(13, INCHES);
        Measurement feet   = new Measurement<Length>(2, FEET);
        assertThat(inches.compareTo(feet), equalTo(1));
        assertThat(feet.compareTo(inches), equalTo(-1));
    }
    
    @Test
    public void should_compare_equal_measurements() {
        assertThat(new Measurement<Length>(12, INCHES)
        .compareTo(new Measurement<Length>(1, FEET)),
        equalTo(0));
    }

    @Test
    public void should_compare_inches_and_centimeters() {
        Measurement inches        = new Measurement<Length>(5, INCHES);
        Measurement centimeters   = new Measurement<Length>(12.5, CM);
        assertThat(inches.compareTo(centimeters), equalTo(0));
    }

    @Test
    public void should_compare_centimeters_and_millimeters() {
        Measurement millimeter    = new Measurement<Length>(10, MM);
        Measurement centimeters   = new Measurement<Length>(1, CM);
        assertThat(millimeter.compareTo(centimeters), equalTo(0));
    }

    @Test
    public void should_compare_gallons_and_liters() {
        Measurement gallon = new Measurement<Volume>(1, GALLON);
        Measurement litre  = new Measurement<Volume>(3.78, LITERS);
        assertThat(gallon.compareTo(litre), equalTo(0));
    }


    @Test
    public void should_add_two_measurements(){
        assertTrue((new Measurement<Length>(2, INCHES).add(new Measurement<Length>(2, INCHES))).equals(new Measurement<Length>(4, INCHES)));
        assertTrue((new Measurement<Length>(4, INCHES).add(new Measurement<Length>(5, CM))).equals(new Measurement<Length>(6, INCHES)));
        assertTrue( new Measurement<Volume>(1, LITERS).add(new Measurement<Volume>(1, GALLON)).equals(new Measurement<Volume>(4.78, LITERS)));
        assertTrue((new Measurement<Length>(12, FEET).add(new Measurement<Length>(12, FEET))).equals(new Measurement<Length>(24, FEET)));
//        assertFalse((new Measurement<Volume>(1, GALLON).add(new Measurement<Length>(1, INCHES))).equals(new Measurement<Volume>(2, GALLON)));
    }
}
