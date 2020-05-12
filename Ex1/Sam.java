//Factorial
public class Sam
{
	public static void main(String args[])
	{
		int x=Integer.parseInt(args[0]);
		int i,fact=1;
		for(i=1;i<=x;i++)
		{
			fact*=i;
		}
	System.out.println("fact "+fact);
	}
}

/*
Output:
PS C:\Users\Viki\Desktop\Java\Ex0> java Sam 5
fact 120

*/