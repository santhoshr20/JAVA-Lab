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
