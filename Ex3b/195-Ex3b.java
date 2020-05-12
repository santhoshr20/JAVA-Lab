//1.Person Details
import java.util.Scanner;

class Person
{
	private int aadhaar;
	private String name,address;
	private char gender;
	
	Person(int aadhaar,String name,String address,char gender)
	{
		this.aadhaar=aadhaar;
		this.name=name;
		this.address=address;
		this.gender=gender;
	}
	
	public String getName()
	{
		return name;
	}	
	
	public String getAddress()	
	{
		return address;
	}
	
	public char getGender()
	{
		return gender;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
}

class Student extends Person
{
	private String program;
	private int year;
	private float totalmark;
	
	Student(int aadhaar,String name,String address,char gender,String program,int year,float total)
	{
		super(aadhaar,name,address,gender);
		this.program=program;
		this.year=year;
		totalmark=total;
	}
	
	public String getProgram()
	{
		return program;
	}
		
	public int getYear()
	{
		return year;
	}
	
	public float getTotal()
	{	
		return totalmark;	
	}

	public void setYear(int year)
	{
		this.year=year;
	}
	
	public void setTotal(float total)
	{
		totalmark=total;	
	}
	
	public float calGPA()
	{
		return (totalmark/10);
	}
}

class Faculty extends Person
{
	private String designation,department;
	private float basicpay;

	Faculty(int aadhaar,String name,String address,char gender,String designation,String dept,float pay)
	{
		super(aadhaar,name,address,gender);
		this.designation=designation;
		department=dept;
		basicpay=pay;
	}
	
	public String getDesig() 
	{
		return designation;
	}
	
	public float getBasic()
	{
		return basicpay;
	}
	
	public void setDesig(String desig)
	{
		designation=desig;
	}
	
	public void setBasic(float basic)
	{
		basicpay=basic;
	}

	public float calSalary()
	{
		float gross,basic,hra,deduction,insure,pf,net,da;
		da=(float)(0.6)*basicpay;
		hra=(float)(0.1)*basicpay;
		gross=basicpay+da+hra;
		insure=(float)(0.85)*basicpay;
		pf=(float)(0.08)*basicpay;
		deduction=insure+pf;
		net=gross-deduction;
		return net;	
	}
}

public class personDetails
{
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);	
		int ch=1;
		while(ch!=0)
		{
			System.out.println("\nEnter\n1.Student\n2.Faculty\n0.exit");
			ch=scan.nextInt();
			
			switch(ch)
			{
				case 1:
				{
					int aadhaar,total,year;
					String name,address,program;	
					char gender;

					System.out.print("Name : ");
					name=scan.next();
					
					scan.nextLine();
					System.out.print("Aadhaar : ");
					aadhaar=scan.nextInt();

					scan.nextLine();
					System.out.print("Address : ");
					address=scan.nextLine();
					
					System.out.print("Gender(M/F) : ");
					gender=scan.next().charAt(0);
					
					System.out.print("Program : ");
					program=scan.next();

					System.out.print("Year : ");
					year=scan.nextInt();

					System.out.print("Total Marks : ");
					total=scan.nextInt();
					
					Student A = new Student(aadhaar,name,address,gender,program,year,total);
					output1(A);
					
					int temp=1;
					while(temp!=0)
					{
						System.out.print("\nEnter\n1.To change Total\n2.To change year\n3.To change Address\n0.To proceed\n");
						temp=scan.nextInt();
						if(temp==1)
						{
							int temptotal;
							System.out.print("Enter the new total :");
							temptotal=scan.nextInt();
							A.setTotal(temptotal);
						}
						if(temp==2)
						{
							int tempyear;
							System.out.print("Enter the new year :");
							tempyear=scan.nextInt();
							A.setYear(tempyear);
						}
						if(temp==3)
						{
							String tempadd;
							System.out.print("Enter the new Address :");
							scan.nextLine();
							tempadd=scan.nextLine();
							A.setAddress(tempadd);
						}
					}	
					output1(A);
					break;
				}
				case 2:
				{
					int aadhaar;
					float bp;
					String name,address,dept,desig;	
					char gender;

					System.out.print("Name : ");
					name=scan.next();
					
					scan.nextLine();
					System.out.print("Aadhaar : ");
					aadhaar=scan.nextInt();
					
					scan.nextLine();
					System.out.print("Address : ");
					address=scan.nextLine();
					
					System.out.print("Gender(M/F) : ");
					gender=scan.next().charAt(0);

					System.out.print("Designation : ");
					desig=scan.next();

					System.out.print("Department : ");
					dept=scan.next();

					System.out.print("Basic Pay : ");
					bp=scan.nextFloat();
					
					Faculty B = new Faculty(aadhaar,name,address,gender,desig,dept,bp);
					
					output2(B);
					int temp=1;
					while(temp!=0)
					{
						System.out.print("\nEnter\n1.To change Designation\n2.To change basic\n3.To change address\n0.To proceed\n");
						temp=scan.nextInt();
						if(temp==1)
						{
							String tempdesig;
							System.out.print("Enter the new Designation :");
							tempdesig=scan.next();
							B.setDesig(tempdesig);
						}
						if(temp==2)
						{
							float tempbasic;
							System.out.print("Enter the new basic :");
							tempbasic=scan.nextFloat();
							B.setBasic(tempbasic);
						}
						if(temp==3)
						{
							String tempadd;
							System.out.print("Enter the new Address :");
							scan.nextLine();
							tempadd=scan.nextLine();
							B.setAddress(tempadd);
						}
					}
					output2(B);
					break;
				}
				case 0:
					System.out.println("Thank you");
					break;
				default:
					System.out.println("Invalid input");
			}
		}
	}
	
	public static void output1(Student A)
	{
		System.out.println("\nSTUDENT DETAILS");
		System.out.println("NAME         : "+A.getName());
		System.out.println("ADDRESS      : "+A.getAddress());
		System.out.println("GENDER       : "+A.getGender());
		System.out.println("TOTAL MARKS  : "+A.getTotal());
		System.out.println("GPA          : "+A.calGPA());	
	}
	
	public static void output2(Faculty B)
	{
		System.out.println("\nFACULTY DETAILS");
		System.out.println("NAME         : "+B.getName());
		System.out.println("ADDRESS      : "+B.getAddress());
		System.out.println("GENDER       : "+B.getGender());
		System.out.println("BASIC PAY    : "+B.getBasic());
		System.out.println("SALARY       : "+B.calSalary());
	}
}

/*
Output:
Enter
1.Student
2.Faculty
0.exit
1
Name : lisa mandob
Aadhaar : 5678
Address : thailand
Gender(M/F) : F
Program : rapper
Year : 1997
Total Marks : 100

STUDENT DETAILS
NAME         : lisa
ADDRESS      : thailand
GENDER       : F
TOTAL MARKS  : 100.0
GPA          : 10.0

Enter
1.To change Total
2.To change year
3.To change Address
0.To proceed
1
Enter the new total :99

Enter
1.To change Total
2.To change year
3.To change Address
0.To proceed
2
Enter the new year :1997

Enter
1.To change Total
2.To change year
3.To change Address
0.To proceed
0

STUDENT DETAILS
NAME         : lisa
ADDRESS      : thailand
GENDER       : F
TOTAL MARKS  : 99.0
GPA          : 9.9

Enter
1.Student
2.Faculty
0.exit
2
Name : Jennie
Aadhaar : 2313
Address : Dutch
Gender(M/F) : F
Designation : Leader
Department : MUSICAL
Basic Pay : 10000

FACULTY DETAILS
NAME         : Jennie
ADDRESS      : Dutch
GENDER       : F
BASIC PAY    : 10000.0
SALARY       : 7700.0

Enter
1.To change Designation
2.To change basic
3.To change address
0.To proceed
1
Enter the new Designation :Ass.Leader

Enter
1.To change Designation
2.To change basic
3.To change address
0.To proceed
0

FACULTY DETAILS
NAME         : Jennie
ADDRESS      : Dutch
GENDER       : F
BASIC PAY    : 10000.0
SALARY       : 7700.0

Enter
1.Student
2.Faculty
0.exit
0
Thank you
*/	

//2.Shapes
import java.util.*;

class Shape
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
	double getArea()
	{
		return (3.14*radius*radius);
	}
	double getPerimeter()
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
	double getArea()
	{
		return (length*width);
	}
	double getPerimeter()
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
}


public class TestShape
{
	public static void main(String args[])
	{
		Circle C;
		Rectangle R;
		Square S;
		Scanner s=new Scanner(System.in);
		int ch,ch1;
		double x,y;
		String c;		
		do
		{
			System.out.print("\nMenu:\n1.Circle\n2.Rectangle\n3.Square\n4.Exit\n\nChoice: ");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
					System.out.print("\nCircle: 1.Default  2.Change radius  3. Change Radius and Colour \nChoice: ");ch1=s.nextInt();
					if(ch1==1)
					{	
						C=new Circle();
					}
					else if(ch1==2)
					{
						System.out.print("Radius: ");x=s.nextDouble();
						C=new Circle(x);
					}
					else
					{
						s.nextLine();System.out.print("Colour: ");c=s.nextLine();
						System.out.print("Radius: ");x=s.nextDouble();
						C=new Circle(x,c);
					
					}
					System.out.println("Area of the circle is: "+C.getArea()+"\nPerimeter of the circle is: "+C.getPerimeter());
					break;
		 
				case 2:
					System.out.print("\nRectangle: 1.Default  2.Change dimensions  3. Change dimensions and Colour \nChoice: ");ch1=s.nextInt();
					if(ch1==1)
					{	
						R=new Rectangle();
					}
					else if(ch1==2)
					{
						System.out.print("Length: ");x=s.nextDouble();
						System.out.print("Width: ");y=s.nextDouble();
						R=new Rectangle(x,y);
					}
					else
					{
						s.nextLine();System.out.print("Colour: ");c=s.nextLine();
						System.out.print("Length: ");x=s.nextDouble();
						System.out.print("Width: ");y=s.nextDouble();
						R=new Rectangle(x,y,c);
					
					}
					System.out.println("Area of the Rectangle is: "+R.getArea()+"\nPerimeter of the Rectangle is: "+R.getPerimeter());
					break;
				case 3:
					System.out.print("\nCircle: 1.Default  2.Change side  3. Change side and Colour \nChoice: ");ch1=s.nextInt();
					if(ch1==1)
					{	
						S=new Square();
					}
					else if(ch1==2)
					{
						System.out.print("Side: ");x=s.nextDouble();
						S=new Square(x);
					}
					else
					{
						s.nextLine();System.out.print("Colour: ");c=s.nextLine();
						System.out.print("Side: ");x=s.nextDouble();
						S=new Square(x,c);
					
					}
					System.out.println("Area of the Square is: "+S.getArea()+"\nPerimeter of the Square is: "+S.getPerimeter());
					break;
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

Choice: 1

Circle: 1.Default  2.Change radius  3. Change Radius and Colour
Choice: 1
Area of the circle is: 3.14
Perimeter of the circle is: 6.28

Menu:
1.Circle
2.Rectangle
3.Square
4.Exit

Choice: 2

Rectangle: 1.Default  2.Change dimensions  3. Change dimensions and Colour
Choice: 1
Area of the Rectangle is: 2.0
Perimeter of the Rectangle is: 6.0

Menu:
1.Circle
2.Rectangle
3.Square
4.Exit

Choice: 3

Circle: 1.Default  2.Change side  3. Change side and Colour
Choice: 1
Area of the Square is: 1.0
Perimeter of the Square is: 4.0

Menu:
1.Circle
2.Rectangle
3.Square
4.Exit

Choice: 2

Rectangle: 1.Default  2.Change dimensions  3. Change dimensions and Colour
Choice: 2
Length: 4
Width: 2
Area of the Rectangle is: 8.0
Perimeter of the Rectangle is: 12.0

Menu:
1.Circle
2.Rectangle
3.Square
4.Exit

Choice: 4
*/
