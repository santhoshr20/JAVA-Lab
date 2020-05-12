import java.util.*;

public class Array
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		ArrayList<String> A=new ArrayList<String>();
		int ch=1;
		while(ch!=0)
		{
			System.out.println("\n\nEnter\n1.Append\n2.Add at index\n3.Search\n4.Dispaly\n5.Search for string starting with a character\n6.Display all string containing substirng\n7.Sort\n8.Remove\n9.Change\n10.Remove duplicates\n0.Exit");
			ch=scan.nextInt();
			switch(ch)
			{
				case 1:
				{
					System.out.print("Enter the String : ");
					String in=scan.next();
					A.add(in);
					break;
				}
				case 2:
				{
					System.out.print("Enter the String : ");
					String in=scan.next();
					System.out.print("Enter the index : ");
					int index=scan.nextInt();
					A.add(index,in);
					break;
				}
				case 3:
				{
					System.out.print("Enter the String : ");
					String in=scan.next();
					System.out.println("Index of "+in+" is "+A.indexOf(in));
					break;
				}
				case 4:
				{
					ListIterator<String> list=A.listIterator(A.size());
					while(list.hasPrevious())
					{
						System.out.println(list.previous());
					}
					break;
				}
				case 5:
				{
					System.out.print("Enter a character : ");
					char in=scan.next().charAt(0);
					for(int i=0;i<A.size();i++)
					{
						String temp=A.get(i);
						if(temp.charAt(0)==in)
							System.out.println(temp);
					}
					break;
				}
				case 6:
				{
					System.out.print("Enter the substring : ");
					String in=scan.next();
					for(int i=0;i<A.size();i++)
					{
						String temp=A.get(i);
						if(temp.contains(in))
							System.out.println(temp);
					}
					break;
				}
				case 7:
				{
					Collections.sort(A);
					System.out.println(A);
					break;
				}
				case 8:
				{
					System.out.print("Enter the string to remove : ");
					String in=scan.next();
					if(A.contains(in))
					{
						A.remove(A.indexOf(in));
						System.out.println(A);
					}
					else
						System.out.println("String not found");
					break;
				}
				case 9:
				{
					System.out.print("Enter the string to change : ");
					String in=scan.next();
					System.out.print("Enter the new string : ");
					String in1=scan.next();
					if(A.contains(in))
					{
						A.set(A.indexOf(in),in1);
						System.out.println(A);
					}
					else
						System.out.println("String not found");
					break;
				}
				case 10:
				{
					TreeSet<String> T=new TreeSet<String>();
					T.addAll(A);
					ArrayList<String> C=new ArrayList<String>();
					C.addAll(T);
					System.out.println(C);
					break;
				}
				case 0:
				{
					System.out.println("Thank you");
					break;
				}
			}
		}
	}
}
