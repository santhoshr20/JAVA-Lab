/*Electric Bill*/
import java.util.Scanner;
class Consumer
{
	int no;
	String name;
	double prereading,curreading,bill;
	char type;
	public double billDomestic(double pre,double cur)
	{
		double bill,unit;
		unit=cur-pre;
		if(unit<=100)
		{
			bill=unit*1;
		}
		else if(unit<=200)
		{	
			bill=100*1+((unit-100)*2.50);
		}
		else if(unit<=500)
		{
			bill=100*1+100*2.50+((unit-200)*4);
		}
		else
		{
			bill=100*1+100*2.50+300*4+((unit-500)*6);
		}
	return bill;
	}
	
	public double billCommercial(double pre,double cur)
	{
		double bill,unit;
		unit=cur-pre;
		if(unit<=100)
		{
			bill=unit*2;
		}
		else if(unit<=200)
		{	
			bill=100*2+((unit-100)*4.50);
		}
		else if(unit<=500)
		{
			bill=100*2+100*4.50+((unit-200)*6);
		}
		else
		{
			bill=100*2+100*4.50+300*6+((unit-500)*7);
		}
	return bill;
	}
}

public class Bill
{
	public static void main(String args[])
	{
		Consumer a=new Consumer();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter consumer number: ");
		a.no=scan.nextInt();	
		System.out.println("Enter consumer name: ");
		scan.nextLine();
		a.name=scan.nextLine();
		System.out.println("Enter previous month reading: ");
		a.prereading=scan.nextDouble();
		System.out.println("Enter current month reading: ");
		a.curreading=scan.nextDouble();
		System.out.println("Enter EB connection type:(D/C) ");
		a.type=scan.next().charAt(0);
		if(a.type=='D')
			a.bill=a.billDomestic(a.prereading,a.curreading);
		else if(a.type=='C')
			a.bill=a.billCommercial(a.prereading,a.curreading);
		else
			System.out.println("Invalid connection type");
		System.out.println("Bill = "+a.bill);
	}
}

/*
Output:
Enter consumer number:
1
Enter consumer name:
a
Enter previous month reading:
1002
Enter current month reading:
1400
Enter EB connection type:(D/C)
D
Bill = 1142.0

*/
