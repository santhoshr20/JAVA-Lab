//1.Box Volume
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



//2.Employee

import java.util.Scanner;
import java.util.Scanner;

class Employee
{	
	String emp_name,address,mail_id,mobile_no;
	int emp_id;
}

class Programmer extends Employee
{
	public double basic,da,hra,pf,fund,grossSalary,netSalary,deduction;
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Name : ");
		emp_name=scan.nextLine();
		System.out.print("Adderss : ");
		address=scan.nextLine();
		System.out.print("Mail id : ");
		mail_id=scan.nextLine();
		System.out.print("Mobile no. : ");
		mobile_no=scan.nextLine();
		System.out.print("ID : ");
		emp_id=scan.nextInt();
		System.out.print("Basic pay : ");
		basic=scan.nextDouble();
	}
	
	public void calc()
	{
		da=0.97*basic;
		hra=0.01*basic;
		pf=0.12*basic;
		fund=0.01*basic;
		grossSalary=da+hra;
		deduction=fund+pf;
		netSalary=grossSalary-deduction;
	}
	
	public void output()
	{
		if(basic!=0)
		{
			System.out.print("\nName : "+emp_name);
			System.out.print("\nId : "+emp_id);
			System.out.print("\nDesignation : Programmer ");
			System.out.print("\nGross Pay : "+grossSalary);
			System.out.print("\nNet Salary : "+netSalary);
			System.out.println();
		}
	}
		
}                 

class assistantProfessor extends Employee
{
	public double basic,da,hra,lic,pf,fund,grossSalary,netSalary,deduction;
		public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Name : ");
		emp_name=scan.nextLine();
		System.out.print("Adderss : ");
		address=scan.nextLine();
		System.out.print("Mail id : ");
		mail_id=scan.nextLine();
		System.out.print("Mobile no. : ");
		mobile_no=scan.nextLine();
		System.out.print("ID : ");
		emp_id=scan.nextInt();
		System.out.print("Basic pay : ");
		basic=scan.nextDouble();
	}
	
	public void calc()
	{
		da=0.97*basic;
		hra=0.01*basic;
		pf=0.12*basic;
		fund=0.01*basic;
		grossSalary=da+hra;
		deduction=fund+pf;
		netSalary=grossSalary-deduction;
	}
	
	public void output()
	{
		if(basic!=0)
		{
			System.out.print("\nName : "+emp_name);
			System.out.print("\nId : "+emp_id);
			System.out.print("\nDesignation : Assistant Professor ");
			System.out.print("\nGross Pay : "+grossSalary);
			System.out.print("\nNet Salary : "+netSalary);
			System.out.println();
		}
	}
}

class associateProfessor extends Employee
{
	public double basic,da,hra,lic,pf,fund,grossSalary,netSalary,deduction;
		public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Name : ");
		emp_name=scan.nextLine();
		System.out.print("Adderss : ");
		address=scan.nextLine();
		System.out.print("Mail id : ");
		mail_id=scan.nextLine();
		System.out.print("Mobile no. : ");
		mobile_no=scan.nextLine();
		System.out.print("ID : ");
		emp_id=scan.nextInt();
		System.out.print("Basic pay : ");
		basic=scan.nextDouble();
	}
	
	public void calc()
	{
		da=0.97*basic;
		hra=0.01*basic;
		pf=0.12*basic;
		fund=0.01*basic;
		grossSalary=da+hra;
		deduction=fund+pf;
		netSalary=grossSalary-deduction;
	}
	
	public void output()
	{
		if(basic!=0)
		{
			System.out.print("\nName : "+emp_name);
			System.out.print("\nId : "+emp_id);
			System.out.print("\nDesignation : Associatr Professor");
			System.out.print("\nGross Pay : "+grossSalary);
			System.out.print("\nNet Salary : "+netSalary);
			System.out.println();
		}
	}
}

class Professor extends Employee
{
	public double basic,da,hra,lic,pf,fund,grossSalary,netSalary,deduction;
		public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Name : ");
		emp_name=scan.nextLine();
		System.out.print("Adderss : ");
		address=scan.nextLine();
		System.out.print("Mail id : ");
		mail_id=scan.nextLine();
		System.out.print("Mobile no. : ");
		mobile_no=scan.nextLine();
		System.out.print("ID : ");
		emp_id=scan.nextInt();
		System.out.print("Basic pay : ");
		basic=scan.nextDouble();
	}
	
	public void calc()
	{
		da=0.97*basic;
		hra=0.01*basic;
		pf=0.12*basic;
		fund=0.01*basic;
		grossSalary=da+hra;
		deduction=fund+pf;
		netSalary=grossSalary-deduction;
	}
	
	public void output()
	{
		if(basic!=0)
		{
			System.out.print("\nName : "+emp_name);
			System.out.print("\nId : "+emp_id);
			System.out.print("\nDesignation : Professor ");
			System.out.print("\nGross Pay : "+grossSalary);
			System.out.print("\nNet Salary : "+netSalary);
			System.out.println();
		}
	}
}

public class Emp
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Programmer A=new Programmer();
		assistantProfessor B= new assistantProfessor();
		associateProfessor C=new associateProfessor();
		Professor D=new Professor();
		A.basic=0;
		B.basic=0;
		C.basic=0;
		D.basic=0;
		int ch=1;
		while(ch!=6)
		{
			System.out.print("\nEnter\n1.Programmer\n2.Assistant Professor\n3.Associate Professor\n4.Professor\n5.Pay Slip\n6.Exit\n");
			ch=scan.nextInt();
			switch(ch)
			{
				case 1:
					A.input();
					A.calc();
					break;
				case 2:
					B.input();
					B.calc();
					break;
				case 3:
					C.input();
					C.calc();
					break;
				case 4:
					D.input();
					D.calc();
					break;
				case 5:
					A.output();
					B.output();
					C.output();
					D.output();
					break;
				case 6:
					System.out.println("\nThank you");
					break;
				default:
					System.out.println("Invalid input\n");
			}
		}
	}
}
	
/*
Output:
Enter
1.Programmer
2.Assistant Professor
3.Associate Professor
4.Professor
5.Pay Slip
6.Exit
1
Name : Sree
Adderss : abc
Mail id : sree@gamil.com
Mobile no. : 1234567889
ID : 1
Basic pay : 10000

Enter
1.Programmer
2.Assistant Professor
3.Associate Professor
4.Professor
5.Pay Slip
6.Exit
2
Name : Amith
Adderss : def
Mail id : amithbahvani@gamil.com
Mobile no. : 0987654323
ID : 2
Basic pay : 12000

Enter
1.Programmer
2.Assistant Professor
3.Associate Professor
4.Professor
5.Pay Slip
6.Exit
5

Name : Sree
Id : 1
Designation : Programmer
Gross Pay : 9800.0
Net Salary : 8500.0

Name : Amith
Id : 2
Designation : Assistant Professor
Gross Pay : 11760.0
Net Salary : 10200.0

Enter
1.Programmer
2.Assistant Professor
3.Associate Professor
4.Professor
5.Pay Slip
6.Exit
4
Name : Cheenu
Adderss : hyg
Mail id : cheenu@gmai.com
Mobile no. : 4283713871
ID : 3
Basic pay : 15000

Enter
1.Programmer
2.Assistant Professor
3.Associate Professor
4.Professor
5.Pay Slip
6.Exit
5

Name : Sree
Id : 1
Designation : Programmer
Gross Pay : 9800.0
Net Salary : 8500.0

Name : Amith
Id : 2
Designation : Assistant Professor
Gross Pay : 11760.0
Net Salary : 10200.0

Name : Cheenu
Id : 3
Designation : Professor
Gross Pay : 14700.0
Net Salary : 12750.0

Enter
1.Programmer
2.Assistant Professor
3.Associate Professor
4.Professor
5.Pay Slip
6.Exit
6

Thank you
*/
	
	
//3.Person class
import java.util.Scanner;

class Date
{
	int d,m,y;
}

abstract class Person
{
	String name, address;
	int age;
	Date DOB = new Date();
	abstract void getInput();
	abstract void calcPerformance();
	abstract void output();
}
	
class Student extends Person
{
	String department,performance;
	double m1,m2,m3,total;
	int extra;
	char grade;
	
	void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("\nEnter");
		System.out.print("Name : ");
		name=scan.nextLine();
		System.out.print("Age  : ");
		age=scan.nextInt();
		
		System.out.print("DOB (dd mm yyyy) : ");
		DOB.d=scan.nextInt();
		DOB.m=scan.nextInt();
		DOB.y=scan.nextInt();
		scan.nextLine();
		System.out.print("Address : ");
		address=scan.nextLine();
		
		System.out.print("Marks (m1 m2 m3): ");
		m1=scan.nextDouble();
		m2=scan.nextDouble();
		m3=scan.nextDouble();
		
		System.out.print("Number of Extra Curricular activities : ");
		extra=scan.nextInt();
	}
	
	void calcPerformance()
	{
		total=m1+m2+m3;
		if(total>=250)
			grade='A';
		else if(total>=200)
			grade='B';
		else if(total>=150)
			grade='C';
		else if(total>=100)
			grade='D';
		else 
			grade='E';
		
		if ((grade == 'A') && (extra>=3))
			performance="Outstanding";
		else if ((grade == 'B') && (extra>=3))
			performance="Excellent";
		else if ((grade == 'C') && (extra>=3))
			performance="Good";
		else 
			performance="Fair";		
	}
	
	void output()
	{
		System.out.println("\nName          :  "+name);
		System.out.println("Class         :  Student");
		System.out.println("Grade         :  "+grade);
		System.out.println("Performance   :  "+performance);
	}
}

class Professor extends Person
{
	String depart,performance;
	int publication,project;
	
	void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("\nEnter");
		System.out.print("Name : ");
		name=scan.nextLine();
		System.out.print("Age  : ");
		age=scan.nextInt();
		
		System.out.print("DOB (dd mm yyyy) : ");
		DOB.d=scan.nextInt();
		DOB.m=scan.nextInt();
		DOB.y=scan.nextInt();
		scan.nextLine();
		System.out.print("Address : ");
		address=scan.nextLine();
		
		System.out.print("Number of publication : ");
		publication=scan.nextInt();
		
		System.out.print("Number of Funded poject : ");
		project=scan.nextInt();
	}
	
	
	void calcPerformance()
	{
		if ((publication>=5) && (project>=3))
			performance="Outstanding";
		else if ((publication>=4) && (project>=2))
			performance="Excellent";
		else if ((publication>=3) && (project>=1))
			performance="Good";
		else 
			performance="Fair";		
	}
	
	void output()
	{
		System.out.println("\nName          :  "+name);
		System.out.println("Class         :  Professor");
		System.out.println("Performance   :  "+performance);
	}
}

public class Calc
{
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		int n;
		System.out.println("\nEnter number of persons : ");
		n=scan.nextInt();
		Student A[]=new Student [n];
		Professor B[]=new Professor [n];
		int ch=1,i,j;
		for(i=0;i<n;i++)
		{
			A[i]=new Student();
			B[i]=new Professor();
		}
		i=-1;
		j=-1;
		int count=0;
		while(count<n)
		{
			count++;
			System.out.print("\nEnter\n1.Student\n2.Professor\n");
			ch=scan.nextInt();
			switch(ch)
			{
				case 1:
				{
					i++;
					A[i].getInput();
					A[i].calcPerformance();
					break;
				}
				case 2:
				{
					j++;
					B[j].getInput();
					B[j].calcPerformance();
					break;
				}
			}
		}	
		System.out.println("\nOutput");
		int t1,t2;
		for(t1=0;t1<=i;t1++)
		{
			A[i].output();
		}
		for(t2=0;t2<=j;t2++)
		{
			B[j].output();
		}
	}
}	

/*
Output:
Enter number of persons :
3

Enter
1.Student
2.Professor
1

Enter
Name : a
Age  : 12
DOB (dd mm yyyy) : 03 04 2005
Address : abcd
Marks (m1 m2 m3): 98 97 96
Number of Extra Curricular activities : 3

Enter
1.Student
2.Professor
2

Enter
Name : b
Age  : 54
DOB (dd mm yyyy) : 04 02 1975
Address : qwerty
Number of publication : 4
Number of Funded poject : 3

Enter
1.Student
2.Professor
1

Enter
Name : c
Age  : 18
DOB (dd mm yyyy) : 03 04 2000
Address : qwer
Marks (m1 m2 m3): 97 98 99
Number of Extra Curricular activities : 1

Enter
1.Student
2.Professor

Output

Name          :  c
Class         :  Student
Grade         :  A
Performance   :  Fair

Name          :  c
Class         :  Student
Grade         :  A
Performance   :  Fair

Name          :  b
Class         :  Professor
Performance   :  Excellent
*/	

	
