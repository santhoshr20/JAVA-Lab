public class Pattern4
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int i,j;
		if(n%2==1)
		{
			for(i=1;i<=n/2;i++)
				System.out.print("  ");
			System.out.print("*");
			System.out.println();
			for(i=1;i<=n;i++)
			{
				if(i==n/2 +1)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				
				}
			}
			System.out.println();
			for(i=2;i<n;i++)
			{
				for(j=1;j<n-i;j++)
				{
					System.out.print(" ");
				}
				for(j=1;j<=2*i-1;j++)
				{
					if(j==1 || j==2*i-2)
						System.out.printf(" *");
					else
						System.out.printf(" ");
				}
				System.out.println();
			}
		}
		else
		{	
			for(i=1;i<=n/2;i++)
				System.out.print("  ");
			System.out.print("*");
			System.out.println();
			for(i=1;i<=n;i++)
			{
				if(i==n/2)
					System.out.print("*   ");
				else
					System.out.print("* ");	
			}
			System.out.println();
			for(i=2;i<n;i++)
			{
				for(j=1;j<n-i;j++)
				{
					System.out.print(" ");
				}
				for(j=1;j<=2*i-1;j++)
				{
					if(j==1 || j==2*i-1)
						System.out.printf(" * ");
					else
						System.out.printf(" ");
				}
				System.out.println();
			}
		}
	}
}

				
