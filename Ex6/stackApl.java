import java.util.Scanner;

class StackOverFlowException extends Exception
{
	public String toString()
	{
		return "Caught";
	}	
}

class StackUnderFlowException extends Exception
{
	public String toString()
	{
		return "Caught";
	}	
}

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
	
	public void push(T x) throws StackOverFlowException
	{
		if(isFull()==1)
		{
			throw new StackOverFlowException();
		}
		else
		{
			top++;
			a[top]=x;
		}
	}

	public void pop() throws StackUnderFlowException
	{
		if(isEmpty()==1)
		{
			throw new StackUnderFlowException();
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
								try
								{
									System.out.print("Enter the number to push :");
									int temp=scan.nextInt();
									A.push(temp);
									break;
								}
								catch (StackOverFlowException e)
								{
									System.out.println("StackOverFlowException "+e);
								}
								finally
								{
									break;
								}
							}
							case 2:
							{
								try
								{
									A.pop();
									break;
								}
								catch (StackUnderFlowException e)
								{
									System.out.println("StackUnderFlowException "+e);
								}
								finally
								{
									break;
								}
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
								try
								{
									System.out.print("Enter the number to push :");
									double temp=scan.nextDouble();
									A.push(temp);
									break;
								}
								catch (StackOverFlowException e)
								{
									System.out.println("StackOverFlowException "+e);
								}
								finally
								{
									break;
								}
							}
							case 2:
							{
								try
								{
									A.pop();
									break;
								}
								catch (StackUnderFlowException e)
								{
									System.out.println("StackUnderFlowException "+e);
								}
								finally
								{
									break;
								}
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
								try
								{
									System.out.print("Enter the String to push :");
									String temp=scan.next();
									A.push(temp);
									break;
								}
								catch (StackOverFlowException e)
								{
									System.out.println("StackOverFlowException "+e);
								}
								finally
								{
									break;
								}
							}
							case 2:
							{
								try
								{
									A.pop();
									break;
								}
								catch (StackUnderFlowException e)
								{
									System.out.println("StackUnderFlowException "+e);
								}
								finally
								{
									break;
								}
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