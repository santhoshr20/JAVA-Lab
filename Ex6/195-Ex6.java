
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

public class Max
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Gen obj=new Gen();
		int ch=1;
		while(ch!=0)
		{
			System.out.println("\nEnter\n1.Integer\n2.Double\n3.String\n4.Exit");
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
				case 4:
					System.out.println("Exit");
					break;
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
4
1
2

Maximum = 4

Enter
1.Integer
2.Double
3.String
0.Exit
2
Enter number of element : 3

Enter elements
2.3
3.2
3.1

Maximum = 3.2

Enter
1.Integer
2.Double
3.String
0.Exit
3
Enter number of element : 3

Enter elements
a
ba
z

Maximum = z

Enter
1.Integer
2.Double
3.String
0.Exit
0
Exit
*/

//2.Stack
import java.util.Scanner;


class Stack<T>
{
	public Object[] a=new Object[10];
	public int top=-1;	
	public int capacity;

	public int isEmpty()
	{
		if(top==-1)
			return 1;
		else
			return 0;
	}
	
	public int isFull()
	{
		if(top==capacity-1)
			return 1;
		else	
			return 0;
	}
	
	public void push(T x) 
	{
		if(isFull()==1)
		{
			System.out.println("Full");
		}
		else
		{
			top++;
			a[top]=x;
		}
	}

	public void pop()
	{
		if(isEmpty()==1)
		{
			System.out.println("Empty");
		}
		else
		{
			top--;
		}
	}

	public void display()
	{
		System.out.println("Stack");
		for(int i=top;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}

public class stackApl
{
	public static void main(String args[])
	{	
		Scanner scan=new Scanner(System.in);
		int choice=1;
		while(choice!=0)
		{
			System.out.println("\nEnter\n1.Integer\n2.Double\n3.String\n0.Exit");
			choice=scan.nextInt();
			switch(choice)
			{
				case 1:
				{
					Stack<Integer> A=new Stack<Integer>();
					int ch=1;
					
					System.out.print("Enter stack capacity : ");
					A.capacity=scan.nextInt();
					while(ch!=0)
					{
						System.out.println("\nEnter\n1.push\n2.pop\n3.display\n0.Exit");
						ch=scan.nextInt();
						switch(ch)
						{
							case 1:
							{
									System.out.print("Enter the number to push :");
									int temp=scan.nextInt();
									A.push(temp);
									break;
							}
							case 2:
							{
									A.pop();
									break;
							}
							case 3:
							{
								A.display();
								break;
							}
							case 0:
							{
								break;
							}
						}
					}
					break;
				}
				case 2:
				{
					Stack<Double> A=new Stack<Double>();
					int ch=1;
					
					System.out.print("Enter stack capacity : ");
					A.capacity=scan.nextInt();
					while(ch!=0)
					{
						System.out.println("\nEnter\n1.push\n2.pop\n3.display\n0.Exit");
						ch=scan.nextInt();
						switch(ch)
						{
							case 1:
							{
									System.out.print("Enter the number to push :");
									double temp=scan.nextDouble();
									A.push(temp);
									break;
							}
							case 2:
							{
									A.pop();
									break;
							}
							case 3:
							{
								A.display();
								break;
							}
							case 0:
							{
								break;
							}
						}
					}
					break;
				}
				case 3:
				{
					Stack<String> A=new Stack<String>();
					int ch=1;
					
					System.out.print("Enter stack capacity : ");
					A.capacity=scan.nextInt();
					while(ch!=0)
					{
						System.out.println("\nEnter\n1.push\n2.pop\n3.display\n0.Exit");
						ch=scan.nextInt();
						switch(ch)
						{
							case 1:
							{
									System.out.print("Enter the String to push :");
									String temp=scan.next();
									A.push(temp);
									break;
							}
							case 2:
							{
									A.pop();
									break;
							}
							case 3:
							{
								A.display();
								break;
							}
							case 0:
							{
								break;
							}
						}
					}
					break;
				}
				case 0:
				{
					System.out.println("Thank you");
					break;
				}
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
Enter stack capacity : 3

Enter
1.push
2.pop
3.display
0.Exit
1
Enter the number to push :1

Enter
1.push
2.pop
3.display
0.Exit
1
Enter the number to push :2

Enter
1.push
2.pop
3.display
0.Exit
1
Enter the number to push :3

Enter
1.push
2.pop
3.display
0.Exit
3
Stack
3
2
1

Enter
1.push
2.pop
3.display
0.Exit
0

Enter
1.Integer
2.Double
3.String
0.Exit
2
Enter stack capacity : 3

Enter
1.push
2.pop
3.display
0.Exit
1
Enter the number to push :1.2

Enter
1.push
2.pop
3.display
0.Exit
1
Enter the number to push :2.3

Enter
1.push
2.pop
3.display
0.Exit
1
Enter the number to push :3.4

Enter
1.push
2.pop
3.display
0.Exit
3
Stack
3.4
2.3
1.2

Enter
1.push
2.pop
3.display
0.Exit
0

Enter
1.Integer
2.Double
3.String
0.Exit
3
Enter stack capacity : 3

Enter
1.push
2.pop
3.display
0.Exit
1
Enter the String to push :a

Enter
1.push
2.pop
3.display
0.Exit
1
Enter the String to push :b

Enter
1.push
2.pop
3.display
0.Exit
1
Enter the String to push :c

Enter
1.push
2.pop
3.display
0.Exit
3
Stack
c
b
a

Enter
1.push
2.pop
3.display
0.Exit
0

Enter
1.Integer
2.Double
3.String
0.Exit
0
Thank you
*/

//3.Sort

import java.util.Scanner;

class Generic
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
		Generic obj=new Generic();
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
