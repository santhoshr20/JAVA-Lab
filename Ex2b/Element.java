//Number of non repeated elements

import java.util.Scanner;
class Calc
{
	public int count(int a[],int n)
	{
		int i,j,flag=0,count=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
					continue;
				else if(a[i]==a[j])
				{
					flag=1;
					break;
				}
				else
					flag=0;
			}
			if(flag==0)
				count++;
		}
		return count;
	}
}
		
public class Element
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Calc A=new Calc();
		int i,j,n,count;
		System.out.print("Enter the numbers of elements : ");
		n=scan.nextInt();
		int a[] = new int[n];
		System.out.print("Enter the numbers : \n");
		for(i=0;i<n;i++)
			a[i]=scan.nextInt();
		count = A.count(a,n);
		System.out.println("Number of non repeated elements = "+count);
	}
}

/*
Output:

Enter the numbers of elements : 5
Enter the numbers :
1
2
3
4
3
Number of non repeated elements = 3

*/