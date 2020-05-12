import java.util.*;

class Gen<T extends Comparable<T>>
{
	T[] array;
	public void sort(T[] a)
	{
		int l=a.length;
		T temp;
		for(int i=0;i<l-1;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		array=a;
		for(int i=0;i<l;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	
	public void search(T[] a,T c)
	{
		int l=0;
		int r=a.length-1;
		int mid;
		while(l<=r)
		{
			mid=(r+l)/2;
			if(array[mid].compareTo(c)==0)
			{
				System.out.println("Found at "+mid);
				break;
			}
			else if(array[mid].compareTo(c)<0)
				l=mid+1;
			else
				r=mid-1;
		}
	}
}

public class GenSearch
{
	public static void main(String args[])
	{
		Gen<String> A=new Gen<String>();
		String[] arr=new String[5];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter :");
		for(int i=0;i<5;i++)
		{
			String temp=scan.next();
			arr[i]=temp;
		}
		A.sort(arr);
		System.out.println("Enter element to search :");
		String ch=scan.next();
		A.search(arr,ch);
		
	}
	
}