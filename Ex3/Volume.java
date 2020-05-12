//Box Volume
import java.util.Scanner;
class Box
{
	public double length,width,depth;
}

class boxWeight extends Box
{
	public double weight;
}

class boxShipment extends boxWeight
{
	public double shipmentCost;
	public double vol(double l,double w,double d)
	{
		length=l;
		width=w;
		depth=d;
		return (length*width*depth);
	}
	
	public void cost()
	{
		System.out.println("Cost per kg is Rs.1.50 ");
		shipmentCost=weight*1.5;
	}
}

public class Volume
{
	public static void main(String args[])
	{
		boxShipment A=new boxShipment();
		Scanner scan=new Scanner(System.in);			
		double l,w,d,weight,volume;
		System.out.print("Enter \nLength : ");
		l=scan.nextDouble();
		System.out.print("Width : ");
		w=scan.nextDouble();
		System.out.print("Depth : ");
		d=scan.nextDouble();
		System.out.print("Weight : ");
		A.weight=scan.nextDouble();
		volume=A.vol(l,w,d);
		System.out.println("\nVolume = "+volume);
		A.cost();
		System.out.println("Shipment Cost = Rs. "+A.shipmentCost);
	}
}

/*
Output:

Enter 
Length : 2
Width : 2
Depth : 2
Weight : 2

Volume = 8.0
Cost per kg is Rs.1.50 
Shipment Cost = Rs. 3.0

*/ 
