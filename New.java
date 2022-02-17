package lab21;

import java.util.Scanner;

class Employee1
{
	int base,da,har;
	float Sal,dab,hb,sal;
	void display()
	{
		System.out.println(" name of class is Employee");
	}
	void calcSalary()
	{
	dab=(base*da/100);
	hb=(base*har/100);
	Sal=base+dab+hb;
	
	
	
		
		System.out.println("Gross salary of Empolyee"+Sal);
		
	
}
}

class Engineer1 extends Employee1
{
	
void display()
{
	super.display();
	super.calcSalary();

	System.out.println("name of class is Engineer ");
}
void calcSalary()
{
	//super.display();
	//super.calcSalary();
	//System.out.println("Gross salary of engineer");
	System.out.println("Gross salary of engineer"+Sal*2);
}
}

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Engineer1 E=new Engineer1();
		System.out.println("Enter the basic salary of Employee");
		E.base=sc.nextInt();
		System.out.println("Enter the DA of employee");
		E.da=sc.nextInt();
		System.out.println("Enter the HAR of employee");
		E.har=sc.nextInt();
		
		E.display();
		E.calcSalary();
			

	}



	}


