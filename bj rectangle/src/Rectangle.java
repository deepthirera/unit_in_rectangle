
public class Rectangle 
{
private Length length,breath;

public Rectangle(Length length,Length breath)
{
	this.length=length;
	this.breath=breath;
}

public Length getArea()
{
	return length.multiply(breath);
 
	
}

public Length getPerimeter(){
	
	Length ans=length.add(breath);
	return ans.multiplyByConstant(2,ans);
}

public String toString()
{
return "Rectangle(length="+length+"),(breadth="+breath;	
}

public static void main(String a[])
{
	Meter len=new Meter(1);
	Meter br=new Meter(2);
	System.out.println(len);
	Rectangle rectangle =new Rectangle(len,br);
	System.out.println(rectangle.getArea());
	System.out.println(rectangle.getPerimeter());
	
}

}


