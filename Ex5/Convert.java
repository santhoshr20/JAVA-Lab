import myPack.currConverter;
import java.util.Scanner;

public class Convert
{
	public static void main(String args[])
	{
		currConverter A = new currConverter();
		int i=1;
		Scanner scan=new Scanner(System.in);
		while(i!=0)
		{
			System.out.println("\nEnter\n1.Dollar to Inr\n2.Euro to Inr\n3.Yen to Inr\n4.Inr to Dollar\n5.Inr to Euro\n6.Inr to Yen\n0.Exit");
			i=scan.nextInt();
			try{
			if(i!=0)
			{
				System.out.print("\nEnter the value :");
				String temp = scan.next();
				double x=Double.parseDouble(temp);
				A.currency(x,i);
			}
			else
				break;
			}
			catch (NumberFormatException e)
			{
				System.out.println("Enter the number in valid format");
			}
		}	
		System.out.println("Thank You");
	}
}

/*
Output:

Enter
1.Dollar to Inr
2.Euro to Inr
3.Yen to Inr
4.Inr to Dollar
5.Inr to Euro
6.Inr to Yen
0.Exit
1

Enter the value :3
$ 3.0
Rs 215.13

Enter
1.Dollar to Inr
2.Euro to Inr
3.Yen to Inr
4.Inr to Dollar
5.Inr to Euro
6.Inr to Yen
0.Exit
2

Enter the value :3
E 3.0
Rs 238.17000000000002

Enter
1.Dollar to Inr
2.Euro to Inr
3.Yen to Inr
4.Inr to Dollar
5.Inr to Euro
6.Inr to Yen
0.Exit
3

Enter the value :3
Y 3.0
Rs 2.0100000000000002

Enter
1.Dollar to Inr
2.Euro to Inr
3.Yen to Inr
4.Inr to Dollar
5.Inr to Euro
6.Inr to Yen
0.Exit
4

Enter the value :3
Rs 3.0
$ 0.0418351694324362

Enter
1.Dollar to Inr
2.Euro to Inr
3.Yen to Inr
4.Inr to Dollar
5.Inr to Euro
6.Inr to Yen
0.Exit
5

Enter the value :3
Rs 3.0
E 0.03778813452575891

Enter
1.Dollar to Inr
2.Euro to Inr
3.Yen to Inr
4.Inr to Dollar
5.Inr to Euro
6.Inr to Yen
0.Exit
6

Enter the value :3
Rs 3.0
Y 4.477611940298507

Enter
1.Dollar to Inr
2.Euro to Inr
3.Yen to Inr
4.Inr to Dollar
5.Inr to Euro
6.Inr to Yen
0.Exit
1

Enter the value :qwerty
Enter the number in valid format

Enter
1.Dollar to Inr
2.Euro to Inr
3.Yen to Inr
4.Inr to Dollar
5.Inr to Euro
6.Inr to Yen
0.Exit
0
Thank You
*/
