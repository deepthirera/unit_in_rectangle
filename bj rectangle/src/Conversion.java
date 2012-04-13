public class Conversion {

	public static Centimeter toCentimeter(Length val) {
		Centimeter a = new Centimeter(val.getValue());
		return a;

	}

	public static Meter tometer(Length val) 
	{
		Meter a = new Meter(val.getValue());
		return a;

	}
}
/*@Test
public void testConvert_m_to_cm() 
{
	Meter mtr = new Meter(5);
	//int n= mtr.getvalue();
	//mtr.ConvertProc(n, 10);
	assertEquals(mtr.ConvertProctolower(mtr.getvalue(), 10), 500);
}

@Test
public void testConvert_cm_to_m() {
	Centimeter cm = new Centimeter(500);
	//1cm.ConvertProc(n, 1000);
	assertEquals(cm.ConvertProctolower(cm.getvalue(), 1000), 5);

}*/