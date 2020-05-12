import java.util.Scanner;
public class Sort
{
	public static void main(String args[])
	{
		int i,j,temp;
		int a[]= new int [100];
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the no. of elements");
		int n=scan.nextInt();
		System.out.print("Enter the Elements");
		for(i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		
		System.out.println("Sorted\n");
		for(i=0;i<n-1;i++)
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
			