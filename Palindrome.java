package lab21;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String ob=sc.nextLine();
ob=ob.toLowerCase();
 String revob="";
 char ch;

	 
 for(int i=0;i<ob.length();i++)
 {
	 ch=ob.charAt(i);
	 revob=ch+revob;
 }


 
 if(ob.equals(revob))
 {
	 System.out.println("string is palindrome");
	}
 else
 {
	 System.out.println("string is not palindrome");
}
	}
}

