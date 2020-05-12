//1.Person Details
import java.util.Scanner;

class Person
{
	private String name,address;
	
	Person(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	
	public String getName()
	{
		return name;
	}	
	
	public String getAddress()	
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
}

class Employee extends Person
{
	private String dept;
	private int empid;
	private double basicpay;
	
	Employee(String name,String address,int empid,String dept,double basic)
	{
		super(name,address);
		this.empid=empid;
		this.dept=dept;
		basicpay=basic;
	}
	
	public int getEmpid()
	{
		return empid;
	}
		
	public String getDept()
	{
		return dept;
	}
	
	public double getBasic()
	{	
		return basicpay;	
	}

	public void setDept(String dept)
	{
		this.dept=dept;
	}
	
	public void setBasic(double basic)
	{
		basicpay=basic;		
	}
	
	public double calSalary()
	{
		double gross,basic,hra,deduction,insure,pf,net,da;
		da=0.6*basicpay;
		hra=0.1*basicpay;
		gross=basicpay+da+hra;
		insure=0.85*basicpay;
		pf=0.08*basicpay;
		deduction=insure+pf;
		net=gross-deduction;
		return net;	
	}
}


class Faculty extends Person
{
	private String designation,course;
	private double basicpay=10000;
	
	Faculty(String name,String address,int empid,String dept,String designation,String course)
	{
		super(name,address);
		this.designation=designation;
		this.course=course;
	}
	
	public String getDesig() 
	{
		return designation;
	}
	
	public String getCourse()
	{
		return course;
	}
	
	public void setDesig(String desig)
	{
		designation=desig;
	}
	
	public void setCourse(String course)
	{
		this.course=course;
	}
	

	public double calSalary()
	{
		double gross,basic,hra,deduction,insure,pf,net,da;
		da=0.6*basicpay;
		hra=0.1*basicpay;
		gross=basicpay+da+hra;
		insure=0.85*basicpay;
		pf=0.08*basicpay;
		deduction=insure+pf;
		net=gross-deduction;
		return net;	
	}
}

interface Student 
{
	public double[] getMarks();
	public double calcGPA();
}

class researchAssistant extends Employee implements Student
{
	private String project,course;
	private double basicpay;
	private double[] mark = new double [3]; 

	researchAssistant(String name,String address,int empid,String dept,double basic,String project,String course)
	{
		super(name,address,empid,dept,basic);
		this.project=project;
		this.course=course;
		basicpay=basic;
	}			
	
	public String getProject()
	{
		return project;
	}
	
	public String getCourse()
	{
		return course;
	}		
	
	public void setCourse(String course)
	{
		this.course=course;
	}

	public double[] getMarks()
	{
		Scanner scan=new Scanner(System.in);
		double[] m = new double[3]; 
		System.out.println("Enter the marks");
		m[0]=scan.nextDouble();
		m[1]=scan.nextDouble();
		m[2]=scan.nextDouble();
		return m;
	}
	
	public void mark()
	{
		mark=getMarks();
	}

	public double calcGPA()
	{
		double totalmark=(mark[0]+mark[1]+mark[2])/3;
		return (totalmark/10);
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
			System.out.println("\nEnter\n1.Employee\n2.Faculty\n3.Research Assistant\n0.exit");
			ch=scan.nextInt();
			
			switch(ch)
			{
				case 1:
				{
					String name,address,dept;
					int empid;
					double basic;

					System.out.print("Name : ");
					name=scan.next();

					scan.nextLine();
					System.out.print("Address : ");
					address=scan.nextLine();
		
					System.out.print("Department : ");
					dept=scan.nextLine();
					
					System.out.print("Employee id : ");
					empid=scan.nextInt();
					
					System.out.print("Basic : ");
					basic=scan.nextDouble();
					
					Employee A=new Employee(name,address,empid,dept,basic);
					output1(A);

					int temp=1;
					while(temp!=0)
					{
						System.out.print("\nEnter\n1.To change department\n2.To change basic pay\n3.To change address\n0.To proceed\n");
						temp=scan.nextInt();
						if(temp==1)
						{
							String tempdept;
							System.out.print("Enter the new dept :");
							scan.nextLine();
							tempdept=scan.nextLine();
							A.setDept(tempdept);
						}
						if(temp==2)
						{
							double tempbasic;
							System.out.print("Enter the new basic pay :");
							scan.nextLine();
							tempbasic=scan.nextDouble();
							A.setBasic(tempbasic);							
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
					String name,address,dept,desi,course;
					int empid;
					double basic;

					System.out.print("Name : ");
					name=scan.next();

					scan.nextLine();
					System.out.print("Address : ");
					address=scan.nextLine();
		
					System.out.print("Department : ");
					dept=scan.nextLine();
					
					System.out.print("Employee id : ");
					empid=scan.nextInt();
					
					System.out.print("Basic : ");
					basic=scan.nextDouble();
					
					scan.nextLine();
					System.out.print("Designation : ");
					desi=scan.nextLine();
				
					System.out.print("Course : ");
					course=scan.nextLine();

					Faculty B=new Faculty(name,address,empid,dept,desi,course);
					output2(B);

					int temp=1;
					while(temp!=0)
					{
						System.out.print("\nEnter\n1.To change designation\n2.To change course\n3.To change address\n0.To proceed\n");
						temp=scan.nextInt();
						if(temp==1)
						{
							String tempdesi;
							System.out.print("Enter the new designation :");
							tempdesi=scan.next();
							B.setDesig(tempdesi);
						}
						if(temp==2)
						{
							String tempcourse;
							System.out.print("Enter the new course :");
							tempcourse=scan.next();
							B.setCourse(tempcourse);
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
				case 3:
				{
					String name,address,dept,project,course;
					int empid;
					double basic;

					System.out.print("Name : ");
					name=scan.next();

					scan.nextLine();
					System.out.print("Address : ");
					address=scan.nextLine();
		
					System.out.print("Department : ");
					dept=scan.nextLine();
					
					System.out.print("Employee id : ");
					empid=scan.nextInt();
					
					System.out.print("Basic : ");
					basic=scan.nextDouble();
					
					scan.nextLine();
					System.out.print("Project : ");
					project=scan.nextLine();
				
					System.out.print("Course : ");
					course=scan.nextLine();

					researchAssistant C=new researchAssistant(name,address,empid,dept,basic,project,course);
					C.mark();
					output3(C);

					int temp=1;
					while(temp!=0)
					{
						System.out.print("\nEnter\n1.To change course\n2.To change address\n0.To proceed\n");
						temp=scan.nextInt();
						if(temp==1)
						{
							String tempcourse;
							System.out.print("Enter the new course :");
							tempcourse=scan.next();
							C.setCourse(tempcourse);
						}
						if(temp==2)
						{
							String tempadd;
							System.out.print("Enter the new Address :");
							scan.nextLine();
							tempadd=scan.nextLine();
							C.setAddress(tempadd);
						}
					}	
					output3(C);
					break;
				}
			}
		}
	}
	public static void output1(Employee A)
	{
		System.out.println("\nEmployee Details");
		System.out.println("Name         : "+A.getName());
		System.out.println("Address      : "+A.getAddress());
		System.out.println("Employee id  : "+A.getEmpid());	
		System.out.println("Department   : "+A.getDept());
		System.out.println("Salary       : "+A.calSalary());	
	}
	
	public static void output2(Faculty A)
	{
		System.out.println("\nFaculty Details");
		System.out.println("Name         : "+A.getName());
		System.out.println("Address      : "+A.getAddress());
		System.out.println("Course       : "+A.getCourse());	
		System.out.println("Designation  : "+A.getDesig());
		System.out.println("Salary       : "+A.calSalary());	
	}
	
	public static void output3(researchAssistant A)
	{
		System.out.println("\nResearch Assistant Details");
		System.out.println("Name         : "+A.getName());
		System.out.println("Address      : "+A.getAddress());
		System.out.println("Course       : "+A.getCourse());	
		System.out.println("Project      : "+A.getProject());
		System.out.println("GPA          : "+A.calcGPA());
		System.out.println("Salary       : "+A.calSalary());	
	}	
}

/*
Output:
Enter
1.Employee
2.Faculty
3.Research Assistant
0.exit
1
Name : a
Address : qwert
Department : cse
Employee id : 12
Basic : 12345

Employee Details
Name         : a
Address      : qwert
Employee id  : 12
Department   : cse
Salary       : 9505.65

Enter
1.To change department
2.To change basic pay
3.To change address
0.To proceed
1
Enter the new dept :bme

Enter
1.To change department
2.To change basic pay
3.To change address
0.To proceed
2
Enter the new basic pay :123

Enter
1.To change department
2.To change basic pay
3.To change address
0.To proceed
3
Enter the new Address :qwer

Enter
1.To change department
2.To change basic pay
3.To change address
0.To proceed
0

Employee Details
Name         : a
Address      : qwer
Employee id  : 12
Department   : bme
Salary       : 94.71000000000002

Enter
1.Employee
2.Faculty
3.Research Assistant
0.exit
2
Enter
1.Employee
2.Faculty
3.Research Assistant
0.exit
2
Name : b
Address : adfasdf
Department : civil
Employee id : 32
Basic : 6000
Designation : pro
Course : eng

Faculty Details
Name         : b
Address      : adfasdf
Course       : eng
Designation  : pro
Salary       : 7700.0

Enter
1.To change designation
2.To change course
3.To change address
0.To proceed
1
Enter the new designation :asspro

Enter
1.To change designation
2.To change course
3.To change address
0.To proceed
2
Enter the new course :math

Enter
1.To change designation
2.To change course
3.To change address
0.To proceed
0

Faculty Details
Name         : b
Address      : adfasdf
Course       : math
Designation  : asspro
Salary       : 7700.0

Enter
1.Employee
2.Faculty
3.Research Assistant
0.exit
3

Enter
1.Employee
2.Faculty
3.Research Assistant
0.exit
3
Name : c
Address : sdf
Department : mech
Employee id : 34
Basic : 10000
Project : queue
Course : fluid
Enter the marks
98
99
97

Research Assistant Details
Name         : c
Address      : sdf
Course       : fluid
Project      : queue
GPA          : 9.8
Salary       : 7700.0

Enter
1.To change course
2.To change address
0.To proceed
0

Research Assistant Details
Name         : c
Address      : sdf
Course       : fluid
Project      : queue
GPA          : 9.8
Salary       : 7700.0

Enter
1.Employee
2.Faculty
3.Research Assistant
0.exit
0
*/

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
	public double getArea()
	{
		return (3.14*radius*radius);
	}
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
