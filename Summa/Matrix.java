import java.util.Scanner;
public class Matrix
{
	public static void main(String args[])
	{
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int sum[][]=new int[3][3];
		int diff[][]=new int[3][3];
		int pro[][]=new int[3][3];
		int i,j;
		char ch='y';
		System.out.print("Enter the matrix A:\n");
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			{
				Scanner scan1=new Scanner(System.in);
				a[i][j]=scan1.nextInt();
			}
			
		System.out.print("Enter the matrix B:\n");
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			{
				Scanner scan1=new Scanner(System.in);
				b[i][j]=scan1.nextInt();
			}
		
		while(ch=='Y'||ch=='y')
		{
			Scanner scan=new Scanner(System.in); 
			System.out.print("Enter\n1.Add\n2.Subtract\n3.Multiply\n4.Exit");
			int choice=scan.nextInt();
			switch(choice)
			{
				case 1:
					add(a,b,sum);
					break;
				case 2:
					diff(a,b,diff);
					break;
				case 3:
					pro(a,b,pro);
					break;
				case 4:
					System.out.print("Thanks\n");
					break;
				default:
					System.out.print("Enter a valid input");
					break;
			}
			/*System.out.print("Do you want to continue?(Y/N): ");
			Scanner scan3= new Scanner(System.in);
			ch=scan3.nextChar();*/
		}
	}
	public static void add(int a[][],int b[][],int sum[][])
	{
		int i,j;
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		System.out.print("Sum MAtrix\n");	
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}
					
	public static void diff(int a[][],int b[][],int diff[][])
	{
		int i,j;
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			{
				diff[i][j]=a[i][j]-b[i][j];
			}
			
		System.out.print("Difference MAtrix\n");	
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(diff[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void pro(int a[][],int b[][],int pro[][])
	{
		int i,j,k;
		 
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				pro[i][j]=1;
		
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				for(k=0;k<3;k++)
				{
					pro[i][j]*=a[i][k]+b[k][j];
				}
		System.out.print("Product MAtrix\n");	
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(pro[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}