/**
 * 
 */
package com.accountdetails;

/**
 * @author manu
 *
 */
public class StudentLoans implements Loantypes{
	private double loanamout;
	private double intrestrate=0.03;
	/**
	 * @param loanamout
	 */
	public StudentLoans()
	{
		
	}
	public StudentLoans(double loanamout) {
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
