//CozaLozaWoza
public class CozaLozaWoza
{
	public static void main(String args[])
	{
		int i;
		for(i=1;i<=101;i++)
		{	
			 if(i%11==0)
				{
				System.out.print(i);
				System.out.println();
				}
			else if(i%3==0 && i%5==0)
				System.out.print("CozaLoza ");
			else if(i%3==0 && i%7==0)
				System.out.print("CozaWoza ");
			else if(i%5==0 && i%7==0)
				System.out.print("LozaWoza ");
			else if(i%3==0)
				System.out.print("Coza ");
			else if(i%5==0)
				System.out.print("Loza ");
			else if(i%7==0)
				System.out.print("Woza ");
			else
				System.out.print(i+" "); 
		}
	}
}
		
/*
Output:
1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11
Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22
23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 33
34 LozaWoza Coza 37 38 Coza Loza 41 CozaWoza 43 44
CozaLoza 46 47 Coza Woza Loza Coza 52 53 Coza 55
Woza Coza 58 59 CozaLoza 61 62 CozaWoza 64 Loza 66
67 68 Coza LozaWoza 71 Coza 73 74 CozaLoza 76 77
Coza 79 Loza Coza 82 83 CozaWoza Loza 86 Coza 88
89 CozaLoza Woza 92 Coza 94 Loza Coza 97 Woza 99
Loza 101
*/