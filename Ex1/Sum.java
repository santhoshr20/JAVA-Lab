//Sum of the Digits
public class Sum
{
	public static void main(String args[])
	{
		int x = Integer.parseInt(args[0]);
		int r,sum=0;
		while(x>0)
		{
			r=x%10;
			sum+=r;
			x=x/10;
		}
	System.out.println("Sum = "+sum);
	}
}

/*
Output:
PS C:\Users\Viki\Desktop\Java\Ex0> java Sum 123
Sum = 6

*/