import java.util.Scanner;
public class Search
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Calc A=new Calc();
		int ch=1;
		while(ch!=3)
		{
			System.out.print("\nEnter\n1.Linear Search\n2.Binary Search\n3.Exit\n");
			ch= scan.nextInt();
			switch(ch)
			{
				case 1:
						A.linearSearch();
						break;
				case 2:
						A.binarySearch();
						break;
				case 3:
						System.out.print("Thank you\n");
						break;
				default:
						System.out.print("Invalid input\n");
			}
		}
	}
}

class Calc
{	
	public void linearSearch()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n=scan.nextInt();
		int a[] =new int[n];
		input(a,n);
		System.out.println("Enter the number to search : ");
		int ele=scan.nextInt();
		int pos=lsearch(a,n,ele);
		if(pos==-1)
			System.out.println("Not Found\n");
		else
			System.out.println("Postion of "+ele+" is "+pos);
	}
	
	public void input(int a[],int n)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the elements\n");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
	}
	
	public int lsearch(int a[],int n,int ele)	
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
	
	public void binarySearch()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n=scan.nextInt();
		int a[] =new int[n];
		input(a,n);
		System.out.println("Enter the number to search : ");
		int ele=scan.nextInt();
		sort(a,n);
		int pos=bsearch(a,n,ele);
		if(pos==-1)
			System.out.println("Not Found\n");
		else
			System.out.println("Postion of "+ele+" is "+pos);
	}
	
	
	public void sort(int a[],int n)
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
	
	public int bsearch(int a[],int n,int ele)	
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
Enter
1.Linear Search
2.Binary Search
3.Exit
1
Enter the number of elements :
4
Enter the elements

1
2
3
4
Enter the number to search :
3
Postion of 3 is 2

Enter
1.Linear Search
2.Binary Search
3.Exit
2
Enter the number of elements :
5
Enter the elements

4
6
3
1
2
Enter the number to search :
3
Sorted list:

1
2
3
4
6
Postion of 3 is 2

Enter
1.Linear Search
2.Binary Search
3.Exit
3
Thank you
*/