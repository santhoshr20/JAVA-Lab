import java.util.*;

public class Union
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> A=new ArrayList<Integer>();
		ArrayList<Integer> B=new ArrayList<Integer>();
		
		int ch=1;
		while(ch!=0)
		{
			System.out.println("\n\nEnter\n1.Insert\n2.Merge\n3.Union\n4.Intersection\n5.Compare\n0.Exit");
			ch=scan.nextInt();
			
			switch(ch)
			{
				case 1:
				{
					System.out.println("Enter A");
					for(int i=0;i<5;i++)
					{
						int a=scan.nextInt();
						A.add(a);
					}
					System.out.println("Enter B");
					for(int j=0;j<5;j++)
					{
						int a=scan.nextInt();
						B.add(a);
					}
					break;
				}
				case 2:
				{
					ArrayList<Integer> C=new ArrayList<Integer>();
					C.addAll(A);
					C.addAll(B);
					System.out.println(C);
					break;
				}
				case 3:
				{
					TreeSet<Integer> tree=new TreeSet<Integer>();
					tree.addAll(A);
					tree.addAll(B);
					ArrayList<Integer> D=new ArrayList<Integer>();
					D.addAll(tree);
					System.out.println(D);
					break;
				}
				case 4:
				{
					ArrayList<Integer> E=new ArrayList<Integer>();
					for(int i=0;i<A.size();i++)
					{
						int temp=A.get(i);
						if(B.contains(temp))
						{
							E.add(temp);
						}
					}
					
					System.out.println(E);
					break;
				}
				case 5:
				{
					if(A.equals(B))
					{
						System.out.println("Equal");
					}
					else
					{
						System.out.println("Not Equal");
					}
					break;
				}
			}
		}
	}
}