class A
{
	int i;
	A(int x)
	{
		i=x;
	}
	
	A(A b)
	{
		i=b.i;
	}
}

class B extends A
{
	int j;
	B(int x,int y)
	{
		super(x);
		j=y;
		System.out.println(i);
		System.out.println(j);
	}
	
	B(B b)
	{
		super(b);
		j=b.j;
		System.out.println(i);
		System.out.println(j);
	}
}

class p
{
	public static void main(String args[])
	{
		B obj=new B(1,2);
		B obj1=new B(obj);
	}
}