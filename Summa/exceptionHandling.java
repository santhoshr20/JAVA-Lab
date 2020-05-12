import java.util.Scanner;
public class exceptionHandling
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int b=scan.nextInt();
		int[] c=new int[3];
		try
		{
			System.out.println(3/b);
			System.out.println(c[3/b]);
	
		}
		catch (ArithmeticException a)
		{
			System.out.println("Zero divide error");
		}
		catch (ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Array out of bound error");
		}
		finally
		{
			System.out.println("bye");	
		}
	}	
}