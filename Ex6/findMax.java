
import java.util.Scanner;

class Gen
{
	public <T extends Comparable<T>> T max(T[] a)
	{
		int len;
		len=a.length;
		int i;
		T max;
		max=a[0];
		for(i=1;i<len;i++)
		{
			if(a[i].compareTo(max)>0)
				max=a[i];
		}
		return max;
	}
}

public class findMax
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
					
					System.out.println("\nMaximum = "+obj.max(a));
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
					
					System.out.println("\nMaximum = "+obj.max(a));
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
					
					System.out.println("\nMaximum = "+obj.max(a));
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

Maximum = 4

Enter
1.Integer
2.Double
3.String
0.Exit
2
Enter number of element : 3

Enter elements
3.1
3.2
3.5

Maximum = 3.5

Enter
1.Integer
2.Double
3.String
0.Exit
3
Enter number of element : 3

Enter elements
a
ab
abc

Maximum = abc

Enter
1.Integer
2.Double
3.String
0.Exit
0
Thank You
*/