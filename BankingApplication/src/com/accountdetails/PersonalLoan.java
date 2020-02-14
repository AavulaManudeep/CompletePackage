/**
 * 
 */
package com.accountdetails;

/**
 * @author manu
 *
 */
public class PersonalLoan implements Loantypes {
	private double loanamout=0;
	private double intrestrate = 0.1;
	/* (non-Javadoc)
	 * @see com.accountdetails.Loantypes#payloan(double)
	 */
	public PersonalLoan() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double payloan(double loanpayment) {
		// TODO Auto-generated method stub
		return loanamout-=loanpayment;
	}

	/**
	 * @param loanamout
	 */
	public PersonalLoan(double loanamout) {
		super();
		this.loanamout += (loanamout*intrestrate)+loanamout;
		
		
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
