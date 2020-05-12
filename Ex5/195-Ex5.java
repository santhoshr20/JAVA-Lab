//1.Packake currency converter

package myPack;

public class currConverter
{
	public void currency(double x,int ch)
	{
		switch(ch)
		{
			case 1:
				System.out.println("$ "+x);
				x=x*71.71;
				System.out.println("Rs "+x);
				break;
			case 2:
				System.out.println("E "+x);
				x=x*79.39;
				System.out.println("Rs "+x);
				break;
			case 3:
				System.out.println("Y "+x);
				x=x*0.67;
				System.out.println("Rs "+x);
				break;
			case 4:
				System.out.println("Rs "+x);
				x=x/71.71;
				System.out.println("$ "+x);
				break;
			case 5:
				System.out.println("Rs "+x);
				x=x/79.39;
				System.out.println("E "+x);
				break;	
			case 6:
				System.out.println("Rs "+x);
				x=x/0.67;
				System.out.println("Y "+x);
				break;
			default:
				System.out.println("Invalid Input");
		}

	}
}

import myPack.currConverter;
import java.util.Scanner;

public class Convert
{
	public static void main(String args[])
	{
		currConverter A = new 	currConverter();
		int i=1;
		Scanner scan=new Scanner(System.in);
		while(i!=0)
		{
			System.out.println("\nEnter\n1.Dollar to Inr\n2.Euro to Inr\n3.Yen to Inr\n4.Inr to Dollar\n5.Inr to Euro\n6.Inr to Yen\n0.Exit");
			i=scan.nextInt();
			try{
			if(i!=0)
			{
				System.out.print("\nEnter the value :");
				String temp = scan.next();
				double x=Double.parseDouble(temp);
				A.currency(x,i);
			}
			else
				break;
			}
			catch (NumberFormatException e)
			{
				System.out.println("Enter the number in valid format");
			}
		}	
		System.out.println("Thank You");
	}
}

/*
Output:

Enter
1.Dollar to Inr
2.Euro to Inr
3.Yen to Inr
4.Inr to Dollar
5.Inr to Euro
6.Inr to Yen
0.Exit
1

Enter the value :3
$ 3.0
Rs 215.13

Enter
1.Dollar to Inr
2.Euro to Inr
3.Yen to Inr
4.Inr to Dollar
5.Inr to Euro
6.Inr to Yen
0.Exit
2

Enter the value :3
E 3.0
Rs 238.17000000000002

Enter
1.Dollar to Inr
2.Euro to Inr
3.Yen to Inr
4.Inr to Dollar
5.Inr to Euro
6.Inr to Yen
0.Exit
3

Enter the value :3
Y 3.0
Rs 2.0100000000000002

Enter
1.Dollar to Inr
2.Euro to Inr
3.Yen to Inr
4.Inr to Dollar
5.Inr to Euro
6.Inr to Yen
0.Exit
4

Enter the value :3
Rs 3.0
$ 0.0418351694324362

Enter
1.Dollar to Inr
2.Euro to Inr
3.Yen to Inr
4.Inr to Dollar
5.Inr to Euro
6.Inr to Yen
0.Exit
5

Enter the value :3
Rs 3.0
E 0.03778813452575891

Enter
1.Dollar to Inr
2.Euro to Inr
3.Yen to Inr
4.Inr to Dollar
5.Inr to Euro
6.Inr to Yen
0.Exit
6

Enter the value :3
Rs 3.0
Y 4.477611940298507

Enter
1.Dollar to Inr
2.Euro to Inr
3.Yen to Inr
4.Inr to Dollar
5.Inr to Euro
6.Inr to Yen
0.Exit
1

Enter the value :qwerty
Enter the number in valid format

Enter
1.Dollar to Inr
2.Euro to Inr
3.Yen to Inr
4.Inr to Dollar
5.Inr to Euro
6.Inr to Yen
0.Exit
0
Thank You
*/


//2.Bank Account

import java.util.Scanner;

class NotEnougMoneyInAccountException extends Exception
{		
	public String toString()
	{
		return "NotEnougMoneyInAccountException";
	}
}

class MinBalRequiredException extends Exception
{
	public String toString()
	{
		return "MinBalRequiredException";
	}
}
class PANRequiredException extends Exception
{
	public String toString()
	{
		return "PANRequiredException";
	}
}
class AccountNotFoundException extends Exception
{
	public String toString()
	{
		return "AccountNotFoundException";
	}
}

class Account
{
	private String cname,branch;
	private int pan,accno;
	private double balance;
	
	Account(String name,int pan,int accno,String branch,double balance)
	{
		cname=name;
		this.pan=pan;
		this.accno=accno;
		this.branch=branch;
		this.balance=balance;
	}
	
	public String getName()
	{
		return cname;
	}
	
	public String getBranch()
	{
		return branch;
	}
		
	public int getPan()
	{
		return pan;
	}
		
	public int getAccno()
	{
		return accno;
	}
		
	public double getBalance()
	{
		return balance;
	}
	
	void deposit(int accno,double amt) throws PANRequiredException
	{
		if(this.accno==accno)
		{
			if(amt>50000)
				throw new PANRequiredException();
			else
				balance=balance+amt;
		}
	}	
	
	void widthdraw(int accno,double amt) throws NotEnougMoneyInAccountException, MinBalRequiredException
	{
		if(this.accno==accno)
		{
			if(5000>balance-amt && balance-amt>0)
			{
				throw new MinBalRequiredException();
			}
			else
			{
				balance=balance-amt;
			}
			if(amt>balance)
			{
				throw new NotEnougMoneyInAccountException();
			}
		}
	}
}

public class Bank
{
	public static int n;
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("\nEnter the number of account");
		n=scan.nextInt();
		Account[] A=new Account[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("\nEnter the Account "+i+"details");
			String name,branch;
			int pan,accno;
			double balance;
			
			System.out.println("\nEnter");
			System.out.print("Name :");
			scan.nextLine();
			name=scan.nextLine();
			
			System.out.print("Branch :");
			branch=scan.nextLine();
		
			System.out.print("Account No. :");
			accno=scan.nextInt();
			
			System.out.print("Pan :");
			pan=scan.nextInt();
			
			System.out.print("Balance :");
			balance=scan.nextDouble();
			
			A[i]=new Account(name,pan,accno,branch,balance);
		}
		
		int ch=1;
		while(ch!=0)
		{
			
			System.out.println("\nEnter\n1.Deposit\n2.Widthdraw\n3.Search\n4.Display\n0.Exit");
			ch=scan.nextInt();
			switch(ch)
			{
				case 1:
				{
					int a;
					double b;
					System.out.print("Enter account number : ");
					a=scan.nextInt();
					
					System.out.print("Enter amount : ");
					b=scan.nextDouble();
					try{
					for(int i=0;i<n;i++)
					{
						if(A[i].getAccno()==a)
							A[i].deposit(a,b);
					}}
					catch (PANRequiredException e)
					{
						System.out.println("\nCaught " + e);
					}	
					break;
				}
				
				case 2:
				{
					int a;
					double b;
					System.out.print("Enter account number : ");
					a=scan.nextInt();
					
					System.out.print("Enter amount : ");
					b=scan.nextDouble();
					try{
					for(int i=0;i<n;i++)
					{
						if(A[i].getAccno()==a)
							A[i].widthdraw(a,b);
					}}
					catch (NotEnougMoneyInAccountException e)
					{
						System.out.println("\nCaught " + e);
					}
					catch (MinBalRequiredException e)
					{
						System.out.println("\nCaught " + e);
					}
					break;
				}
				
				case 3:
				{
					int a;
					System.out.println("Enter account number to search: ");
					a=scan.nextInt();
					try{
					search(A,a);
					}
					catch (AccountNotFoundException e)
					{
						System.out.println("\nCaught " + e);
					}
					break;
				}
				
				case 4:
				{
					for(int i=0;i<n;i++)
					{
						output(A[i]);
					}
					break;
				}
				case 0:
				{
					System.out.println("Thank You");
					break;
				}
			}
		}
	}
	
	public static void search(Account[] A,int a) throws  AccountNotFoundException
	{
		for(int i=0;i<n;i++)
		{
			if(A[i].getAccno()==a)
			{
				output(A[i]);
				break;
			}
			else
			{
				throw new AccountNotFoundException();
			}
		}
	}
	
	public static void output(Account A)
	{
		System.out.println("\nName           : "+A.getName());
		System.out.println("Account No.    : "+A.getAccno());
		System.out.println("Pan            : "+A.getPan());
		System.out.println("Branch         : "+A.getBranch());
		System.out.println("Balance        : "+A.getBalance());
	}
}

/*
Output:
Enter the number of account
2

Enter the Account 0details

Enter
Name :a
Branch :chennai
Account No. :1001
Pan :1234
Balance :1000

Enter the Account 1details

Enter
Name :b
Branch :erode
Account No. :1002
Pan :98765
Balance :50000

Enter
1.Deposit
2.Widthdraw
3.Search
4.Display
0.Exit
1
Enter account number : 1001
Enter amount : 6000

Enter
1.Deposit
2.Widthdraw
3.Search
4.Display
0.Exit
4

Name           : a
Account No.    : 1001
Pan            : 1234
Branch         : chennai
Balance        : 7000.0

Name           : b
Account No.    : 1002
Pan            : 98765
Branch         : erode
Balance        : 50000.0

Enter
1.Deposit
2.Widthdraw
3.Search
4.Display
0.Exit
2
Enter account number : 1001
Enter amount : 5000

Caught MinBalRequiredException

Enter
1.Deposit
2.Widthdraw
3.Search
4.Display
0.Exit
4

Name           : a
Account No.    : 1001
Pan            : 1234
Branch         : chennai
Balance        : 7000.0

Name           : b
Account No.    : 1002
Pan            : 98765
Branch         : erode
Balance        : 50000.0

Enter
1.Deposit
2.Widthdraw
3.Search
4.Display
0.Exit
1
Enter account number : 1001
Enter amount : 50001

Caught PANRequiredException

Enter
1.Deposit
2.Widthdraw
3.Search
4.Display
0.Exit
4

Name           : a
Account No.    : 1001
Pan            : 1234
Branch         : chennai
Balance        : 7000.0

Name           : b
Account No.    : 1002
Pan            : 98765
Branch         : erode
Balance        : 50000.0

Enter
1.Deposit
2.Widthdraw
3.Search
4.Display
0.Exit
3
Enter account number to search:
111

Caught AccountNotFoundException

Enter
1.Deposit
2.Widthdraw
3.Search
4.Display
0.Exit
2
Enter account number : 1002
Enter amount : 60000

Caught NotEnougMoneyInAccountException

Enter
1.Deposit
2.Widthdraw
3.Search
4.Display
0.Exit
0
Thank You
*/
