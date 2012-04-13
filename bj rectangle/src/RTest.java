import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class RTest {
	
	@Test
	public void testAreaOfRectangle()
	{
		Meter lenght=new Meter(1);
		Meter breadth=new Meter(2);
		Rectangle rectangle =new Rectangle(lenght,breadth);
		Meter ans=new Meter(2000);
		assertEquals(rectangle.getArea(),ans);
	}

}
