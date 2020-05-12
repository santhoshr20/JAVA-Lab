//Person class
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