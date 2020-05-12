//Matrix calculation	
import java.util.Scanner;
public class Matrix
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Calc A=new Calc();
		int i,j;
		char ch='y';
		System.out.println("Enter n value : ");
		int n=scan.nextInt();
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		int sum[][]=new int[n][n];
		int diff[][]=new int[n][n];
		int pro[][]=new int[n][n];
		System.out.print("Enter the matrix A:\n");
		A.input(a,n);
		System.out.print("Enter the matrix B:\n");
		A.input(b,n);
		
		while(ch=='Y'||ch=='y')
		{
			System.out.print("Enter\n1.Add\n2.Subtract\n3.Multiply");
			int choice=scan.nextInt();
			switch(choice)
			{
				case 1:
					A.add(a,b,sum,n);
					break;
				case 2:
					A.diff(a,b,diff,n);
					break;
				case 3:
					A.pro(a,b,pro,n);
					break;
				default:
					System.out.print("Enter a valid input");
					break;
			}
			System.out.print("Do you want to continue?(Y/N): ");
			ch=scan.next().charAt(0);
		}
	}
}

class Calc
{
	public static void input(int a[][],int n)
	{
		Scanner scan=new Scanner(System.in);
		int i,j;
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
			{
			
				a[i][j]=scan.nextInt();
			}
	}
	
	public void add(int a[][],int b[][],int sum[][],int n)
	{
		int i,j;
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		System.out.print("Sum MAtrix\n");	
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}
					
	public void diff(int a[][],int b[][],int diff[][],int n)
	{
		int i,j;
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
			{
				diff[i][j]=a[i][j]-b[i][j];
			}
			
		System.out.print("Difference MAtrix\n");	
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(diff[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public void pro(int a[][],int b[][],int pro[][],int n)
	{
		int i,j,k;
		
		for(i=0;i<n;i++)
		{	
			for(j=0;j<n;j++)
			{
				pro[i][j]=0;
				for(k=0;k<n;k++)
				{
					pro[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		System.out.print("Product MAtrix\n");	
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(pro[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}

/*
Output:
Enter n value : 
2
Enter the matrix A:
1
2
3
4
Enter the matrix B:
4
3
2
1
Enter
1.Add
2.Subtract
3.Multiply1
Sum MAtrix
5	5	
5	5	
Do you want to continue?(Y/N): Y
Enter
1.Add
2.Subtract
3.Multiply2
Difference MAtrix
-3	-1	
1	3	
Do you want to continue?(Y/N): Y
Enter
1.Add
2.Subtract
3.Multiply3
Product MAtrix
8	5	
20	13	
Do you want to continue?(Y/N): N
*/
