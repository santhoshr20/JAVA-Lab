class A
{
	public int a=10,b=20;
}

class B extends A
{
	public int a=1,b=2;

}
class C extends A
{
	public static void p(int a,int b)
	{
		System.out.println(a+" "+b);
		System.out.println(a+b);
		System.out.println(a+b);
	}
}

public class Inherit
{
	public static void main(String args[])
	{
	int x=100,y=200;
	C.p(x,y);
	}
}