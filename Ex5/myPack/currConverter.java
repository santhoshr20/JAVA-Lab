//1.Packake currency converter

package myPack;

public class currConverter
{
	public void currency(double x,int ch)
	{
		switch(ch)
		{
			case 1:
				System.out.println("$ "+x);
				x=x*71.71;
				System.out.println("Rs "+x);
				break;
			case 2:
				System.out.println("E "+x);
				x=x*79.39;
				System.out.println("Rs "+x);
				break;
			case 3:
				System.out.println("Y "+x);
				x=x*0.67;
				System.out.println("Rs "+x);
				break;
			case 4:
				System.out.println("Rs "+x);
				x=x/71.71;
				System.out.println("$ "+x);
				break;
			case 5:
				System.out.println("Rs "+x);
				x=x/79.39;
				System.out.println("E "+x);
				break;	
			case 6:
				System.out.println("Rs "+x);
				x=x/0.67;
				System.out.println("Y "+x);
				break;
			default:
				System.out.println("Invalid Input");
		}

	}
}
