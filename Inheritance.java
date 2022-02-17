package lab21;
import java.util.*;
class Employee
{
	String name, phoneno, address;
	int age,salary;
	void printsalary()
	{
		System.out.println("salary"+salary);
	}

class officer extends Employee
{
	String specialization;
}
class manager extends Employee
{
	String department;
}
}


public class Inheritance {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
	  
		System.out.println("name of officer");
		String a=sc.nextLine();
		
		System.out.println("age of officer");
		int b=sc.nextInt();
		System.out.println("phoneno of officer");
		int c=sc.nextInt();
		System.out.println("address of officer");
		String d=sc.next(); 
		System.out.println("specialization");
		String i=sc.next();
		System.out.println("salary of officer");
		int j=sc.nextInt();
		
		System.out.println("name of manager");
		String e=sc.next();
		System.out.println("age of manager");
		int f=sc.nextInt();
		System.out.println("phoneno of manager");
		int g=sc.nextInt();
		System.out.println("address of manager");
		String h=sc.next();
		System.out.println("department");
		String k=sc.next();
		System.out.println("salary of officer");
		int l=sc.nextInt();
		
		System.out.println("name of officer     :"+a);
		System.out.println("age of officer      :"+b);
		System.out.println("phoneno of officer  :"+c);
		System.out.println("address of officer  :"+d);
		System.out.println("specialization      :"+i);
		System.out.println("salary of officer   :"+j);
		System.out.println("name of manager     :"+e);
		System.out.println("age of manager      :"+f);
		System.out.println("phoneno of manager  :"+g);
		System.out.println("address of manager  :"+h);
		System.out.println("department          :"+k);
		System.out.println("salary of officer   :"+l);
	}

}
