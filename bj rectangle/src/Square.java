public class Square extends Rectangle
{
	
	public Square(Length length)
	{
		super(length,length);
	}
	public String toString()
	{
	return "Square(length="+super.getArea()+")";	
	}

}