public class P3
{
	public static void main(String args[])
	{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[2]);
		
		switch(args[1])
		{
			case "+":
				System.out.println(x+y)	;
				break;
			case "-":	
				System.out.println(x-y);
				break;
			case "1":
				System.out.println(x*y);
				break;
			case "/":
				System.out.println(x/y);
				break;
		}
	}
}