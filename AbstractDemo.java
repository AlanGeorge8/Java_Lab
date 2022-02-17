package lab21;
abstract class shape
{
	abstract void numberOfSides();
}
class Rectangle extends shape
{
	void numberOfSides()
	{
		System.out.println("I have 4 sides");
	}
}
class Triangle extends shape
{
	void numberOfSides()
	{
		System.out.println("I have 3 sides");
	}
}
class Hexagon extends shape
{
	void numberOfSides()
	{
		System.out.println("I have 6 sides");
	}
}


public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle  c=new Rectangle  ();
		c.numberOfSides();
		Triangle  b=new Triangle ();
		b.numberOfSides();
		Hexagon a=new Hexagon();
		a.numberOfSides();
		
	

	}

}
