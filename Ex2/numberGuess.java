//Number guessing game

import java.util.Scanner;
import java.lang.Math;
class Guess
{
	public void func()
	{	
		int x;
		int rand=(int)(Math.random()*100);
		int i=0;
		do
		{
			i++;
			System.out.print("\nEnter a number ");
			Scanner scan=new Scanner(System.in);
			x=scan.nextInt();
			if(x==rand)
			{
				System.out.println("You got the number "+rand+" right in "+i+" tries");
			}
			else if(x<rand)
			{
				System.out.println("Try Higher");
			}
			else
			{
				System.out.println("Try Lower");
			}
		}while(x!=rand);
	}
}

public class numberGuess
{
	public static void main(String args[])
	{
		Guess A=new Guess();
		A.func();
	}
}

/*
Output:
Enter a number 50
Try Lower

Enter a number 40
Try Lower

Enter a number 30
Try Lower

Enter a number 20
Try Lower

Enter a number 10
Try Higher

Enter a number 11
Try Higher

Enter a number 12
Try Higher

Enter a number 13
Try Higher

Enter a number 14
Try Higher

Enter a number 15
Try Higher

Enter a number 16
You got the number 16 right in 11 tries

*/