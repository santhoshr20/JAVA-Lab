//Pattern2
public class Pattern2
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==1 || j==1 || i==n || j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

/*
Output:
PS C:\Users\Viki\Desktop\Java\Ex1> java Pattern2 5
* * * * *
*       *
*       *
*       *
* * * * *
*/