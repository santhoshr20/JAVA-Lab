/*Employee Salary */

import java.util.Scanner;
class Date
{
	int d,m,y;
}

class Employee
{
	public int id;
	public String name,designation;
	public Date Dob=new Date();
	public Date Doj=new Date();
	public double basic,da,hra,lic,pf,workHrs,grossSalary,netSalary,deduction;
	public void input()
	{	
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter\nName : ");
		name=scan.nextLine();
		System.out.print("Id : ");
		id=scan.nextInt();
		System.out.print("Designation (Intern,Manager,Others-Trainee, Analyst, Software engineer, TeamLead): ");
		scan.nextLine();
		designation = scan.nextLine();
		System.out.print("DOB (dd mm yyyy) : ");
		Dob.d=scan.nextInt();
		Dob.m=scan.nextInt();
		Dob.y=scan.nextInt();
		System.out.print("DOJ (dd mm yyyy) : ");
		Doj.d=scan.nextInt();
		Doj.m=scan.nextInt();
		Doj.y=scan.nextInt();
		System.out.print("Working hours : ");
		workHrs=scan.nextDouble();
	}
	
	public void calc()
	{
		Scanner scan=new Scanner(System.in);
		if(designation.equals("Intern"))
		{
			da=2000;
			hra=1000;
			double wage = 100;
			pf=500;
			System.out.print("Enter Lic amount: ");
			lic=scan.nextDouble();
			grossSalary=(workHrs*wage)+da+hra;
			deduction=lic+pf;
			netSalary=grossSalary-deduction;
		}
		else if(designation.equals("Manager"))
		{
			System.out.print("Enter Basic pay : ");	
			basic=scan.nextDouble();
			da=0.4*basic;
			hra=0.1*basic;
			pf=0.08*basic;
			System.out.print("Enter Lic amount: ");
			lic=scan.nextDouble();
			grossSalary=basic+da+hra;
			deduction=lic+pf;
			netSalary=grossSalary-deduction;
		}
		else
		{
			System.out.print("Enter Basic pay : ");	
			basic=scan.nextDouble();
			da=0.3*basic;
			hra=0.1*basic;
			pf=0.08*basic;
			System.out.print("Enter Lic amount: ");
			lic=scan.nextDouble();
			grossSalary=basic+da+hra;
			deduction=lic+pf;
			netSalary=grossSalary-deduction;
		}
	}		
}

public class Salary
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Employee A[]=new Employee[100];
		char ch='Y';
		int i=0,count;
		for(i=0;i<100;i++)
			A[i]=new Employee();
		i=0;
		while(ch=='Y')
		{	
			A[i].input();
			A[i].calc();
			i++;
			System.out.print("Do you want to continue (Y/N) : ");
			ch=scan.next().charAt(0);
		}
		count=i;
		int choice=1;
		while(choice!=4)
		{
			System.out.print("\n\n1.Display Payroll of all employees\n2.Display salary details of 1 employee\n3.Check for promotion\n4.To exit\n");
			choice=scan.nextInt();
			switch(choice)
			{
				case 1:
				{
					for(i=0;i<count;i++)
					{
						System.out.println("Employee name : "+A[i].name);
						System.out.println("Employee id : "+A[i].id);
						System.out.println("Net salary :Rs. "+A[i].netSalary);
						System.out.println();
					}
					break;
				}
				case 2:
				{
					System.out.print("Enter the employee id to find:");
					int idno=scan.nextInt();
					int c=0;
					for(i=0;i<count;i++)
					{
						if(A[i].id==idno)
						{
							c=1;
							System.out.println("Employee name :"+A[i].name);
							System.out.println("Employee id :"+A[i].id);
							System.out.println("Gross Salary :RS. "+A[i].grossSalary);
							System.out.println("Deduction :Rs. "+A[i].deduction);
							System.out.println("Net salary :Rs. "+A[i].netSalary);
							System.out.println();
							break;
						}
					}
					if(c==0)
						System.out.println("Employee not found ");
					break;
				}
				case 3:
				{
					System.out.print("Enter the employee id to check:");
					int idno=scan.nextInt();
					int c=0;
					for(i=0;i<count;i++)
					{
						if(A[i].id==idno)	
						{
							c=1;
							if((2019-A[i].Doj.y)>=10)
							{
								if(A[i].designation.equals("Others"))
								{
									A[i].designation = "Manager";
									System.out.println("You are promoted to manager\n");
								}
								else	
									System.out.println("Eligible for promotion");
							}
							else
								System.out.println("Not Eligible for promotion");
						}
					}
					if(c==0)
						System.out.println("Employee not found");
					break;
				}
				case 4:
					System.out.println("Thank you\n\n");
					break;
				default:
					System.out.println("Invalid input");
			}	
		}
	}
}
			
			
/*
Output:
Enter
Name : Sree
Id : 100
Designation (Intern,Manager,Others-Trainee, Analyst, Software engineer, TeamLead): Intern
DOB (dd mm yyyy) : 03 04 2000
DOJ (dd mm yyyy) : 06 08 2010
Working hours : 45
Enter Lic amount: 1000
Do you want to continue (Y/N) : Y

Enter
Name : Amit
Id : 101
Designation (Intern,Manager,Others-Trainee, Analyst, Software engineer, TeamLead): Manager
DOB (dd mm yyyy) : 12 05 2001
DOJ (dd mm yyyy) : 23 11 2008
Working hours : 48
Enter Basic pay : 15000
Enter Lic amount: 1000
Do you want to continue (Y/N) : Y

Enter
Name : Satish
Id : 202
Designation (Intern,Manager,Others-Trainee, Analyst, Software engineer, TeamLead): Others
DOB (dd mm yyyy) : 21 12 2000
DOJ (dd mm yyyy) : 02 05 2007
Working hours : 50
Enter Basic pay : 17000
Enter Lic amount: 1000
Do you want to continue (Y/N) : N


1.Display Payroll of all employees
2.Display salary details of 1 employee
3.Check for promotion
4.To exit
1
Employee name : Sree
Employee id : 100
Net salary :Rs. 6000

Employee name : Amit
Employee id : 101
Net salary :Rs. 20300.0

Employee name : Satish
Employee id : 202
Net salary :Rs. 21440.0

1.Display Payroll of all employees
2.Display salary details of 1 employee
3.Check for promotion
4.To exit
2
Enter the employee id to find:100
Employee name :Sree
Employee id :100
Gross Salary :RS. 7500.0
Deduction :Rs. 1500
Net salary :Rs. 6000

1.Display Payroll of all employees
2.Display salary details of 1 employee
3.Check for promotion
4.To exit
3
Enter the employee id to check:100
Not Eligible for promotion

*/	
		
	
	
