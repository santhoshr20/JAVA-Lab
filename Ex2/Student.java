//Student marks
import java.util.Scanner;
class Details
{
	public String name,dept;
	public int regno;
	public float m1,m2,m3,m4,m5,total;
	public char grade;
	
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\nEnter Name : ");
		name=scan.nextLine();
		System.out.print("\nEnter department (bio,cse,arts) : ");
		dept=scan.nextLine();
		System.out.print("\nEnter Register Number : ");
		regno=scan.nextInt();
		System.out.print("\nEnter marks(m1 m2 m3 m4 m5) :");
		m1=scan.nextFloat();
		m2=scan.nextFloat();
		m3=scan.nextFloat();
		m4=scan.nextFloat();
		m5=scan.nextFloat();
	}
	
	public void grade()
	{
		total=m1+m2+m3+m4+m5;
		if(total>=400)
			grade='A';
		else if(total>=300)
			grade='B';
		else if(total>=200)
			grade='C';
		else if(total>=200)
			grade='D';
		else if(total>=100)
			grade='E';
		else
			grade='F';
	}
}

public class Student
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Details A[]=new Details [100];
		int i;
		for(i=0;i<100;i++)
			A[i]=new Details();
		char ch='Y';
		i=0;
		while(ch=='Y')
		{
			A[i].input();
			A[i].grade();
			System.out.print("Do you want to continue(Y/N) : ");
			ch=scan.next().charAt(0);
			i++;
		}
		int count=i+1;
		System.out.print("\nSearch\n1.By id\n2.By department\n");
		int choice=scan.nextInt();
		switch(choice)
		{
			case 1:
			{
				System.out.print("\nEnter id to search : ");
				int id =scan.nextInt();
				search(A,id,count);
				break;
			}
			case 2:
			{
				System.out.print("\nEnter Department to search : ");
				scan.nextLine();
				String d =scan.nextLine();
				search(A,d,count);	
				break;
			}
			default:
				System.out.println("Invalid input ");
				break;
		}
	}
	public static void search(Details A[],int reg,int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(A[i].regno==reg)
			{
				count=1;
				System.out.println("\nName : "+A[i].name);
				System.out.println("Register number : "+A[i].regno);
				System.out.println("Department : "+A[i].dept);
				System.out.println("Total : "+A[i].total);
				System.out.println("Grade : "+A[i].grade);
				break;
			}
		}
		if(count==0)
			System.out.println("Student not found");
	}
	
	public  static void search(Details A[],String d,int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(d.equals(A[i].dept))
			{
				count=1;
				System.out.println("\nName : "+A[i].name);
				System.out.println("Register number : "+A[i].regno);
				System.out.println("Department : "+A[i].dept);
				System.out.println("Total : "+A[i].total);
				System.out.println("Grade : "+A[i].grade);
			}
		}
		if(count==0)
			System.out.println("Student not found");
	}
}

/*
Output:
Enter Name : sree

Enter department (bio,cse,arts) : cse

Enter Register Number : 100

Enter marks(m1 m2 m3 m4 m5) :98 97 96 95 94
Do you want to continue(Y/N) : Y

Enter Name : amit

Enter department (bio,cse,arts) : cse

Enter Register Number : 101

Enter marks(m1 m2 m3 m4 m5) :89 88 87 86 85
Do you want to continue(Y/N) : N

Search
1.By id
2.By department
2

Enter Department to search : cse

Name : sree
Register number : 100
Department : cse
Total : 480.0
Grade : A

Name : amit
Register number : 101
Department : cse
Total : 435.0
Grade : A
*/