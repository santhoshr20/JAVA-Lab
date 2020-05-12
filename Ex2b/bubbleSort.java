//Sorting
import java.util.Scanner;
class Calc<T>
{
	public int a[]=new int[100];
	public int n;
	public void sort(int a[])
	{
		int i,j,temp;
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the Elements");
		for(i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		
		System.out.println("Sorted\n");
		for(i=0;i<n-1;i++)
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
	}
	
	public void print(int a[])
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}

public class bubbleSort
{
	public static void main(String args[])
	{
		Calc A= new Calc();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the no. of elements: ");
		A.n=scan.nextInt();
		A.sort(A.a);
		A.print(A.a);
	}
}
	

/*
Output:
Enter the no. of elements: 6
Enter the Elements
7
6
5
4
3
2
Sorted

2
3
4
5
6
7

*/
