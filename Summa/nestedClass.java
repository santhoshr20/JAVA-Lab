class Book
{
	int a=10;
	Book()
	{
		System.out.println("Out");
	}
	void display()
		{
			System.out.println(a);
		}
		
	class Author
	{
		Author()
		{
			System.out.println("In");
		}
		
		void d()
		{
			display();
		}
	}
}

public class nestedClass
{
	public static void main(String args[])
	{
		//Book A=new Book();
		Book.Author B =new Book().new Author();
		B.d();
		//System.out.println(B.a);
	}
}