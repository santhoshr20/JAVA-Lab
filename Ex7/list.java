import java.util.*;

public class list
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int ch=1;
		LinkedList<Integer> A=new LinkedList<Integer>();
		while(ch!=0)
		{
			System.out.println("\n\nEnter\n1.Front\n2.Last\n3.Display\n4.ToArray\n0.Exit");
			ch=scan.nextInt();
			switch(ch)
			{
				case 1:
				{
					System.out.print("Enter the number : ");
					int temp=scan.nextInt();
					A.addFirst(temp);
					break;
				}
				case 2:
				{
					System.out.print("Enter the number : ");
					int temp=scan.nextInt();
					A.addLast(temp);
					break;
				}
				case 3:
				{
					System.out.println(A);
					break;
				}
				case 4:
				{
					Integer[] a=new Integer[3];
					A.toArray(a);
					for(int i=0;i<A.size();i++)
					{
						System.out.println(a[i]);
					}
					break;
				}
			}
		}
	}
}
