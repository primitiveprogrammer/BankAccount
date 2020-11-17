/**
 * 
 */
package edu.gsu.csc1302.bankaccount;

/**
 * @author Patrick Copeland
 * @version 09/15/2020
 */
public class BankAccountClient 
{

	public static void main(String[] args) 
	{
		//object B1
		BankAccount B1 = new BankAccount("Bill", 40.00);
		B1.deposit(500);
		System.out.println(B1);
		
		B1.withdraw(300);
		System.out.println(B1);
		
		//object B2
		BankAccount B2 = new BankAccount();
		System.out.println(B2);
		
		B2.SetName("Mark");
		B2.SetBalance(600.00);
		System.out.println(B2);
		
	}

}
