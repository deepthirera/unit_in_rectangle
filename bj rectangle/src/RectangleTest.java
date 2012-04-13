import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RectangleTest {

	@Test
	public void testGenericConvert() {

		Length l1 = new Centimeter(200);
		Length l2 = new Meter(2);
		assertEquals(l1.equals(l2), true);
	}
	
	@Test
	public void testAreaOfRectangle()
	{
		Meter lenght=new Meter(1);
		Meter breadth=new Meter(2);
		Rectangle rectangle =new Rectangle(lenght,breadth);
		Length ans=new Length(2000000);
		assertEquals(rectangle.getArea(),ans);
		
	}
	 @Test
	 public void testPerimeter()
	 {
		 Meter lenght=new Meter(1);
			Meter breadth=new Meter(2);
			Rectangle rectangle =new Rectangle(lenght,breadth);
			Length ans=new Length(6000);
			assertEquals(rectangle.getPerimeter(),ans);
	 }
}
