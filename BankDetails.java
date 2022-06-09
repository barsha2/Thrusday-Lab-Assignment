package Oops;

import java.util.Scanner;

class Users 
{
	int accNo;
	String accHName;
	long balance;
	String accType;


public Users(int accNo, String accHName, long balance, String accType)
{
	this.accNo=accNo;
	this.accHName= accHName; // constructor object creation
	this.balance=balance;
	this.accType=accType;
}
public void withdraw(int amount) // method for withdraw function
{
	if(this.balance<amount)
	{
		System.out.println("Invalid Transaction");
	}
	else
	{
		System.out.println("Your account balance is now " + (balance-amount));
	}
}
public void deposit(int amt) //method for deposit function
{
	
	this.balance = balance+amt;
	System.out.println("The current balance is " + this.balance);
}
public void CheckAcc() //method for balance checking function
{
	
	System.out.println("Your current balance is "+this.balance);
}


@Override
public String toString() {
	return "Users [accNo=" + accNo + ", accHName=" + accHName + ", balance=" + balance + ", accType=" + accType + "]";
}

}
public class BankDetails 
{
		public static void main(String args[])
	{
		Users user= new Users(54321, "Barsha Podder", 50000, "Savings" );
		System.out.println(user);
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1.for Withdraw\n2.for Deposit\n"
		+ "3.for Check Balance\n");
		System.out.println("Enter your choice!");
		choice=sc.nextInt();
		switch(choice) //switch case
		{
		case 1:
			int amount;
		 System.out.println("Enter amount you want to withdraw: ");
		 amount = sc.nextInt();
		 user.withdraw( amount);
		 break;
		case 2:
			int amt;
			System.out.println("Enter amount you want to deposit ");
			amt=sc.nextInt();
			user.deposit(amt);
		break;
		case 3:user.CheckAcc();
		break;
		
		default: System.out.println("wrong choice");
		}
	}
}
