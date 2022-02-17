package lab21;
 import java.util.*;
class Area
{
	void area (double a,double b)
	{
		double triangle=(a+b)/2;
		System.out.println("area of triangle"+triangle);
	}
	void area(int a,int b)
	{
		int rectangle=a*b;
		System.out.println("area of rectangle"+rectangle);
	}
	void area(double a)
	{
		double circle=3.14*a*a;
		System.out.println("area of circle"+circle);
	}
}

public class MethodOverloading {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Area ob=new Area();
		System.out.println("enter the height triangle");
		double he=sc.nextDouble();
		System.out.println("enter the base of triangle");
		double be=sc.nextDouble();
		ob.area(he,be);
		System.out.println("enter the length rectangle");
		int le=sc.nextInt();
		System.out.println("enter the breadth of rectangle");
		int ba=sc.nextInt();
		ob.area(le,ba);
		System.out.println("enter the radius of circle");
		double ra=sc.nextDouble();
		ob.area(ra);
	}
		
		
		

	}


