//Fibonacci series
class A
{
	public int Fib(int a)
	{
	if(a<=1)
		return a;
	else
		return (Fib(a-1) + Fib(a-2));
	}
}

public class Fibo
{
	
	public static void main(String args[])
	{
	int x = Integer.parseInt(args[0]);
	int temp;
	A fib = new A();
	for(int i=0;i<x;i++)
		{
		temp=fib.Fib(i);
		System.out.println(" "+temp);
		}
	}
}

/*
Output:
PS C:\Users\Viki\Desktop\Java\Ex0> java Sam1 5
 0
 1
 1
 2
 3
*/