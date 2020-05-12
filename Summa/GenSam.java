import java.util.*;

class Gen
{
	public <T extends Comparable<T>>T findmax(T[] a)
	{
		T max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i].compareTo(max)>0)
				max=a[i];
		}
		return max;
	}
}

public class GenSam
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Gen A=new Gen();
		String[] data=new String[5];
		System.out.println("Enter :");
		for(int i=0;i<5;i++)
		{
			String temp=scan.next();
			data[i]=temp;
		}
		System.out.println("max = "+A.findmax(data));
	}
}