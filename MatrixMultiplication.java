package lab21;
import java.util.*;
public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the matixA row");
		int row=sc.nextInt();
		System.out.println("enter the matixA column");
		int column=sc.nextInt();
		System.out.println("enter the matixB row1");
		int row1=sc.nextInt();
		System.out.println("enter the matixB column1");
		int column1=sc.nextInt();
		
		if(row!=column1)
		{
			System.out.println("matrix multiplication is not possible");
		}
		else
		{
			int a[][]=new int[row][column];
			int b[][]=new int[row1][column1];
			int c[][]=new int[row][column1];
		}
		System.out.println("enter the matixA");
for(int i=0;i<row;i++)
{
for(int j=0;j<column;j++)
{
	 a[i][j]=sc.nextInt();
}

	}
System.out.println("enter the matixB");
for(int i=0;i<row1;i++)
{
for(int j=0;j<column1;j++)
{
	 b[i][j]=sc.nextInt();
}

	}
System.out.println("the matrix mutiplication is");
for(int i=0;i<row;i++)
{
	for(int j=0;j<column1;j++)
	{
		 c[i][j]=0;
	}
}
for(int k=0;k<column;k++)
{
	c[i][j]+=a[i][k]*b[k][j];
}
System.out.print(c[i][j]+"");
	}
	System.out.println();
}
}


