/**
 * 
 */
package com.accountdetails;

/**
 * @author manu
 *
 */
public class SavingsAccount implements Accountstype{

	private double balance;
	@Override
	public double deposit(double dip) {
		// TODO Auto-generated method stub
		return balance+=dip;
	}

	@Override
	public double withdrawl(double draw) {
		// TODO Auto-generated method stub
		if(balance-draw <0)
		{
			System.out.println("You cant the amount you would like to draw because you insuffiecient Funds in your Account");
			return 0;
		}
		else 
		{
			return balance-=draw;
		}
	}

	@Override
	public double currentbalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	public double interestcalculation(double rate)
	{
		double interest = rate*balance;
		
		return balance+=interest;
	}

	/**
	 * @param balance
	 */
	public SavingsAccount(double balance) {
		super();
		this.balance = balance;
	}


}
