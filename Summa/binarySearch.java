//Binary Search
import java.util.Scanner;
public class binarySearch
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
		sort(a,n);
		int pos=search(a,n,ele);
		if(pos==-1)
			System.out.println("Not Found\n");
		else
			System.out.println("Postion of "+ele+" is "+pos);
	}
	
	public static void input(int a[],int n)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the elements\n");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
	}
	
	public static void sort(int a[],int n)
	{
		int i,j,temp;
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
		System.out.println("Sorted list:\n");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static int search(int a[],int n,int ele)	
	{
		int start =0;
		int end =n-1;
		int mid=0,count=0;
		while(start <= end)
		{
			mid = (start+end)/2;
			if(ele == a[mid])
			{
				count =1;
				break;
			}
			else if(ele < a[mid])
				end=mid-1;
			else	
				start=mid+1;
		}
		if(count == 1)
			return mid;
		else 
			return -1;
	}
}

/*
Output:
Enter the number of elements :
4
Enter the elements

4
3
2
1
Enter the number to search :
1
Sorted list:

1
2
3
4
Postion of 1 is 0
*/