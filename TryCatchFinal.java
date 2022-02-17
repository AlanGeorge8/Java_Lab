package lab21;
import java.util.*;
public class TryCatchFinal {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("program to perform division");
System.out.println("enter number1");
int n1=sc.nextInt();
System.out.println("enter number2");
int n2=sc.nextInt();
int b;
b=n1/n2;
System.out.println("result="+b);
System.out.println("end of program");
System.out.println("do you want to continue y or n");
String ch=sc.next();
//char ch2='y';
//char ch='y';
//if (ch==y)
//switch(ch)
{
System.out.println("program to perform division");
	System.out.println("enter number1");
	int n3=sc.nextInt();
	System.out.println("enter number2");
	int n4=sc.nextInt();
	int c;
	try
	{
	c=n3/n4;	
	}
	catch(Exception e)
	{
		System.out.println("/by zero");
	}
	System.out.println("do you want to continue y or n");
	String ch1=sc.next();
	
}
	}
}



