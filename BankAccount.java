/**
 * 
 */
package edu.gsu.csc1302.bankaccount;

/**
 * @author Patrick Copeland
 * @version 09/15/2020
 */
public class BankAccount 
{
	private String name;
	private double balance;
	
	//constructor
	public BankAccount(String name, double balance)
	{
		this.name = name;
		this.balance = balance;
	}
	
	public BankAccount() 
	{
		//stub
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	public void withdraw(double amount)
	{
		if(amount <= balance)
		{
			balance = balance - amount;
		}
	}
	
	@Override
	public String toString()
	{
		return this.name + ", $" + String.format("%.2f", balance);
	}
	
	//name access
	public String GetName()
	{
		return this.name;
	}
	
	//name mutator
	public void SetName(String name)
	{
		if(name != null)
		{
			this.name = name;
		}
	}
	
	//balance access
	public double GetBalance()
	{
		return this.balance;
	}
	
	//balance mutator
	public void SetBalance(double balance)
	{
		if(balance >= 0)
		{
			this.balance = balance;
		}
	}

}
