
import java.util.Scanner;

class Gen
{
	public <T extends Comparable<T>> void sorting(T[] a)
	{
		int len;
		len=a.length;
		int i,j;
		T temp;
		for(i=0;i<len-1;i++)
		{
			for(j=i+1;j<len;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("\nSorted:");
		for(i=0;i<len;i++)
		{
			System.out.println(a[i]);
		}
	}
}

public class Sort
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Gen obj=new Gen();
		int ch=1;
		while(ch!=0)
		{
			System.out.println("\nEnter\n1.Integer\n2.Double\n3.String\n0.Exit");
			ch=scan.nextInt();
			switch(ch)
			{
				case 1:
				{
					System.out.print("Enter number of element : ");
					int n=scan.nextInt();
					Integer[] a=new Integer[n];
					System.out.println("\nEnter elements");
					for(int i=0;i<n;i++)
					{
						a[i]=scan.nextInt();
					}	
					obj.sorting(a);
					break;
				}
				
				case 2:
				{
					System.out.print("Enter number of element : ");
					int n=scan.nextInt();
					Double[] a=new Double[n];
					System.out.println("\nEnter elements");
					for(int i=0;i<n;i++)
					{
						a[i]=scan.nextDouble();
					}	
					obj.sorting(a);
					break;
				}
				case 3:
				{
					System.out.print("Enter number of element : ");
					int n=scan.nextInt();
					String[] a=new String[n];
					System.out.println("\nEnter elements");
					for(int i=0;i<n;i++)
					{
						a[i]=scan.next();
					}	
					obj.sorting(a);
					break;
				}
				case 0:
					System.out.println("Thank You");
					break;
				default:
					System.out.println("Invalid Input");
			}
		}
	}
}

/*
Output:
Enter
1.Integer
2.Double
3.String
0.Exit
1
Enter number of element : 3

Enter elements
3
2
4

Sorted:
2
3
4

Enter
1.Integer
2.Double
3.String
0.Exit
2
Enter number of element : 3

Enter elements
2.3
1
2.4

Sorted:
1.0
2.3
2.4

Enter
1.Integer
2.Double
3.String
0.Exit
3
Enter number of element : 3

Enter elements
ab
z
c

Sorted:
ab
c
z

Enter
1.Integer
2.Double
3.String
0.Exit
0
Thank You
*/