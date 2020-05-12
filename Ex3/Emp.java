//Employee

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
	

	
