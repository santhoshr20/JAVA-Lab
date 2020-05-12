import java.util.Scanner;
public class linearSearch
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n=scan.nextInt();
		int a[] =new int[n];
		input(a,n);
		System.out.println("Enter the number to search : ");
		int ele=scan.nextInt();
		int pos=search(a,n,ele);
		if(pos==-1)
			System.out.println("Not Found\n");
		else
			System.out.println("Postion of "+ele+" is "+pos);
	}
	
	public static void input(int a[],int n)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the elements\n");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
	}
	
	public static int search(int a[],int n,int ele)	
	{
		int count =0;
		int i;
		for(i=0;i<n;i++)
		{
			if(a[i]==ele)
			{	
				count=1;
				break;	
			}		
		}
		if(count==0)
			return -1;
		else 
			return i;
	}
}

/*
Enter the number of elements :
5
Enter the elements

2
4
5
6
7
Enter the number to search :
5
Postion of 5 is 2
*/