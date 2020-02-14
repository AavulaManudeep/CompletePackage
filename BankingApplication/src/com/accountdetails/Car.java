/**
 * 
 */
package com.accountdetails;

/**
 * @author manu
 *
 */
public class Car implements Loantypes {

	private double loanamout;
	private double intrestrate=0.04;
	/**
	 * @param loanamout
	 */
	public Car()
	{
		
	}
	public Car(double loanamout) {
		super();
		this.loanamout += (loanamout*intrestrate)+loanamout;
	}

	/* (non-Javadoc)
	 * @see com.accountdetails.Loantypes#payloan(double)
	 */
	@Override
	public double payloan(double loanpayment) {
		// TODO Auto-generated method stub
		return loanamout-=loanpayment;
	}

	/* (non-Javadoc)
	 * @see com.accountdetails.Loantypes#checkloan()
	 */
	@Override
	public double checkloan() {
		// TODO Auto-generated method stub
		return loanamout;
	}

}
