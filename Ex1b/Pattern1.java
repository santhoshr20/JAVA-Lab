//Pattern1
public class Pattern1
{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				System.out.print(" ");
			for(int j=1;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
				
/*
Output:
PS C:\Users\Viki\Desktop\Java\Ex1> java Pattern1 5
* * * * *
 * * * * *
* * * * *
 * * * * *
* * * * *
*/