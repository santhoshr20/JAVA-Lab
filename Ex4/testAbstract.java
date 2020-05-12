//2.Shapes
import java.util.Scanner;

abstract class Shape
{
	protected String colour="RED";
	
	Shape()
	{
		colour="BLUE";
	}
	Shape(String c)
	{
		colour=c;
	}
	
	String getColour()
	{
		return colour;
	}
	
	void setColour(String c)
	{
		colour=c;
	}

	abstract double getArea();
	abstract double getPerimeter();
}


class Circle extends Shape
{
	protected double radius=1.0;
	
	Circle()
	{
		radius =1.0;
	}
	Circle(double r)
	{
		radius=r;
	}
	Circle(double r,String c)
	{
		super(c);
		radius=r;
	}
	double getRadius()
	{
		return radius;
	}
	void setRadius(double r)
	{
		radius=r;
	}	
	/*public double getArea()
	{
		return (3.14*radius*radius);
	}*/
	public double getPerimeter()
	{
		return (6.28*radius);
	}
}

class Rectangle extends Shape
{
	protected double width=1.0,length=1.0;

	Rectangle()
	{
		length =1.0;width=2.0;
	}
	Rectangle(double l,double w)
	{
		length=l;
		width=w;		
	}
	Rectangle(double l,double w,String c)
	{
		super(c);
		length=l;
		width=w;		
		
	}
	double getWidth()
	{
		return width;
	}
	double getLength()
	{
		return length;
	}
	void setWidth(double r)
	{
		width=r;
	}
	void setLength(double r)
	{
		length=r;
	}	
	public double getArea()
	{
		return (length*width);
	}
	public double getPerimeter()
	{
		return (2*(length+width));
	}


}


class Square extends Rectangle
{
	Square()
	{
		super(1.0,1.0);
	}
	Square(double s)
	{
		super(s,s);
	}
	Square(double s,String c)
	{
		super(s,s,c);
	}
	double getSide()
	{
		return getLength();
	}
	void setSide(double s)
	{
		setLength(s);
		setWidth(s);
	}
	public double getArea()
	{
		return (length*width);
	}
	public double getPerimeter()
	{
		return (4*length);
	}
}


public class testAbstract
{
	public static void main(String args[])
	{
		Circle[] C = new Circle[3];
		Rectangle[] R=new Rectangle[3];
		Square[] S=new Square[3];
		Scanner s=new Scanner(System.in);
		int ch;
		double x,y;
		String c;		
		do
		{
			System.out.print("\nMenu:\n1.Circle\n2.Rectangle\n3.Square\n4.Exit\n");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
				{
					C[0]=new Circle();
					
					System.out.print("Radius1: ");x=s.nextDouble();
					C[1]=new Circle(x);
					
					s.nextLine();System.out.print("Colour: ");c=s.nextLine();
					System.out.print("Radius2: ");x=s.nextDouble();
					C[2]=new Circle(x,c);
				
					System.out.println("\nArea of the circle1 is: "+C[0].getArea()+"\nPerimeter of the circle1 is: "+C[0].getPerimeter());
					System.out.println("\nArea of the circle2 is: "+C[1].getArea()+"\nPerimeter of the circle2 is: "+C[1].getPerimeter());
					System.out.println("\nArea of the circle3 is: "+C[2].getArea()+"\nPerimeter of the circle3 is: "+C[2].getPerimeter());
					break;
				}
		 
				case 2:
				{
					R[0]=new Rectangle();
					
					System.out.print("Length1: ");x=s.nextDouble();
					System.out.print("Width1: ");y=s.nextDouble();
					R[1]=new Rectangle(x,y);
					
					s.nextLine();System.out.print("Colour: ");c=s.nextLine();
					System.out.print("Length2: ");x=s.nextDouble();
					System.out.print("Width2: ");y=s.nextDouble();
					R[2]=new Rectangle(x,y,c);
					
					System.out.println("\nArea of the Rectangle1 is: "+R[0].getArea()+"\nPerimeter of the Rectangle1 is: "+R[0].getPerimeter());
					System.out.println("\nArea of the Rectangle2 is: "+R[1].getArea()+"\nPerimeter of the Rectangle2 is: "+R[1].getPerimeter());
					System.out.println("\nArea of the Rectangle3 is: "+R[2].getArea()+"\nPerimeter of the Rectangle3 is: "+R[2].getPerimeter());
					break;
				}
				case 3:
				{
					S[0]=new Square();
			
					System.out.print("Side1: ");x=s.nextDouble();
					S[1]=new Square(x);
					
					s.nextLine();System.out.print("Colour: ");c=s.nextLine();
					System.out.print("Side2: ");x=s.nextDouble();
					S[2]=new Square(x,c);
					
					System.out.println("\nArea of the Square1 is: "+S[0].getArea()+"\nPerimeter of the Square1 is: "+S[0].getPerimeter());
					System.out.println("\nArea of the Square2 is: "+S[1].getArea()+"\nPerimeter of the Square2 is: "+S[1].getPerimeter());
					System.out.println("\nArea of the Square3 is: "+S[2].getArea()+"\nPerimeter of the Square3 is: "+S[2].getPerimeter());
					break;
				}
			}		
		}while(ch!=4);
	}	
}

/*
Output:
Menu:
1.Circle
2.Rectangle
3.Square
4.Exit
1
Radius1: 2
Colour: green
Radius2: 3

Area of the circle1 is: 3.14
Perimeter of the circle1 is: 6.28

Area of the circle2 is: 12.56
Perimeter of the circle2 is: 12.56

Area of the circle3 is: 28.259999999999998
Perimeter of the circle3 is: 18.84

Menu:
1.Circle
2.Rectangle
3.Square
4.Exit
2
Length1: 2
Width1: 3
Colour: green
Length2: 4
Width2: 5

Area of the Rectangle1 is: 2.0
Perimeter of the Rectangle1 is: 6.0

Area of the Rectangle2 is: 6.0
Perimeter of the Rectangle2 is: 10.0

Area of the Rectangle3 is: 20.0
Perimeter of the Rectangle3 is: 18.0

Menu:
1.Circle
2.Rectangle
3.Square
4.Exit
3
Side1: 2
Colour: green
Side2: 3

Area of the Square1 is: 1.0
Perimeter of the Square1 is: 4.0

Area of the Square2 is: 4.0
Perimeter of the Square2 is: 8.0

Area of the Square3 is: 9.0
Perimeter of the Square3 is: 12.0

Menu:
1.Circle
2.Rectangle
3.Square
4.Exit
4
*/
