package belajarOOP;

public class Account 
{
	private int accountNumber;
	private double balance = 0;
	
	public Account(int accountNumber, double balance) 
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public Account(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() 
	{
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) 
	{
		this.accountNumber = accountNumber;
	}

	public double getBalance() 
	{
		return balance;
	}

	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	
	public void credit(double amount)
	{
		this.balance += amount;
	}
	
	public void debit(double amount)
	{
		if (this.balance - amount > 0) 
		{
			this.balance -= amount;
		}
		else 
		{
			System.out.println("uang gak cukup");
		}
	}
	
	@Override
	public String toString() 
	{
		
		return "A/C = " + this.accountNumber + "\nbalance = Rp " + this.balance;
	}
	
}
	