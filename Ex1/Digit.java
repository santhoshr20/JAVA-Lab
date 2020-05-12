//Even and Odd sum
public class Digit
{
	public static void main(String args[])
	{
		int x = Integer.parseInt(args[0]);
		int r,esum=0,osum=0;
		while(x>0)
		{
			r=x%10;
			x=x/10;
			if(r%2==0)
				esum+=r;
			else
				osum+=r;
		}
	System.out.println("Even Sum = "+esum);
	System.out.println("Odd Sum = "+osum);
	}
}

/*
Output:
PS C:\Users\Viki\Desktop\Java\Ex0> java Digit 123
Even Sum = 2
Odd Sum = 4

*/
