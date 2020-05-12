//Prime numbers
public class Prime
{
	public static void main(String args[])	
	{
		int n = Integer.parseInt(args[0]);
		int i=3,count,c;
		if(n>=1)
			System.out.println("2");
		for ( count = 2 ; count <= n ;  )
		{
			for (c = 2 ; c <= i - 1 ; c++ )
		     	{
				if ( i%c == 0 )
					break;
		      	}
		     if ( c == i )
			{
				System.out.println(i);
				count++;
		  	}
		i++;
		}         
	}
}

/*
Output:
PS C:\Users\Viki\Desktop\Java\Ex0> java Prime 10
2
3
5
7
11
13
17
19
23
29

*/
				
			
