import java.util.Scanner;
public class P2
{
	public static void main(String srgs[])
	{		
		float sum,diff,pro,q;
		int r;
		Scanner in1 = new Scanner(System.in);
		System.out.println("Enter 1st number");
		float x=in1.nextFloat();
		
		Scanner in2 = new Scanner(System.in);
		System.out.println("Enter 2nd number");
		float y=in2.nextFloat();
		
		Scanner in3 = new Scanner(System.in);
		System.out.println("Enter");
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Product");
		System.out.println("4.Divide");
		int choice =in3.nextInt();
		
		switch(choice)
		{
			case 1:
				sum=x+y;
				System.out.println(sum);
				break;
			case 2:
				diff=x-y;
				System.out.println(diff);
				break;
			case 3:
				pro=x*y;
				System.out.println(pro);
				break;
			case 4:
				q=x/y;
				r=(int)x%(int)y;
				System.out.println(q);
				System.out.println(r);
				break;
		}
	}
}