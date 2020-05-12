//Pattern3s
public class Pattern3
{
	public static void main(String args[])
	{
		int n= Integer.parseInt(args[0]);
		int i,j;
		for(i=n;i>=1;i-- )
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
            if(i==n)
			{
				for(j=1;j<=n;j++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				for(j=1;j<=i*2-1;j++)
				{
					if(j==1||j==i*2-1)
						System.out.printf("*");
					else
						System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
}

/*
Output:
PS C:\Users\Viki\Desktop\Java\Ex1> java Pattern3 5
* * * * *
 *     *
  *   *
   * *
    *
*/