import java.util.Scanner;
public class P4
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		String a = in.nextLine();
		
		String b = a.toLowerCase();
		String c = a.toUpperCase();
		
		System.out.println("1."+a);
		System.out.println("2."+b);
		System.out.println("3."+c);
		
		int len=a.length();
		System.out.println("Length = "+len);
		
		String n = "abcd";
		int pos=n.indexOf('b');
		System.out.println("\nIndex of 'b' is "+pos);
		
		String n1=n.replace('a','e');
		System.out.println(n);
		System.out.println(n1);
	}
}
		